package com.example.munia.employeemanagement;

import java.io.Serializable;

/**
 * Created by munia on 12/1/2017.
 */

public class Address implements Serializable{

    private String houseNo;
    private String roadNo;
    private String city;
    private String ZipCode;

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }
}
