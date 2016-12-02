package com.cb.tools;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.cb.annotation.Column;
import com.cb.annotation.Table;

public class ToSQLClass {

	public static String toSQLString(Object object){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("select * from ");
		
		Class c = object.getClass();
		
		Table table = (Table) c.getAnnotation(Table.class);
		
		String tableName = table.value();
		
		sb.append(tableName + " where 1=1");
		
		//获取所有属性
		Field[] fs = c.getDeclaredFields();
		
		for(Field f : fs) {
			
			boolean fExists = f.isAnnotationPresent(Column.class);
			if (!fExists) {
				continue;
			}
			//获取属性类型
			//System.out.println(f.getType());
			//获取属性列名
			String columnName = f.getAnnotation(Column.class).value();
			//获取属性的值
			Object fValue = null;
			String fName = f.getName();
			String getMethodName = "get"+fName.substring(0, 1).toUpperCase()+fName.substring(1);
			try {
				Method getMethod = c.getMethod(getMethodName);
				fValue = (Object) getMethod.invoke(object);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(fValue==null || (fValue instanceof Integer && (Integer)fValue == 0)) {
				continue;
			} 
			sb.append(" and ").append(columnName).append("=");
			if(fValue instanceof String) {
				sb.append("'").append(fValue).append("'");
			} else if (fValue instanceof Integer) {
				sb.append(fValue);
			}
			
			
			
		}
		
		
		return sb.toString();
	}
	
}
