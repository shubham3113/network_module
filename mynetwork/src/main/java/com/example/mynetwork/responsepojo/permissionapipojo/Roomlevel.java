
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

import java.util.List;

public class Roomlevel {

  @Expose
  private List<Floor> floors;

  public List<Floor> getFloors() {
    return floors;
  }

  public void setFloors(List<Floor> floors) {
    this.floors = floors;
  }

}
