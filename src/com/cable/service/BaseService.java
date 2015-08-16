package com.cable.service;

import java.util.ArrayList;
import java.util.List;

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
}
