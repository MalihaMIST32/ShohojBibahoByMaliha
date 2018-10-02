package com.example.maliha.shohojbibaho;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Successful extends AppCompatActivity {

    private TextView hey;
    public String lowercase(String x, String y){
        String name = "";
        int lx = x.length();
        int ly = y.length();
        char c;

        for(int i = 0; i<lx; i++){
            if(x.charAt(i) >='A' && x.charAt(i) <='Z'){
                c=x.charAt(i);
                int a = (int)c;
                a+=32;
                c = (char)a;
                name = name + c + "";
            }

            else    name = name + x.charAt(i) +"";
        }


        for(int i = 0; i<ly; i++){
            if(y.charAt(i) >='A' && y.charAt(i) <='Z'){
                c=y.charAt(i);
                int a = (int)c;
                a+=32;
                c = (char)a;
                name = name + c + "";
            }

            else    name = name + y.charAt(i) + "";
        }

        return name;
    }





    public void setUserName(){
        int PID = 0,len=0;
        DatabaseReference d;
        String name = "";

        d = FirebaseDatabase.getInstance().getReference("idGenerator");
        SharedPreferences session;
        session = PreferenceManager.getDefaultSharedPreferences(this);

        String firstName = "",lastName = "";

        firstName = session.getString("f","");
        lastName = session.getString("l","");

        name = lowercase(firstName,lastName);

        String s = session.getString("uid","");
        name = name +s;

        session.edit().putString("username", name).commit();
        //Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();

        len = s.length();

        for(int i = 1;  i<=len; i++){
            PID = PID*10 + s.charAt(i-1) -48;
        }

        PID++;
        ID id = new ID(PID , "abc");
        d.child("-LMsydJ-jiHwXFDakOEx").setValue(id);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_x);

        hey = findViewById(R.id.hey);
        final SharedPreferences session = PreferenceManager.getDefaultSharedPreferences(this);
        String f = session.getString("f","");
        String l = session.getString("l","");

        hey.setText("Hello " + f + " " + l);

        new CountDownTimer(1000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                setUserName();
                //Toast.makeText(getApplicationContext(),"Hello & Hi",Toast.LENGTH_SHORT).show();

                session.edit().putString("flag","1").commit();

                Intent intent = new Intent(Successful.this, Homepage.class);
                startActivity(intent);
            }
        }.start();
    }
}
