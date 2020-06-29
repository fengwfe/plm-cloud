package com.fuwu.plm.shared.dto;

import java.io.Serializable;

/**
 * @author wufuen
 * @param <D>
 * Rest Api返回的对象类型
 */

public abstract class ApiResponse<D> implements Serializable{
	protected String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
