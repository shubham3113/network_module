package com.example.mynetwork.responsepojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PushUpdateResponsePojo {

	@SerializedName("status")
	@Expose
	private Boolean status;
	@SerializedName("result_code")
	@Expose
	private Integer resultCode;
	@SerializedName("message")
	@Expose
	private String message;
	@SerializedName("data")
	@Expose
	private List<Object> data = null;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}
}
