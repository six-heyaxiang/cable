package com.cable.dao;

import java.util.List;

import com.cable.bean.BoxType;

public interface BoxTypeDao {
	BoxType selectBoxTypeById(Integer id);
	List<BoxType> selectBoxTypes();
	Integer selectBoxTypesCount();
}
