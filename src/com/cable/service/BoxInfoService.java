package com.cable.service;

import java.util.List;

import com.cable.bean.BoxInfo;
import com.cable.common.DynamicPagination;

public interface BoxInfoService {
	BoxInfo selectBoxInfoById(Integer id);
	List<BoxInfo> selectBoxInfoLIst(DynamicPagination pagination);
	Long selectBoxInfoCount();
}
