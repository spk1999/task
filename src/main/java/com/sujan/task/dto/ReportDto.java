package com.sujan.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReportDto {

    private String location;
    @JsonProperty("vehicle_no")
    private String vehicleNo;
    @JsonProperty("camera_details")
    private String cameraDetails;

    public ReportDto(String location, String vehicleNo, String cameraDetails) {
        this.location = location;
        this.vehicleNo = vehicleNo;
        this.cameraDetails = cameraDetails;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getCameraDetails() {
        return cameraDetails;
    }

    public void setCameraDetails(String cameraDetails) {
        this.cameraDetails = cameraDetails;
    }
}
