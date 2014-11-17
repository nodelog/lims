package com.lims.common.util;

/**
 * 用户角色枚举
 */
public enum Role {
	ＡDMIN("管理员", 0),
	TEACHER("教师", 1),
	STUDENT("学生", 2);
	private String desc;//角色描述，页面显示用
	private int value;//角色的属性值，数据库保存这个值
	private Role(String desc, int value) {
		this.desc = desc;
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
