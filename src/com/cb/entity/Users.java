package com.cb.entity;

import java.io.Serializable;

import com.cb.annotation.Column;
import com.cb.annotation.Table;

@Table("users")
public class Users implements Serializable {
	
	@Column("userid")
    private Integer userid;
	
	@Column("username")
    private String username;
	
	@Column("userpassword")
    private String userpassword;

	@Column("usertel")
    private String usertel;

	@Column("useraddress")
    private String useraddress;

	@Column("userrealname")
    private String userrealname;

	@Column("userstatus")
    private Integer userstatus;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname == null ? null : userrealname.trim();
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }
}