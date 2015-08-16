package com.cable.bean;

import java.io.Serializable;

public class LocalePhoto implements Serializable {

	private static final long serialVersionUID = -6330689760157690636L;
	private Integer	localePhotoId;
	private String	localePhotoName;
	private String	localePhoto;
	public Integer getLocalePhotoId() {
		return localePhotoId;
	}
	public void setLocalePhotoId(Integer localePhotoId) {
		this.localePhotoId = localePhotoId;
	}
	public String getLocalePhotoName() {
		return localePhotoName;
	}
	public void setLocalePhotoName(String localePhotoName) {
		this.localePhotoName = localePhotoName;
	}
	public String getLocalePhoto() {
		return localePhoto;
	}
	public void setLocalePhoto(String localePhoto) {
		this.localePhoto = localePhoto;
	}
	
}
