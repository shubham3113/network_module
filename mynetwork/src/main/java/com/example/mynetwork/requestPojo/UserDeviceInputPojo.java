package com.example.mynetwork.requestPojo;

import com.google.gson.annotations.SerializedName;

public class UserDeviceInputPojo {

	/**
	 * profile_id : 1
	 * device_address : 10.13.13.13
	 * device_name : casa ipad nnn
	 * os_version : 1.5
	 * app_version : v2
	 * vendor_id : llffhhgdsssdhhhgfddfggddhu
	 */


	@SerializedName("profile_id")
	private int profileId;
	@SerializedName("device_address")
	private String deviceAddress;
	@SerializedName("device_name")
	private String deviceName;
	@SerializedName("os_version")
	private String osVersion;
	@SerializedName("app_version")
	private String appVersion;
	@SerializedName("vendor_id")
	private String vendorId;

	@SerializedName("device_token")
	private String deviceToken;

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getDeviceAddress() {
		return deviceAddress;
	}

	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
}
