package com.example.munia.employeemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    Employee employee;
    TextView showCommonInfo, showAddressInfo, showProjectInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        employee = (Employee) getIntent().getSerializableExtra("employeeFromProjectActivity");

        showCommonInfo = (TextView) findViewById(R.id.show_common_info);
        showAddressInfo = (TextView) findViewById(R.id.show_address_info);
        showProjectInfo = (TextView) findViewById(R.id.show_project_info);

        String showCommon;
        showCommon = "Name = "+ employee.getEmployeeName()+"\nID = "+employee.getEmployeeId()+"\nDesignation"+employee.getEmployeeDesignation();
        showCommonInfo.setText(showCommon);

        String road = employee.getAddress().getRoadNo();
        String house = employee.getAddress().getHouseNo();
        String city = employee.getAddress().getCity();
        String zip =  employee.getAddress().getZipCode();

        String showAddress;
        showAddress = "Road no = " + road + "\nHouse =  " + house +"\ncity = "+ city + "\nzip code = "+ zip;
        showAddressInfo.setText(showAddress);

        String showProject = "";
         int ln = employee.getProject().size();
         for (int i = 0;i < ln ; i++){

             showProject = showProject + "Project Serial = " + (i+1) + employee.getProject().get(i).showDetails();

         }
         showProjectInfo.setText(showProject);
    }
}
