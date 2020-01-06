package com.example.mynetwork.requestPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CasaMailerRequestPojo {
	@SerializedName("subject")
	@Expose
	private String subject;
	@SerializedName("body")
	@Expose
	private String body;
	@SerializedName("service")
	@Expose
	private String service;
	@SerializedName("to")
	@Expose
	private String to;
	@SerializedName("include_project_name")
	@Expose
	private Boolean includeProjectName;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Boolean getIncludeProjectName() {
		return includeProjectName;
	}

	public void setIncludeProjectName(Boolean includeProjectName) {
		this.includeProjectName = includeProjectName;
	}
}
