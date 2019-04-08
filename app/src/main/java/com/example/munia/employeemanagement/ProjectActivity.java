package com.example.munia.employeemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class ProjectActivity extends AppCompatActivity {

    EditText proj_name, proj_no, proj_mem;
    Button take_project, take_homePage;
    Employee employee;
    ArrayList<Project> projects;
    String p_name, p_member;
    int p_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        employee = (Employee) getIntent().getSerializableExtra("employeeFromAddressActivity");
        projects = new ArrayList<>();
        proj_name = (EditText) findViewById(R.id.pro_name);
        proj_no = (EditText) findViewById(R.id.pro_no);
        proj_mem = (EditText) findViewById(R.id.pro_member);

        take_project = (Button) findViewById(R.id.add_pro);
        take_homePage = (Button) findViewById(R.id.go_home);

        take_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p_name = proj_name.getText().toString();
                p_no = Integer.parseInt(proj_no.getText().toString());
                p_member = proj_mem.getText().toString();
                projects.add(new Project(p_name,p_no,p_member));

                proj_name.setText("");
                proj_no.setText("");
                proj_mem.setText("");
            }
        });

        take_homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                employee.setProject(projects);
                Intent intent = new Intent(ProjectActivity.this,HomeActivity.class);
                intent.putExtra("employeeFromProjectActivity",employee);
                startActivity(intent);
            }
        });
    }
}
