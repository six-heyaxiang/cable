package com.cable.bean;

import java.io.Serializable;

public class CableInfo implements Serializable {

	private static final long serialVersionUID = -2459659596096430321L;
	private Integer	cableId;
	private Integer	cableLength;
	private Integer cableNumber;
	private Integer cableSpareNumber;
	private Integer froBoxId;
	private Integer	backBoxId;
	private String	cablePosition;
	public Integer getCableId() {
		return cableId;
	}
	public void setCableId(Integer cableId) {
		this.cableId = cableId;
	}
	public Integer getCableLength() {
		return cableLength;
	}
	public void setCableLength(Integer cableLength) {
		this.cableLength = cableLength;
	}
	public Integer getCableNumber() {
		return cableNumber;
	}
	public void setCableNumber(Integer cableNumber) {
		this.cableNumber = cableNumber;
	}
	public Integer getCableSpareNumber() {
		return cableSpareNumber;
	}
	public void setCableSpareNumber(Integer cableSpareNumber) {
		this.cableSpareNumber = cableSpareNumber;
	}
	public Integer getFroBoxId() {
		return froBoxId;
	}
	public void setFroBoxId(Integer froBoxId) {
		this.froBoxId = froBoxId;
	}
	public Integer getBackBoxId() {
		return backBoxId;
	}
	public void setBackBoxId(Integer backBoxId) {
		this.backBoxId = backBoxId;
	}
	public String getCablePosition() {
		return cablePosition;
	}
	public void setCablePosition(String cablePosition) {
		this.cablePosition = cablePosition;
	}
	
	
}
