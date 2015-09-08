package com.cable.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import com.cable.bean.BoxInfo;
import com.cable.bean.CableInfo;
import com.cable.common.DynamicPagination;
import com.cable.dao.CableInfoDao;

public class CableInfoServiceImpl extends BaseService implements CableInfoService {

	private CableInfoDao cableInfoDao;
	
	@Override
	public CableInfo getCableInfoById(Integer id) {
		CableInfo temp = cableInfoDao.selectCableInfoById(id);
		if(temp != null) {
			BoxInfo backBoxInfo = temp.getBackBoxInfo();
			if(backBoxInfo != null && backBoxInfo.getLocalePhoto() != null) {
				String name = "box_"+backBoxInfo.getLocalePhoto().getLocalePhotoId()+".jpg";
				byte[] data = backBoxInfo.getLocalePhoto().getLocalePhoto();
				saveImageToFile(name, data);
				backBoxInfo.getLocalePhoto().setLocalePhoto(null);
				backBoxInfo.getLocalePhoto().setLocalePhotoUrl("/images/"+name);
			}
			BoxInfo froBoxInfo = temp.getFroBoxInfo();
			if(froBoxInfo != null && froBoxInfo.getLocalePhoto() != null) {
				String name = "box_"+froBoxInfo.getLocalePhoto().getLocalePhotoId()+".jpg";
				byte[] data = froBoxInfo.getLocalePhoto().getLocalePhoto();
				saveImageToFile(name, data);
				froBoxInfo.getLocalePhoto().setLocalePhoto(null);
				froBoxInfo.getLocalePhoto().setLocalePhotoUrl("/images/"+name);
			}	
		}
		
		return temp;
	}

	@Override
	public List<CableInfo> getCableInfoList(DynamicPagination dynamicPagination) {
		List<CableInfo> datas = cableInfoDao.selectCableInfoList();
		return limit(datas, dynamicPagination.getStartIndex().intValue(), dynamicPagination.getPageSize());
	}

	@Override
	public Integer getCableInfosCount() {
		return cableInfoDao.selectCableInfoCount();
	}
	
	public CableInfoDao getCableInfoDao() {
		return cableInfoDao;
	}

	public void setCableInfoDao(CableInfoDao cableInfoDao) {
		this.cableInfoDao = cableInfoDao;
	}

}
