package com.cable.bean;

import java.io.Serializable;

public class Orbit implements Serializable {

	private static final long serialVersionUID = -5442719358449460342L;
	private Integer	orbitId;
	private Integer	stationId;
	private Integer	orbitTypeId;
	private String	orbitName;
	private String	localePhotoId;
	public Integer getOrbitId() {
		return orbitId;
	}
	public void setOrbitId(Integer orbitId) {
		this.orbitId = orbitId;
	}
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public Integer getOrbitTypeId() {
		return orbitTypeId;
	}
	public void setOrbitTypeId(Integer orbitTypeId) {
		this.orbitTypeId = orbitTypeId;
	}
	public String getOrbitName() {
		return orbitName;
	}
	public void setOrbitName(String orbitName) {
		this.orbitName = orbitName;
	}
	public String getLocalePhotoId() {
		return localePhotoId;
	}
	public void setLocalePhotoId(String localePhotoId) {
		this.localePhotoId = localePhotoId;
	}
	
}
