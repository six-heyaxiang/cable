package com.cable.service;

import java.util.List;

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
	

}
