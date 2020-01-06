package com.example.mynetwork.responsepojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UserDeviceOutputPojo {


    /**
     * status : true result_code : 2002 message : User device registered successfully! data :
     * {"profile":{"id":"4","name":"QA"},"permission":{"roomlevel":{"floors":[{"floor_id":"1","floor_name":"Ground
     * Floor","position":"1","rooms":[{"room_id":"1","room_name":"Home Theater","position":"1","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"14","room_name":"Entrance
     * Foyer","position":"5","is_subroom":0,"room_type_id":"1","is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"15","room_name":"Library","position":"2","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","light"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"18","room_name":"Kitchen","position":"3","is_subroom":1,"subrooms":[{"room_id":"17","room_name":"Kitchen","position":"3.01","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["fan","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"19","room_name":"Store
     * Room","position":"3.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"20","room_name":"Pool
     * Area","position":"4","is_subroom":1,"subrooms":[{"room_id":"16","room_name":"Pool","position":"4.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["fan","light","roomambience"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"21","room_name":"Green
     * Room","position":"4.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]}]},{"floor_id":"2","floor_name":"First
     * Floor","position":"2","rooms":[{"room_id":"2","room_name":"Master
     * Room","position":"1","is_subroom":1,"subrooms":[{"room_id":"3","room_name":"Bed","position":"0.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"4","room_name":"Bath","position":"0.02","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["light","pool_spa","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"5","room_name":"Wardrobe","position":"0.03","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["ac","curtain","light","roomambience"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"6","room_name":"Living","position":"4","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":[],"video":["channelprovider"],"is_mzm":false,"is_demo_mode":false}},{"room_id":"8","room_name":"Meditation
     * Room","position":"3","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","curtainmood","light"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"22","room_name":"Kid's
     * Room","position":"2","is_subroom":1,"subrooms":[{"room_id":"23","room_name":"Bed","position":"2.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","fan","light"],"audio":["music"],"video":["movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"24","room_name":"Bath","position":"2.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["curtain","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"25","room_name":"Play
     * Area","position":"2.03","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","light"],"audio":[],"video":["digitalmedia","channelprovider"],"is_mzm":false,"is_demo_mode":false}}]}]},{"floor_id":"3","floor_name":"Second
     * Floor","position":"3","rooms":[{"room_id":"26","room_name":"Guest
     * Room","position":"2","is_subroom":1,"subrooms":[{"room_id":"9","room_name":"Bed","position":"1","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":["music"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"27","room_name":"Bath","position":"1.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["curtain","light","pool_spa"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"28","room_name":"Wardrobe","position":"1.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"29","room_name":"Guest
     * Living","position":"3","is_subroom":0,"room_type_id":"1","is_module_exists":false,"room_permissions":{"others":["ac","curtain","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"floor_id":"4","floor_name":"Fourth
     * Floor","position":"4","rooms":[{"room_id":"10","room_name":"Terrace","position":"1","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":["music","webradio"],"video":["movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}}]}]},"homelevel":{"home_permissions":{"others":["equipment","multizonemusic","utility","homemood","doorphone"],"surveillance":["12","13","11"],"community":[]}}},"sqlite_url":"/studio-app-assets/sqlite/configuration.sqlite","entertainment_sqlite_url":"/entertainment-app-assets/sqlite/entertainment.sqlite"}
     */

    @SerializedName("status")
    private boolean status;
    @SerializedName("result_code")
    private int resultCode;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private DataBean data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        /**
         * profile : {"id":"4","name":"QA"} permission : {"roomlevel":{"floors":[{"floor_id":"1","floor_name":"Ground
         * Floor","position":"1","rooms":[{"room_id":"1","room_name":"Home
         * Theater","position":"1","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"14","room_name":"Entrance
         * Foyer","position":"5","is_subroom":0,"room_type_id":"1","is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"15","room_name":"Library","position":"2","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","light"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"18","room_name":"Kitchen","position":"3","is_subroom":1,"subrooms":[{"room_id":"17","room_name":"Kitchen","position":"3.01","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["fan","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"19","room_name":"Store
         * Room","position":"3.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"20","room_name":"Pool
         * Area","position":"4","is_subroom":1,"subrooms":[{"room_id":"16","room_name":"Pool","position":"4.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["fan","light","roomambience"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"21","room_name":"Green
         * Room","position":"4.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]}]},{"floor_id":"2","floor_name":"First
         * Floor","position":"2","rooms":[{"room_id":"2","room_name":"Master
         * Room","position":"1","is_subroom":1,"subrooms":[{"room_id":"3","room_name":"Bed","position":"0.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"4","room_name":"Bath","position":"0.02","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["light","pool_spa","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"5","room_name":"Wardrobe","position":"0.03","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["ac","curtain","light","roomambience"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"6","room_name":"Living","position":"4","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":[],"video":["channelprovider"],"is_mzm":false,"is_demo_mode":false}},{"room_id":"8","room_name":"Meditation
         * Room","position":"3","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","curtainmood","light"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"22","room_name":"Kid's
         * Room","position":"2","is_subroom":1,"subrooms":[{"room_id":"23","room_name":"Bed","position":"2.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","fan","light"],"audio":["music"],"video":["movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"24","room_name":"Bath","position":"2.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["curtain","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"25","room_name":"Play
         * Area","position":"2.03","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","light"],"audio":[],"video":["digitalmedia","channelprovider"],"is_mzm":false,"is_demo_mode":false}}]}]},{"floor_id":"3","floor_name":"Second
         * Floor","position":"3","rooms":[{"room_id":"26","room_name":"Guest
         * Room","position":"2","is_subroom":1,"subrooms":[{"room_id":"9","room_name":"Bed","position":"1","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":["music"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"27","room_name":"Bath","position":"1.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["curtain","light","pool_spa"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"28","room_name":"Wardrobe","position":"1.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"29","room_name":"Guest
         * Living","position":"3","is_subroom":0,"room_type_id":"1","is_module_exists":false,"room_permissions":{"others":["ac","curtain","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"floor_id":"4","floor_name":"Fourth
         * Floor","position":"4","rooms":[{"room_id":"10","room_name":"Terrace","position":"1","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":["music","webradio"],"video":["movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}}]}]},"homelevel":{"home_permissions":{"others":["equipment","multizonemusic","utility","homemood","doorphone"],"surveillance":["12","13","11"],"community":[]}}}
         * sqlite_url : /studio-app-assets/sqlite/configuration.sqlite entertainment_sqlite_url :
         * /entertainment-app-assets/sqlite/entertainment.sqlite
         */

        @SerializedName("profile")
        private ProfileBean profile;
        @SerializedName("permission")
        private PermissionBean permission;
        @SerializedName("sqlite_url")
        private String sqliteUrl;
        @SerializedName("entertainment_sqlite_url")
        private String entertainmentSqliteUrl;

        public ProfileBean getProfile() {
            return profile;
        }

        public void setProfile(ProfileBean profile) {
            this.profile = profile;
        }

        public PermissionBean getPermission() {
            return permission;
        }

        public void setPermission(PermissionBean permission) {
            this.permission = permission;
        }

        public String getSqliteUrl() {
            return sqliteUrl;
        }

        public void setSqliteUrl(String sqliteUrl) {
            this.sqliteUrl = sqliteUrl;
        }

        public String getEntertainmentSqliteUrl() {
            return entertainmentSqliteUrl;
        }

        public void setEntertainmentSqliteUrl(String entertainmentSqliteUrl) {
            this.entertainmentSqliteUrl = entertainmentSqliteUrl;
        }

        public static class ProfileBean {

            /**
             * id : 4 name : QA
             */

            @SerializedName("id")
            private String id;
            @SerializedName("name")
            private String name;
            @SerializedName("theme_id")
            private String themeId;

            /**
             * Getter method.
             *
             * @return Gets the value of themeId and returns themeId.
             */
            public String getThemeId() {
                return themeId;
            }

            /**
             * Sets the themeId. You can use getThemeId() to get the value of themeId.
             */
            public void setThemeId(String themeId) {
                this.themeId = themeId;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class PermissionBean {

            /**
             * roomlevel : {"floors":[{"floor_id":"1","floor_name":"Ground Floor","position":"1","rooms":[{"room_id":"1","room_name":"Home
             * Theater","position":"1","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false},"subrooms":[{"room_id":"17","room_name":"Kitchen","position":"3.01","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["fan","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"19","room_name":"Store
             * Room","position":"3.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"14","room_name":"Entrance
             * Foyer","position":"5","is_subroom":0,"room_type_id":"1","is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"15","room_name":"Library","position":"2","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","light"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"18","room_name":"Kitchen","position":"3","is_subroom":1,"subrooms":[{"room_id":"17","room_name":"Kitchen","position":"3.01","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["fan","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"19","room_name":"Store
             * Room","position":"3.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"20","room_name":"Pool
             * Area","position":"4","is_subroom":1,"subrooms":[{"room_id":"16","room_name":"Pool","position":"4.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["fan","light","roomambience"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"21","room_name":"Green
             * Room","position":"4.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]}]},{"floor_id":"2","floor_name":"First
             * Floor","position":"2","rooms":[{"room_id":"2","room_name":"Master
             * Room","position":"1","is_subroom":1,"subrooms":[{"room_id":"3","room_name":"Bed","position":"0.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"4","room_name":"Bath","position":"0.02","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["light","pool_spa","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"5","room_name":"Wardrobe","position":"0.03","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["ac","curtain","light","roomambience"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"6","room_name":"Living","position":"4","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":[],"video":["channelprovider"],"is_mzm":false,"is_demo_mode":false}},{"room_id":"8","room_name":"Meditation
             * Room","position":"3","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","curtainmood","light"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"22","room_name":"Kid's
             * Room","position":"2","is_subroom":1,"subrooms":[{"room_id":"23","room_name":"Bed","position":"2.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","fan","light"],"audio":["music"],"video":["movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"24","room_name":"Bath","position":"2.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["curtain","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"25","room_name":"Play
             * Area","position":"2.03","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","light"],"audio":[],"video":["digitalmedia","channelprovider"],"is_mzm":false,"is_demo_mode":false}}]}]},{"floor_id":"3","floor_name":"Second
             * Floor","position":"3","rooms":[{"room_id":"26","room_name":"Guest
             * Room","position":"2","is_subroom":1,"subrooms":[{"room_id":"9","room_name":"Bed","position":"1","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":["music"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"27","room_name":"Bath","position":"1.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["curtain","light","pool_spa"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"28","room_name":"Wardrobe","position":"1.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"29","room_name":"Guest
             * Living","position":"3","is_subroom":0,"room_type_id":"1","is_module_exists":false,"room_permissions":{"others":["ac","curtain","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"floor_id":"4","floor_name":"Fourth
             * Floor","position":"4","rooms":[{"room_id":"10","room_name":"Terrace","position":"1","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","light"],"audio":["music","webradio"],"video":["movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}}]}]}
             * homelevel : {"home_permissions":{"others":["equipment","multizonemusic","utility","homemood","doorphone"],"surveillance":["12","13","11"],"community":[]}}
             */

            @SerializedName("roomlevel")
            private RoomlevelBean roomlevel;
            @SerializedName("homelevel")
            private HomelevelBean homelevel;

            public RoomlevelBean getRoomlevel() {
                return roomlevel;
            }

            public void setRoomlevel(RoomlevelBean roomlevel) {
                this.roomlevel = roomlevel;
            }

            public HomelevelBean getHomelevel() {
                return homelevel;
            }

            public void setHomelevel(HomelevelBean homelevel) {
                this.homelevel = homelevel;
            }

            public static class RoomlevelBean {

                @SerializedName("floors")
                private List<FloorsBean> floors;

                public List<FloorsBean> getFloors() {
                    return floors;
                }

                public void setFloors(List<FloorsBean> floors) {
                    this.floors = floors;
                }

                public static class FloorsBean {

                    /**
                     * floor_id : 1 floor_name : Ground Floor position : 1 rooms :
                     * [{"room_id":"1","room_name":"Home Theater","position":"1","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}},{"room_id":"14","room_name":"Entrance
                     * Foyer","position":"5","is_subroom":0,"room_type_id":"1","is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"15","room_name":"Library","position":"2","is_subroom":0,"room_type_id":"1","is_module_exists":true,"room_permissions":{"others":["ac","light"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"18","room_name":"Kitchen","position":"3","is_subroom":1,"subrooms":[{"room_id":"17","room_name":"Kitchen","position":"3.01","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["fan","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"19","room_name":"Store
                     * Room","position":"3.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]},{"room_id":"20","room_name":"Pool
                     * Area","position":"4","is_subroom":1,"subrooms":[{"room_id":"16","room_name":"Pool","position":"4.01","is_subroom":1,"is_module_exists":true,"room_permissions":{"others":["fan","light","roomambience"],"audio":["music","webradio"],"video":[],"is_mzm":true,"is_demo_mode":false}},{"room_id":"21","room_name":"Green
                     * Room","position":"4.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]}]
                     */

                    @SerializedName("floor_id")
                    private String floorId;
                    @SerializedName("floor_name")
                    private String floorName;
                    @SerializedName("position")
                    private String position;
                    @SerializedName("abbreviation")
                    private String abbreviation;
                    @SerializedName("rooms")
                    private List<RoomsBean> rooms;

                    public String getFloorId() {
                        return floorId;
                    }

                    public void setFloorId(String floorId) {
                        this.floorId = floorId;
                    }

                    public String getFloorName() {
                        return floorName;
                    }

                    public String getAbbreviation() {
                        return abbreviation;
                    }

                    public void setAbbreviation(String abbreviation) {
                        this.abbreviation = abbreviation;
                    }

                    public void setFloorName(String floorName) {
                        this.floorName = floorName;
                    }

                    public String getPosition() {
                        return position;
                    }

                    public void setPosition(String position) {
                        this.position = position;
                    }

                    public List<RoomsBean> getRooms() {
                        return rooms;
                    }

                    public void setRooms(List<RoomsBean> rooms) {
                        this.rooms = rooms;
                    }

                    public static class RoomsBean {

                        /**
                         * room_id : 1 room_name : Home Theater position : 1 is_subroom : 0 room_type_id : 1
                         * is_module_exists : true room_permissions : {"others":["ac","curtain","lightmood","light","roomambience"],"audio":["music","spotify","tidal","webradio"],"video":["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"],"is_mzm":true,"is_demo_mode":false}
                         * subrooms : [{"room_id":"17","room_name":"Kitchen","position":"3.01","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["fan","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}},{"room_id":"19","room_name":"Store
                         * Room","position":"3.02","is_subroom":1,"is_module_exists":false,"room_permissions":{"others":["light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}}]
                         */
                        private String iconPojoString;
                        @SerializedName("type")
                        private int type;

                        @SerializedName("floar")
                        private String floar;

                        @SerializedName("room_id")
                        private String roomId;
                        @SerializedName("room_name")
                        private String roomName;
                        @SerializedName("position")
                        private String position;
                        @SerializedName("is_subroom")
                        private int isSubroom;
                        @SerializedName("room_type_id")
                        private String roomTypeId;
                        @SerializedName("is_module_exists")
                        private boolean isModuleExists;
                        @SerializedName("room_permissions")
                        private RoomPermissionsBean roomPermissions;

                        @SerializedName("subrooms")
                        private List<SubroomsBean> subrooms = new ArrayList<>();


                        public String getIconPojoString() {
                            return iconPojoString;
                        }

                        public void setIconPojoString(String iconPojoString) {
                            this.iconPojoString = iconPojoString;
                        }

                        public int getType() {
                            return type;
                        }

                        public void setType(int type) {
                            this.type = type;
                        }

                        public String getFloar() {
                            return floar;
                        }

                        public void setFloar(String floar) {
                            this.floar = floar;
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

                        public String getPosition() {
                            return position;
                        }

                        public void setPosition(String position) {
                            this.position = position;
                        }

                        public int getIsSubroom() {
                            return isSubroom;
                        }

                        public void setIsSubroom(int isSubroom) {
                            this.isSubroom = isSubroom;
                        }

                        public String getRoomTypeId() {
                            return roomTypeId;
                        }

                        public void setRoomTypeId(String roomTypeId) {
                            this.roomTypeId = roomTypeId;
                        }

                        public boolean isIsModuleExists() {
                            return isModuleExists;
                        }

                        public void setIsModuleExists(boolean isModuleExists) {
                            this.isModuleExists = isModuleExists;
                        }

                        public RoomPermissionsBean getRoomPermissions() {
                            return roomPermissions;
                        }

                        public void setRoomPermissions(RoomPermissionsBean roomPermissions) {
                            this.roomPermissions = roomPermissions;
                        }

                        public List<SubroomsBean> getSubrooms() {
                            return subrooms;
                        }

                        public void setSubrooms(List<SubroomsBean> subrooms) {
                            this.subrooms = subrooms;
                        }

                        public static class RoomPermissionsBean {

                            /**
                             * others : ["ac","curtain","lightmood","light","roomambience"] audio :
                             * ["music","spotify","tidal","webradio"] video : ["digitalcinema","movie","personalvideo","photo","channelprovider","tvshow"]
                             * is_mzm : true is_demo_mode : false
                             */

                            @SerializedName("is_mzm")
                            private boolean isMzm;
                            @SerializedName("is_demo_mode")
                            private boolean isDemoMode;
                            @SerializedName("others")
                            private List<String> others;
                            @SerializedName("audio")
                            private List<String> audio;
                            @SerializedName("video")
                            private List<String> video;

                            public boolean isIsMzm() {
                                return isMzm;
                            }

                            public void setIsMzm(boolean isMzm) {
                                this.isMzm = isMzm;
                            }

                            public boolean isIsDemoMode() {
                                return isDemoMode;
                            }

                            public void setIsDemoMode(boolean isDemoMode) {
                                this.isDemoMode = isDemoMode;
                            }

                            public List<String> getOthers() {
                                return others;
                            }

                            public void setOthers(List<String> others) {
                                this.others = others;
                            }

                            public List<String> getAudio() {
                                return audio;
                            }

                            public void setAudio(List<String> audio) {
                                this.audio = audio;
                            }

                            public List<String> getVideo() {
                                return video;
                            }

                            public void setVideo(List<String> video) {
                                this.video = video;
                            }
                        }

                        public static class SubroomsBean {

                            /**
                             * room_id : 17 room_name : Kitchen position : 3.01 is_subroom : 1 is_module_exists :
                             * false room_permissions : {"others":["fan","light"],"audio":[],"video":[],"is_mzm":false,"is_demo_mode":false}
                             */

                            @SerializedName("room_id")
                            private String roomId;
                            @SerializedName("room_name")
                            private String roomName;
                            @SerializedName("position")
                            private String position;
                            @SerializedName("is_subroom")
                            private int isSubroom;
                            @SerializedName("is_module_exists")
                            private boolean isModuleExists;
                            @SerializedName("room_permissions")
                            private RoomPermissionsBeanX roomPermissions;

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

                            public String getPosition() {
                                return position;
                            }

                            public void setPosition(String position) {
                                this.position = position;
                            }

                            public int getIsSubroom() {
                                return isSubroom;
                            }

                            public void setIsSubroom(int isSubroom) {
                                this.isSubroom = isSubroom;
                            }

                            public boolean isIsModuleExists() {
                                return isModuleExists;
                            }

                            public void setIsModuleExists(boolean isModuleExists) {
                                this.isModuleExists = isModuleExists;
                            }

                            public RoomPermissionsBeanX getRoomPermissions() {
                                return roomPermissions;
                            }

                            public void setRoomPermissions(RoomPermissionsBeanX roomPermissions) {
                                this.roomPermissions = roomPermissions;
                            }

                            public static class RoomPermissionsBeanX {

                                /**
                                 * others : ["fan","light"] audio : [] video : [] is_mzm : false is_demo_mode :
                                 * false
                                 */

                                @SerializedName("is_mzm")
                                private boolean isMzm;
                                @SerializedName("is_demo_mode")
                                private boolean isDemoMode;
                                @SerializedName("others")
                                private List<String> others;
                                @SerializedName("audio")
                                private List<?> audio;
                                @SerializedName("video")
                                private List<?> video;

                                public boolean isIsMzm() {
                                    return isMzm;
                                }

                                public void setIsMzm(boolean isMzm) {
                                    this.isMzm = isMzm;
                                }

                                public boolean isIsDemoMode() {
                                    return isDemoMode;
                                }

                                public void setIsDemoMode(boolean isDemoMode) {
                                    this.isDemoMode = isDemoMode;
                                }

                                public List<String> getOthers() {
                                    return others;
                                }

                                public void setOthers(List<String> others) {
                                    this.others = others;
                                }

                                public List<?> getAudio() {
                                    return audio;
                                }

                                public void setAudio(List<?> audio) {
                                    this.audio = audio;
                                }

                                public List<?> getVideo() {
                                    return video;
                                }

                                public void setVideo(List<?> video) {
                                    this.video = video;
                                }
                            }
                        }
                    }
                }
            }

            public static class HomelevelBean {

                /**
                 * home_permissions : {"others":["equipment","multizonemusic","utility","homemood","doorphone"],"surveillance":["12","13","11"],"community":[]}
                 */

                @SerializedName("home_permissions")
                private HomePermissionsBean homePermissions;

                public HomePermissionsBean getHomePermissions() {
                    return homePermissions;
                }

                public void setHomePermissions(HomePermissionsBean homePermissions) {
                    this.homePermissions = homePermissions;
                }

                public static class HomePermissionsBean {

                    @SerializedName("others")
                    private List<String> others;
                    @SerializedName("surveillance")
                    private List<String> surveillance;
//                    @SerializedName("community")
//                    private List<?> community;

                    public List<String> getOthers() {
                        return others;
                    }

                    public void setOthers(List<String> others) {
                        this.others = others;
                    }

                    public List<String> getSurveillance() {
                        return surveillance;
                    }

                    public void setSurveillance(List<String> surveillance) {
                        this.surveillance = surveillance;
                    }

//                    public List<?> getCommunity() {
//                        return community;
//                    }
//
//                    public void setCommunity(List<?> community) {
//                        this.community = community;
//                    }
                }
            }
        }
    }
}
