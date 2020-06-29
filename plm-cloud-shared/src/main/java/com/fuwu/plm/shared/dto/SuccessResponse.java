package com.fuwu.plm.shared.dto;

/**
 * 
 * @author wufuen
 * @param <D>
 * Rest 接口调用成功时的返回类型
 * 
 */
public class SuccessResponse<D> extends ApiResponse<D>{
	public SuccessResponse() {
		this.status="success";
	}
	private D data;

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}
	

}
