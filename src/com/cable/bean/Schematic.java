package com.cable.bean;

import java.io.Serializable;

public class Schematic implements Serializable {

	private static final long serialVersionUID = -1362484090067290915L;
	private Integer	schematicId;
	private String	schematicName;
	private String	schematicPhoto;
	public Integer getSchematicId() {
		return schematicId;
	}
	public void setSchematicId(Integer schematicId) {
		this.schematicId = schematicId;
	}
	public String getSchematicName() {
		return schematicName;
	}
	public void setSchematicName(String schematicName) {
		this.schematicName = schematicName;
	}
	public String getSchematicPhoto() {
		return schematicPhoto;
	}
	public void setSchematicPhoto(String schematicPhoto) {
		this.schematicPhoto = schematicPhoto;
	}
	
}
