package com.cable.web;

import java.util.List;

import com.cable.bean.Orbit;
import com.cable.bean.StationInfo;
import com.cable.bean.result.ResultOrbitInfo;
import com.cable.bean.result.ResultStationInfo;
import com.cable.common.DynamicPagination;
import com.cable.service.StationInfoService;

public class StationInfoAction extends BaseAction {

	private static final long serialVersionUID = 7486122448012585586L;
	
	private StationInfoService stationInfoService;
	//请求参数
	private Integer stationId;
	private DynamicPagination pagination;
	
	//返回结果
	private ResultStationInfo stationInfoListBean;
	private ResultOrbitInfo orbitInfoListBean;
	public String getStationInfoList() {
		long totalCount = stationInfoService.getAllStationInfoCount();
		pagination = new DynamicPagination(1, 20, totalCount);
		List<StationInfo> stationInfos = stationInfoService.getStationInfoList(pagination);
		stationInfoListBean = new ResultStationInfo();
		stationInfoListBean.setStationInfos(stationInfos);
		return "stationList";
	}
	
	public String getOrbits() {
		List<Orbit> orbits = stationInfoService.getAllOrbitsByStationId(stationId);
		orbitInfoListBean = new ResultOrbitInfo();
		orbitInfoListBean.setOrbits(orbits);
		return "orbitlist";
	}
	
	public StationInfoService getStationInfoService() {
		return stationInfoService;
	}
	public void setStationInfoService(StationInfoService stationInfoService) {
		this.stationInfoService = stationInfoService;
	}
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public ResultStationInfo getStationInfoListBean() {
		return stationInfoListBean;
	}
	public void setStationInfoListBean(ResultStationInfo stationInfoListBean) {
		this.stationInfoListBean = stationInfoListBean;
	}
	public ResultOrbitInfo getOrbitInfoListBean() {
		return orbitInfoListBean;
	}
	public void setOrbitInfoListBean(ResultOrbitInfo orbitInfoListBean) {
		this.orbitInfoListBean = orbitInfoListBean;
	}
	
}
