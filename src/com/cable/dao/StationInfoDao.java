package com.cable.dao;

import java.util.List;

import com.cable.bean.LocalePhoto;
import com.cable.bean.Orbit;
import com.cable.bean.StationInfo;

public interface StationInfoDao {
	List<StationInfo> selectStationInfoList();
	Long selectStationInfoCount();
	List<Orbit> selectOrbitsByStationId(Integer id);
	LocalePhoto selectLocalePhotoById(Integer id);
}
