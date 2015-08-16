package com.cable.bean;

import java.io.Serializable;

public class CoreInfo implements Serializable {

	private static final long serialVersionUID = -4719223185332316103L;
	private Integer coreId;
	private Integer	cableId;
	private String	coreNo;
	private String	proPostId;
	private String	backPostId;
	private Integer	proBoxId;
	private Integer	backBoxId;
	private Integer	orbitId;
	public Integer getCoreId() {
		return coreId;
	}
	public void setCoreId(Integer coreId) {
		this.coreId = coreId;
	}
	public Integer getCableId() {
		return cableId;
	}
	public void setCableId(Integer cableId) {
		this.cableId = cableId;
	}
	public String getCoreNo() {
		return coreNo;
	}
	public void setCoreNo(String coreNo) {
		this.coreNo = coreNo;
	}
	public String getProPostId() {
		return proPostId;
	}
	public void setProPostId(String proPostId) {
		this.proPostId = proPostId;
	}
	public String getBackPostId() {
		return backPostId;
	}
	public void setBackPostId(String backPostId) {
		this.backPostId = backPostId;
	}
	public Integer getProBoxId() {
		return proBoxId;
	}
	public void setProBoxId(Integer proBoxId) {
		this.proBoxId = proBoxId;
	}
	public Integer getBackBoxId() {
		return backBoxId;
	}
	public void setBackBoxId(Integer backBoxId) {
		this.backBoxId = backBoxId;
	}
	public Integer getOrbitId() {
		return orbitId;
	}
	public void setOrbitId(Integer orbitId) {
		this.orbitId = orbitId;
	}
	
}
