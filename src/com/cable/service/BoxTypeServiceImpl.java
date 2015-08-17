package com.cable.service;

import java.util.List;

import com.cable.bean.BoxType;
import com.cable.common.DynamicPagination;
import com.cable.dao.BoxTypeDao;

public class BoxTypeServiceImpl extends BaseService implements BoxTypeService {

	private BoxTypeDao boxTypeDao;
	@Override
	public BoxType selectBoxTypeById(Integer id) {
		return boxTypeDao.selectBoxTypeById(id);
	}

	@Override
	public List<BoxType> selectBoxTypes(DynamicPagination dynamicPagination) {
		List<BoxType> boxTypes = boxTypeDao.selectBoxTypes();
		boxTypes = limit(boxTypes, dynamicPagination.getStartIndex().intValue(), dynamicPagination.getPageSize());
		return boxTypes;
	}

	@Override
	public Integer selectBoxTypesCount() {
		return boxTypeDao.selectBoxTypesCount();
	}

	public BoxTypeDao getBoxTypeDao() {
		return boxTypeDao;
	}

	public void setBoxTypeDao(BoxTypeDao boxTypeDao) {
		this.boxTypeDao = boxTypeDao;
	}
	
}
