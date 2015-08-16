package com.cable.bean;

import java.io.Serializable;

public class BoxInfo implements Serializable {

	private static final long serialVersionUID = -2358760439585904680L;
	private Integer boxId;
	private String	boxName;
	private Integer	boxTypeId;
	private Integer schematicId;
	private Integer	stationId;
	private Integer	oribitId;
	private String	instruction;
	private Integer layer;
	private Integer	rootId;
	private Integer	depth;
	private Integer	localePhotoId;
	public Integer getBoxId() {
		return boxId;
	}
	public void setBoxId(Integer boxId) {
		this.boxId = boxId;
	}
	public String getBoxName() {
		return boxName;
	}
	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
	public Integer getBoxTypeId() {
		return boxTypeId;
	}
	public void setBoxTypeId(Integer boxTypeId) {
		this.boxTypeId = boxTypeId;
	}
	public Integer getSchematicId() {
		return schematicId;
	}
	public void setSchematicId(Integer schematicId) {
		this.schematicId = schematicId;
	}
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public Integer getOribitId() {
		return oribitId;
	}
	public void setOribitId(Integer oribitId) {
		this.oribitId = oribitId;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public Integer getLayer() {
		return layer;
	}
	public void setLayer(Integer layer) {
		this.layer = layer;
	}
	public Integer getRootId() {
		return rootId;
	}
	public void setRootId(Integer rootId) {
		this.rootId = rootId;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	public Integer getLocalePhotoId() {
		return localePhotoId;
	}
	public void setLocalePhotoId(Integer localePhotoId) {
		this.localePhotoId = localePhotoId;
	}
	
	
}
