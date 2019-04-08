package com.example.munia.employeemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    EditText add_house,add_road,add_city,add_zip;
    Button take_project;
    Employee employee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        employee = (Employee) getIntent().getSerializableExtra("employeeFromMainActivity");

        add_house = (EditText) findViewById(R.id.house_no);
        add_road = (EditText) findViewById(R.id.road_no);
        add_city = (EditText) findViewById(R.id.city);
        add_zip = (EditText) findViewById(R.id.zip_code);

        take_project = (Button) findViewById(R.id.go_project);

        take_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a_house = add_house.getText().toString();
                String a_road = add_road.getText().toString();
                String a_city = add_city.getText().toString();
                String a_zip = add_zip.getText().toString();

                Address address = new Address();
                address.setHouseNo(a_house);
                address.setRoadNo(a_road);
                address.setCity(a_city);
                address.setZipCode(a_zip);
                employee.setAddress(address);

                Intent intent = new Intent(AddressActivity.this,ProjectActivity.class);
                intent.putExtra("employeeFromAddressActivity" ,employee);
                startActivity(intent);
            }
        });
    }
}
