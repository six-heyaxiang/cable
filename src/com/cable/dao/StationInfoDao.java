package com.cable.dao;

import java.util.List;

import com.cable.bean.StationInfo;

public interface StationInfoDao {
	List<StationInfo> selectStationInfoList();
	Long selectStationInfoCount();
}
