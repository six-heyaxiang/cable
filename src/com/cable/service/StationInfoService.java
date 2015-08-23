package com.cable.service;

import java.util.List;

import com.cable.bean.StationInfo;
import com.cable.common.DynamicPagination;

public interface StationInfoService {
	List<StationInfo> getStationInfoList(DynamicPagination dynamicPagination);
	Long getAllStationInfoCount();
}
