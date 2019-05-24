package com.dfl.rxhttp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Model {

    @SerializedName("status")
    private int status;
    @SerializedName("uid")
    private int uid;
    @SerializedName("start_to_data")
    private StartToDataBean startToData;
    @SerializedName("station_list")
    private List<StationListBean> stationList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public StartToDataBean getStartToData() {
        return startToData;
    }

    public void setStartToData(StartToDataBean startToData) {
        this.startToData = startToData;
    }

    public List<StationListBean> getStationList() {
        return stationList;
    }

    public void setStationList(List<StationListBean> stationList) {
        this.stationList = stationList;
    }

    public static class StartToDataBean {
        @SerializedName("1_7")
        private List<String> $17;
        @SerializedName("7_1")
        private List<String> $71;
        @SerializedName("1_3")
        private List<String> $13;
        @SerializedName("3_1")
        private List<String> $31;

        public List<String> get$17() {
            return $17;
        }

        public void set$17(List<String> $17) {
            this.$17 = $17;
        }

        public List<String> get$71() {
            return $71;
        }

        public void set$71(List<String> $71) {
            this.$71 = $71;
        }

        public List<String> get$13() {
            return $13;
        }

        public void set$13(List<String> $13) {
            this.$13 = $13;
        }

        public List<String> get$31() {
            return $31;
        }

        public void set$31(List<String> $31) {
            this.$31 = $31;
        }
    }

    public static class StationListBean {
        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("sub_name")
        private String subName;
        @SerializedName("city_name")
        private String cityName;
        @SerializedName("is_hot")
        private String isHot;
        @SerializedName("city_code")
        private String cityCode;
        @SerializedName("ad_code")
        private String adCode;
        @SerializedName("lng")
        private String lng;
        @SerializedName("lat")
        private String lat;
        @SerializedName("limit_point")
        private String limitPoint;
        @SerializedName("is_coerce")
        private String isCoerce;
        @SerializedName("is_scenic")
        private String isScenic;
        @SerializedName("is_pan_off")
        private String isPanOff;
        @SerializedName("state")
        private String state;
        @SerializedName("sort")
        private String sort;
        @SerializedName("remark")
        private String remark;
        @SerializedName("is_delete")
        private String isDelete;

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

        public String getSubName() {
            return subName;
        }

        public void setSubName(String subName) {
            this.subName = subName;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getIsHot() {
            return isHot;
        }

        public void setIsHot(String isHot) {
            this.isHot = isHot;
        }

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }

        public String getAdCode() {
            return adCode;
        }

        public void setAdCode(String adCode) {
            this.adCode = adCode;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLimitPoint() {
            return limitPoint;
        }

        public void setLimitPoint(String limitPoint) {
            this.limitPoint = limitPoint;
        }

        public String getIsCoerce() {
            return isCoerce;
        }

        public void setIsCoerce(String isCoerce) {
            this.isCoerce = isCoerce;
        }

        public String getIsScenic() {
            return isScenic;
        }

        public void setIsScenic(String isScenic) {
            this.isScenic = isScenic;
        }

        public String getIsPanOff() {
            return isPanOff;
        }

        public void setIsPanOff(String isPanOff) {
            this.isPanOff = isPanOff;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(String isDelete) {
            this.isDelete = isDelete;
        }
    }
}
