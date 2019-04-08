package com.example.munia.employeemanagement;

import java.io.Serializable;

/**
 * Created by munia on 12/1/2017.
 */

public class Project implements Serializable{

    private String projectName;
    private int projectNo;
    private String projectMember;

    public Project(String projectName, int projectNo, String projectMember){
        this.projectName = projectName;
        this.projectNo = projectNo;
        this.projectMember = projectMember;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectMember() {
        return projectMember;
    }

    public void setProjectMember(String projectMember) {
        this.projectMember = projectMember;
    }

    public String showDetails() {
        return " [\nprojectName = " + projectName +"\nprojectNo = " + projectNo +"\nprojectMember = " + projectMember + "]\n ";
    }
}
