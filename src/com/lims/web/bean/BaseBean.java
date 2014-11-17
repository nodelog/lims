package com.lims.web.bean;

import java.io.Serializable;

public class BaseBean implements Serializable {
	private static final long serialVersionUID = 6446683988697061339L;
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
