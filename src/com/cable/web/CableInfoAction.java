package com.cable.web;

import com.cable.bean.CableInfo;
import com.cable.bean.result.ResultCableInfo;
import com.cable.service.CableInfoService;

public class CableInfoAction extends BaseAction {

	private static final long serialVersionUID = -718332724746454232L;
	
	private CableInfoService cableInfoService;

	//请求参数
	private Integer id;
	private Boolean isReset = true;
	private Integer pageNo = 1;
	private Integer pageSize = 10;
	
	//返回结果
	private ResultCableInfo cableInfoBean;
	
	public String getCableInfoById() {
		if(id == null)
			id = 1;
		CableInfo cableInfo = cableInfoService.getCableInfoById(id);
		cableInfoBean = new ResultCableInfo();
		cableInfoBean.setCableInfo(cableInfo);
		return "cableInfo";
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsReset() {
		return isReset;
	}

	public void setIsReset(Boolean isReset) {
		this.isReset = isReset;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}
	

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public CableInfoService getCableInfoService() {
		return cableInfoService;
	}

	public void setCableInfoService(CableInfoService cableInfoService) {
		this.cableInfoService = cableInfoService;
	}
	public ResultCableInfo getCableInfoBean() {
		return cableInfoBean;
	}
	public void setCableInfoBean(ResultCableInfo cableInfoBean) {
		this.cableInfoBean = cableInfoBean;
	}
	
}
