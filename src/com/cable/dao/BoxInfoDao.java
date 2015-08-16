package com.cable.dao;

import java.util.List;
import java.util.Map;

import com.cable.bean.BoxInfo;

public interface BoxInfoDao {
	
	BoxInfo selectBoxInfoById(Integer id);

	List<BoxInfo> selectBoxInfoList(Map<String,Object> param);
	
	Long selectBoxInfoCount();
}
