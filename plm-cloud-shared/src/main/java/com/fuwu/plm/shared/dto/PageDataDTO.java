package com.fuwu.plm.shared.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author wufuen
 *
 * @param <D>
 * 
 * 
 */
public class PageDataDTO<D> implements Serializable{
	private List<D> list;
	private long page;
	private long pageSize;
	private long totalPages;
	public List<D> getList() {
		return list;
	}
	public void setList(List<D> list) {
		this.list = list;
	}
	public long getPage() {
		return page;
	}
	public void setPage(long page) {
		this.page = page;
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
	

}
