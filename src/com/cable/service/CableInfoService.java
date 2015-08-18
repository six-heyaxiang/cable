package com.cable.service;

import java.util.List;

import com.cable.bean.CableInfo;
import com.cable.common.DynamicPagination;

public interface CableInfoService {
	CableInfo getCableInfoById(Integer id);
	List<CableInfo> getCableInfoList(DynamicPagination dynamicPagination);
	Integer getCableInfosCount();
}
