package com.cable.bean;

import java.io.Serializable;

public class StationInfo implements Serializable {

	private static final long serialVersionUID = -4359409666894794305L;
	private Integer stationId;
	private String	stationName;
	private Integer	stationNumber;
	private String	stationType;
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public Integer getStationNumber() {
		return stationNumber;
	}
	public void setStationNumber(Integer stationNumber) {
		this.stationNumber = stationNumber;
	}
	public String getStationType() {
		return stationType;
	}
	public void setStationType(String stationType) {
		this.stationType = stationType;
	}
	
	
}
