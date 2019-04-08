package com.example.munia.employeemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText employee_name;
    EditText employee_id;
    EditText employee_desig;
    Button take_address;
    Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employee_name = (EditText) findViewById(R.id.emp_name);
        employee_id = (EditText) findViewById(R.id.emp_id);
        employee_desig = (EditText) findViewById(R.id.emp_desig);

        take_address = (Button) findViewById(R.id.go_address);

        take_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String e_name = employee_name.getText().toString();
                String e_id = employee_id.getText().toString();
                String e_desig = employee_desig.getText().toString();

                employee = new Employee();
                employee.setEmployeeName(e_name);
                employee.setEmployeeId(e_id);
                employee.setEmployeeDesignation(e_desig);

                Intent intent = new Intent(MainActivity.this,AddressActivity.class);
                intent.putExtra("employeeFromMainActivity" ,employee);
                startActivity(intent);
            }
        });
    }
}
