package com.cable.web;

import java.util.List;

import com.cable.bean.BoxInfo;
import com.cable.bean.result.ResultBoxInfo;
import com.cable.bean.result.ResultBoxInfoList;
import com.cable.common.DynamicPagination;
import com.cable.service.BoxInfoService;

/**
 * @author Nosix
 *
 */
public class BoxInfoAction extends BaseAction {

	private static final long serialVersionUID = -8207634393495650536L;
	private BoxInfoService boxInfoService;

	//请求参数
	private Boolean isReset = true;
	private Integer pageNo = 1;
	private Integer pageSize = 10;
	private Integer boxinfoId;
	private DynamicPagination pagination;
	
	//返回结果
	private ResultBoxInfo boxInfoBean;
	private ResultBoxInfoList boxinfoListBean;
	
	
	public String getBoxInfoById() {
		if(boxinfoId == null)
			boxinfoId = 1;
		BoxInfo boxInfo = boxInfoService.selectBoxInfoById(boxinfoId);
		boxInfoBean = new ResultBoxInfo();
		boxInfoBean.setBoxinfo(boxInfo);
		return "boxinfo";
	}
	
	public String getBoxInfoList() {
		if(!isReset) {
			
		}
		Long totalCount = boxInfoService.selectBoxInfoCount();
		pagination = new DynamicPagination(pageNo, pageSize, totalCount);
		List<BoxInfo> boxinfoList = boxInfoService.selectBoxInfoLIst(pagination);
		boxinfoListBean = new ResultBoxInfoList();
		boxinfoListBean.setBoxinfoList(boxinfoList);
		return "boxinfolist";
	}
	public void setBoxInfoBean(ResultBoxInfo boxInfoBean) {
		this.boxInfoBean = boxInfoBean;
	}
	public ResultBoxInfo getBoxInfoBean() {
		return boxInfoBean;
	}
	public BoxInfoService getBoxInfoService() {
		return boxInfoService;
	}
	public void setBoxInfoService(BoxInfoService boxInfoService) {
		this.boxInfoService = boxInfoService;
	}
	public Integer getBoxinfoId() {
		return boxinfoId;
	}
	public void setBoxinfoId(Integer boxinfoId) {
		this.boxinfoId = boxinfoId;
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

	public DynamicPagination getPagination() {
		return pagination;
	}

	public void setPagination(DynamicPagination pagination) {
		this.pagination = pagination;
	}

	public ResultBoxInfoList getBoxinfoListBean() {
		return boxinfoListBean;
	}

	public void setBoxinfoListBean(ResultBoxInfoList boxinfoListBean) {
		this.boxinfoListBean = boxinfoListBean;
	}
}