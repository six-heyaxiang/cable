package com.cable.bean;

import java.io.Serializable;

public class BoxType implements Serializable {

	private static final long serialVersionUID = 3068932911655644970L;
	private Integer boxTypeId;
	private String	boxModel;
	private Integer boxPostNumber;
	private String BoxTypeName;
	public Integer getBoxTypeId() {
		return boxTypeId;
	}
	public void setBoxTypeId(Integer boxTypeId) {
		this.boxTypeId = boxTypeId;
	}
	public String getBoxModel() {
		return boxModel;
	}
	public void setBoxModel(String boxModel) {
		this.boxModel = boxModel;
	}
	public Integer getBoxPostNumber() {
		return boxPostNumber;
	}
	public void setBoxPostNumber(Integer boxPostNumber) {
		this.boxPostNumber = boxPostNumber;
	}
	public String getBoxTypeName() {
		return BoxTypeName;
	}
	public void setBoxTypeName(String boxTypeName) {
		BoxTypeName = boxTypeName;
	}
	
	
}
