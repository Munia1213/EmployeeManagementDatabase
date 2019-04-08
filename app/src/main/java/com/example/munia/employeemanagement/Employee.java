package com.example.munia.employeemanagement;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by munia on 12/1/2017.
 */

public class Employee implements Serializable{

    private String employeeName;
    private String employeeId;
    private String employeeDesignation;
    private Address address;
    private ArrayList<Project>project;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setProject(ArrayList<Project> project) {
        this.project = project;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public Address getAddress() {
        return address;
    }

    public ArrayList<Project> getProject() {
        return project;
    }
}
