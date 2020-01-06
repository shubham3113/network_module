
/*
 * Created by CasaDigi on 3/10/19 12:14 PM
 * Copyright (C) 2019  All rights reserved.
 * Last modified 3/10/19 12:11 PM
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

package com.example.mynetwork.responsepojo.permissionapipojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

  @SerializedName("entertainment_sqlite_url")
  private String entertainmentSqliteUrl;
  @Expose
  private Permission permission;
  @Expose
  private Profile profile;
  @SerializedName("sqlite_url")
  private String sqliteUrl;

  public String getEntertainmentSqliteUrl() {
    return entertainmentSqliteUrl;
  }

  public void setEntertainmentSqliteUrl(String entertainmentSqliteUrl) {
    this.entertainmentSqliteUrl = entertainmentSqliteUrl;
  }

  public Permission getPermission() {
    return permission;
  }

  public void setPermission(Permission permission) {
    this.permission = permission;
  }

  public Profile getProfile() {
    return profile;
  }

  public void setProfile(Profile profile) {
    this.profile = profile;
  }

  public String getSqliteUrl() {
    return sqliteUrl;
  }

  public void setSqliteUrl(String sqliteUrl) {
    this.sqliteUrl = sqliteUrl;
  }



}
