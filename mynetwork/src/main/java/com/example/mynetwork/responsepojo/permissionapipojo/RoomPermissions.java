
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

import java.util.List;

public class RoomPermissions {

  @Expose
  private List<String> audio;
  @SerializedName("is_demo_mode")
  private Boolean isDemoMode;
  @SerializedName("is_mzm")
  private Boolean isMzm;
  @Expose
  private List<String> others;
  @Expose
  private List<String> video;

  public List<String> getAudio() {
    return audio;
  }

  public void setAudio(List<String> audio) {
    this.audio = audio;
  }

  public Boolean getIsDemoMode() {
    return isDemoMode;
  }

  public void setIsDemoMode(Boolean isDemoMode) {
    this.isDemoMode = isDemoMode;
  }

  public Boolean getIsMzm() {
    return isMzm;
  }

  public void setIsMzm(Boolean isMzm) {
    this.isMzm = isMzm;
  }

  public List<String> getOthers() {
    return others;
  }

  public void setOthers(List<String> others) {
    this.others = others;
  }

  public List<String> getVideo() {
    return video;
  }

  public void setVideo(List<String> video) {
    this.video = video;
  }

}
