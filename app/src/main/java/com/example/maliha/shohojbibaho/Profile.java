package com.example.maliha.shohojbibaho;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private TextView name,username,emailid,gender,birthday,religion,country,weight,blood,height,contact,worksat,designation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);

        name = findViewById(R.id.name);
        username = findViewById(R.id.username);
        emailid = findViewById(R.id.emailid);
        gender = findViewById(R.id.gen);
        birthday = findViewById(R.id.birthday);
        religion = findViewById(R.id.rel);
        country = findViewById(R.id.country);
        weight = findViewById(R.id.weightp);
        blood = findViewById(R.id.bloodp);
        height = findViewById(R.id.heightp);
        contact = findViewById(R.id.contactnop);
        worksat = findViewById(R.id.worksatp);
        designation = findViewById(R.id.designationp);

        SharedPreferences session = PreferenceManager.getDefaultSharedPreferences(this);
        name.setText(session.getString("f","") + " " + session.getString("l",""));
        username.setText(session.getString("username",""));
        emailid.setText(session.getString("e",""));
        gender.setText(session.getString("g",""));
        birthday.setText(session.getString("d","") + " " + session.getString("m","") + " " + session.getString("y",""));
        religion.setText(session.getString("r",""));
        country.setText(session.getString("c",""));

        weight.setText(session.getString("w","") + " kg");
        blood.setText(session.getString("b",""));
        height.setText(session.getString("hf","") + "'" + session.getString("hi","")+"''");
        contact.setText(session.getString("cn",""));
        worksat.setText(session.getString("wa",""));
        designation.setText(session.getString("des",""));
    }
}
