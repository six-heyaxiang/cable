package com.cable.bean;

import java.io.Serializable;

public class LocalePhoto implements Serializable {

	private static final long serialVersionUID = -6330689760157690636L;
	private Integer	localePhotoId;
	private String	localePhotoName;
	private byte[]	localePhoto;
	private String	localePhotoUrl;
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
	public byte[] getLocalePhoto() {
		return localePhoto;
	}
	public void setLocalePhoto(byte[] localePhoto) {
		this.localePhoto = localePhoto;
	}
	public String getLocalePhotoUrl() {
		return localePhotoUrl;
	}
	public void setLocalePhotoUrl(String localePhotoUrl) {
		this.localePhotoUrl = localePhotoUrl;
	}
	
}
