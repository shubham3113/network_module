package com.example.mynetwork.requestPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SupportPostRequestPojo {
	@SerializedName("ticket_type")
	@Expose
	private String ticketType;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("vendor_id")
	@Expose
	private String vendorId;
	@SerializedName("device_name")
	@Expose
	private String deviceName;
	@SerializedName("app_version")
	@Expose
	private String appVersion;
	@SerializedName("build_version")
	@Expose
	private String buildVersion;
	@SerializedName("device_type")
	@Expose
	private String deviceType;

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}
