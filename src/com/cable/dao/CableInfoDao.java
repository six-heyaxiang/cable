package com.cable.dao;

import java.util.List;

import com.cable.bean.CableInfo;

public interface CableInfoDao {
	CableInfo selectCableInfoById(Integer id);
	List<CableInfo> selectCableInfoList();
	Integer selectCableInfoCount();
}
