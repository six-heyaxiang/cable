package com.cable.bean;

import java.io.Serializable;

public class CableMK implements Serializable {

	private static final long serialVersionUID = -1062871803602932723L;
	private Integer	id;
	private String	mkName;
	private Integer	mkParent;
	private String	mkCaption;
	private Integer	flag;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMkName() {
		return mkName;
	}
	public void setMkName(String mkName) {
		this.mkName = mkName;
	}
	public Integer getMkParent() {
		return mkParent;
	}
	public void setMkParent(Integer mkParent) {
		this.mkParent = mkParent;
	}
	public String getMkCaption() {
		return mkCaption;
	}
	public void setMkCaption(String mkCaption) {
		this.mkCaption = mkCaption;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	
	
}
