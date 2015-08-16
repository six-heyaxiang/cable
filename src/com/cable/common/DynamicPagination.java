package com.cable.common;

public class DynamicPagination {
	private Integer pageNo;//当前页 从1开始
	private Integer pageSize;//每页个数
	private Integer totalPage;//总页数
	private Long totalCount;//总记录数
	private Long startIndex;//每页的开始行
	private Long endIndex;
	
	public DynamicPagination(Integer pageNo, Integer pageSize, Long totalCount) {	
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		refreshTotalPage();
		refreshPageNo();
		refreshStartIndex();
		refreshEndIndex();		
	}
	
	public DynamicPagination(Integer pageNo, Integer pageSize) {	
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	
	
	private void refreshTotalPage() {
		Long tempTotalPage = (totalCount / pageSize);
		if (totalCount % pageSize != 0) {
			tempTotalPage++;
		}
		
		this.totalPage = tempTotalPage.intValue();
	}
	
	private void refreshPageNo() {
		if (pageNo < 1) {
			pageNo = 1;
			return;
		}
		
		if (pageNo > totalPage) {
			pageNo = totalPage;
			return;
		}
	}
	
	private Integer refreshPageNo(Integer currPage) {
		int tempCurrPage = currPage;
	    if (currPage < 1) {
	      tempCurrPage = 1;
	    }
	    if (currPage > this.totalPage) {
	      tempCurrPage = this.totalPage;
	    }
	    return tempCurrPage;
	}
	
	private void refreshStartIndex() {
		if (pageNo <= 0) {
			startIndex = 0L;
			return;
		}	

		startIndex = (long)((pageNo - 1) * pageSize);
	}
	
	private void refreshEndIndex() {
		endIndex = startIndex + pageSize;
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


	public Integer getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}


	public Integer getPrePage() {
		return refreshPageNo(this.pageNo - 1);
	}

	public Integer getNextPage() {
		return refreshPageNo(this.pageNo + 1);
	}

	public Long getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}


	public Long getStartIndex() {
		return startIndex;
	}


	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}


	public Long getEndIndex() {
		return endIndex;
	}


	public void setEndIndex(Long endIndex) {
		this.endIndex = endIndex;
	}		
}
