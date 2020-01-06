
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

public class Room {

  @SerializedName("is_module_exists")
  private Boolean isModuleExists;
  @SerializedName("is_subroom")
  private Long isSubroom;
  @Expose
  private String position;
  @SerializedName("room_id")
  private String roomId;
  @SerializedName("room_name")
  private String roomName;
  @SerializedName("room_permissions")
  private RoomPermissions roomPermissions;
  @SerializedName("room_type_id")
  private String roomTypeId;

  public Boolean getIsModuleExists() {
    return isModuleExists;
  }

  public void setIsModuleExists(Boolean isModuleExists) {
    this.isModuleExists = isModuleExists;
  }

  public Long getIsSubroom() {
    return isSubroom;
  }

  public void setIsSubroom(Long isSubroom) {
    this.isSubroom = isSubroom;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public RoomPermissions getRoomPermissions() {
    return roomPermissions;
  }

  public void setRoomPermissions(RoomPermissions roomPermissions) {
    this.roomPermissions = roomPermissions;
  }

  public String getRoomTypeId() {
    return roomTypeId;
  }

  public void setRoomTypeId(String roomTypeId) {
    this.roomTypeId = roomTypeId;
  }

}
