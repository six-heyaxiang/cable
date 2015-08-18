package com.cable.service;

import java.util.List;

import com.cable.bean.CableInfo;
import com.cable.common.DynamicPagination;
import com.cable.dao.CableInfoDao;

public class CableInfoServiceImpl extends BaseService implements CableInfoService {

	private CableInfoDao cableInfoDao;
	
	@Override
	public CableInfo getCableInfoById(Integer id) {
		return cableInfoDao.selectCableInfoById(id);
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
