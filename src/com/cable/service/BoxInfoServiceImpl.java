package com.cable.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cable.bean.BoxInfo;
import com.cable.common.DynamicPagination;
import com.cable.dao.BoxInfoDao;

public class BoxInfoServiceImpl extends BaseService implements BoxInfoService {

	private BoxInfoDao boxInfoDao;

	public void setBoxInfoDao(BoxInfoDao boxInfoDao) {
		this.boxInfoDao = boxInfoDao;
	}

	@Override
	public BoxInfo selectBoxInfoById(Integer id) {
		BoxInfo temp = boxInfoDao.selectBoxInfoById(id);
		return temp;
	}

	@Override
	public List<BoxInfo> selectBoxInfoLIst(DynamicPagination pagination, Integer stationId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("stationId", stationId);
		List<BoxInfo> boxinfoList = boxInfoDao.selectBoxInfoList(param);
		return limit(boxinfoList, pagination.getStartIndex().intValue(), pagination.getPageSize());
	}

	@Override
	public Long selectBoxInfoCount() {
		return boxInfoDao.selectBoxInfoCount();
	}
}
