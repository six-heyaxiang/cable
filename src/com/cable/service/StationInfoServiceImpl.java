package com.cable.service;

import java.util.ArrayList;
import java.util.List;

import com.cable.bean.LocalePhoto;
import com.cable.bean.Orbit;
import com.cable.bean.StationInfo;
import com.cable.common.DynamicPagination;
import com.cable.dao.StationInfoDao;

public class StationInfoServiceImpl extends BaseService implements StationInfoService {

	private StationInfoDao	stationInfoDao;
	@Override
	public List<StationInfo> getStationInfoList(
			DynamicPagination dynamicPagination) {
		List<StationInfo> stationInfoList = stationInfoDao.selectStationInfoList();
		stationInfoList = limit(stationInfoList, dynamicPagination.getStartIndex().intValue(), dynamicPagination.getPageSize());
		return stationInfoList;
	}

	@Override
	public Long getAllStationInfoCount() {
		return stationInfoDao.selectStationInfoCount();
	}

	public StationInfoDao getStationInfoDao() {
		return stationInfoDao;
	}

	public void setStationInfoDao(StationInfoDao stationInfoDao) {
		this.stationInfoDao = stationInfoDao;
	}

	@Override
	public List<Orbit> getAllOrbitsByStationId(Integer id) {
		List<Orbit> orbits = stationInfoDao.selectOrbitsByStationId(id);
		for(Orbit orbit:orbits) {
			if(orbit.getLocalePhotoId() != null) {
				String[] ids = orbit.getLocalePhotoId().split("\\|");
				orbit.setPhotos(new ArrayList<String>());
				for(String photoId :ids) {
					LocalePhoto photo = stationInfoDao.selectLocalePhotoById(Integer.parseInt(photoId));
					orbit.getPhotos().add(getImagePath(photo));
				}		
			}
		}
		return orbits;
	}
}
