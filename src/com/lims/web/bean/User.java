package com.lims.web.bean;

import com.lims.common.util.Role;

public class User extends BaseBean{
	private static final long serialVersionUID = 4583975059296573216L;
	private String username;//用户名，登录使用
	private String realname;//姓名，显示
	private String password;//密码，登录使用
	/**
	 * 角色权限，管理员：０、教师：１、学生：２
	 * @see Role
	 */
	private int role;
	public User(){}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
}
