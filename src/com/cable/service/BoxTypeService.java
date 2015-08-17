package com.cable.service;

import java.util.List;

import com.cable.bean.BoxType;
import com.cable.common.DynamicPagination;

public interface BoxTypeService {
	BoxType selectBoxTypeById(Integer id);
	List<BoxType> selectBoxTypes(DynamicPagination dynamicPagination);
	Integer selectBoxTypesCount();
}
