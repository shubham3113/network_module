/*
 * Created by CasaDigi on 24/8/19 2:05 PM
 * Copyright (C) 2019  All rights reserved.
 * Last modified 24/8/19 2:05 PM
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.mynetwork.responsepojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InfoResponsePojo {

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
	private Data data;

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

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public class Data {

		@SerializedName("version")
		@Expose
		private String version;
		@SerializedName("api_supported_version")
		@Expose
		private List<Float> apiSupportedVersion = null;
		@SerializedName("configuration")
		@Expose
		private String configuration;
		@SerializedName("entertainment")
		@Expose
		private String entertainment;
		@SerializedName("app_config")
		@Expose
		private AppConfig appConfig;
		@SerializedName("java")
		@Expose
		private String java;
		@SerializedName("casadigi")
		@Expose
		private String casadigi;
		@SerializedName("is_tpm")
		@Expose
		private Boolean isTpm;

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<Float> getApiSupportedVersion() {
			return apiSupportedVersion;
		}

		public void setApiSupportedVersion(List<Float> apiSupportedVersion) {
			this.apiSupportedVersion = apiSupportedVersion;
		}

		public String getConfiguration() {
			return configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
		}

		public String getEntertainment() {
			return entertainment;
		}

		public void setEntertainment(String entertainment) {
			this.entertainment = entertainment;
		}

		public AppConfig getAppConfig() {
			return appConfig;
		}

		public void setAppConfig(AppConfig appConfig) {
			this.appConfig = appConfig;
		}

		public String getJava() {
			return java;
		}

		public void setJava(String java) {
			this.java = java;
		}

		public String getCasadigi() {
			return casadigi;
		}

		public void setCasadigi(String casadigi) {
			this.casadigi = casadigi;
		}

		public Boolean getIsTpm() {
			return isTpm;
		}

		public void setIsTpm(Boolean isTpm) {
			this.isTpm = isTpm;
		}

	}

	public class Protocols {

		@SerializedName("web_protocol")
		@Expose
		private String webProtocol;
		@SerializedName("web_socket_protocol")
		@Expose
		private String webSocketProtocol;
		@SerializedName("socket_protocol")
		@Expose
		private String socketProtocol;

		public String getWebProtocol() {
			return webProtocol;
		}

		public void setWebProtocol(String webProtocol) {
			this.webProtocol = webProtocol;
		}

		public String getWebSocketProtocol() {
			return webSocketProtocol;
		}

		public void setWebSocketProtocol(String webSocketProtocol) {
			this.webSocketProtocol = webSocketProtocol;
		}

		public String getSocketProtocol() {
			return socketProtocol;
		}

		public void setSocketProtocol(String socketProtocol) {
			this.socketProtocol = socketProtocol;
		}

	}

	public class AppConfig {

		@SerializedName("is_demo_mode")
		@Expose
		private Boolean isDemoMode;
		@SerializedName("profile_id")
		@Expose
		private Integer profileId;
		@SerializedName("web_secure_mode")
		@Expose
		private Boolean webSecureMode;
		@SerializedName("web_socket_secure_mode")
		@Expose
		private Boolean webSocketSecureMode;
		@SerializedName("socket_secure_mode")
		@Expose
		private String  homeServerHQDN;
		@SerializedName("homeserver_fqdn")
		@Expose
		private String homeserverFqdn;
		@SerializedName("protocols")
		@Expose
		private Protocols protocols;

		public Boolean getIsDemoMode() {
			return isDemoMode;
		}

		public void setIsDemoMode(Boolean isDemoMode) {
			this.isDemoMode = isDemoMode;
		}

		public Integer getProfileId() {
			return profileId;
		}

		public void setProfileId(Integer profileId) {
			this.profileId = profileId;
		}

		public Boolean getWebSecureMode() {
			return webSecureMode;
		}

		public void setWebSecureMode(Boolean webSecureMode) {
			this.webSecureMode = webSecureMode;
		}

		public Boolean getWebSocketSecureMode() {
			return webSocketSecureMode;
		}

		public void setWebSocketSecureMode(Boolean webSocketSecureMode) {
			this.webSocketSecureMode = webSocketSecureMode;
		}

		public String  getSocketSecureMode() {
			return homeServerHQDN;
		}

		public void setSocketSecureMode(String  socketSecureMode) {
			this.homeServerHQDN = socketSecureMode;
		}

		public String getHomeserverFqdn() {
			return homeserverFqdn;
		}

		public void setHomeserverFqdn(String homeserverFqdn) {
			this.homeserverFqdn = homeserverFqdn;
		}

		public Protocols getProtocols() {
			return protocols;
		}

		public void setProtocols(Protocols protocols) {
			this.protocols = protocols;
		}

	}
}