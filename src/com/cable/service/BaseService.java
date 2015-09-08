package com.cable.service;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.cable.bean.LocalePhoto;

public class BaseService {
	
	public <T> List<T> limit(List<T> datas, Integer limitStart,Integer limitSize) {
		if(datas != null){
			List<T> result = new ArrayList<T>();
			for(int i= 0; i < datas.size(); i++) {
				if(i >= limitStart) {
					result.add(datas.get(i));
					if(result.size() == limitSize)
						return result;
				}
			}
			return result;
		} 
		return null;
	}
	String getImagePath(LocalePhoto photo) {
		String name = "box_"+photo.getLocalePhotoId()+".jpg";
		byte[] data = photo.getLocalePhoto();
		saveImageToFile(name, data);
		return "/images/"+name;
	}
	String getFilePath(String name) {
		String filePath = this.getClass().getResource("/").getPath().replace("WEB-INF/classes", "images");
		filePath = filePath+name;
		return filePath;
	}

	void saveImageToFile(String name, byte[] data) {
		FileOutputStream out;
		try {
			String filePath = getFilePath(name);
			out = new FileOutputStream(filePath);
			out.write(data);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
