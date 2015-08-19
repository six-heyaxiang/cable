package com.cable.bean;

import java.io.Serializable;

public class BoxInfo implements Serializable {

	private static final long serialVersionUID = -2358760439585904680L;
	private Integer boxId;
	private String	boxName;
	private String	instruction;
	private Integer layer;
	private Integer	rootId;
	private Integer	depth;
	private BoxType boxType;
	private Schematic schematic;
	private Orbit	orbit;
	private LocalePhoto localePhoto;
	private StationInfo station;
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
	public BoxType getBoxType() {
		return boxType;
	}
	public void setBoxType(BoxType boxType) {
		this.boxType = boxType;
	}
	public Schematic getSchematic() {
		return schematic;
	}
	public void setSchematic(Schematic schematic) {
		this.schematic = schematic;
	}
	public Orbit getOrbit() {
		return orbit;
	}
	public void setOrbit(Orbit orbit) {
		this.orbit = orbit;
	}
	public LocalePhoto getLocalePhoto() {
		return localePhoto;
	}
	public void setLocalePhoto(LocalePhoto localePhoto) {
		this.localePhoto = localePhoto;
	}
	public StationInfo getStation() {
		return station;
	}
	public void setStation(StationInfo station) {
		this.station = station;
	}
	
}
