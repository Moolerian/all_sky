package com.mkyong.editor;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class EditorBean {

	private String value = "salaaaaaaaaaaqfdqefefaaaaaaaaaaaaam";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}