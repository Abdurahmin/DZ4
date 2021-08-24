package com.example.listviewexampie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MonthDetail extends AppCompatActivity {
    TextView txtMonthname, txtDays, txtHour;
    int days;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_detail);
        txtMonthname = (TextView) findViewById(R.id.montName);
        txtDays = (TextView) findViewById(R.id.txtDays);
        txtHour = (TextView) findViewById(R.id.txtHour);
        Intent intent = getIntent();
        txtMonthname.setText(intent.getStringExtra("selact"));

        String monthName = txtMonthname.getText().toString();
        if (monthName.equals("Таалай")
                || monthName.equals("Айжан")
                || monthName.equals("Айдай")
                || monthName.equals("Жаркын")) {


            days = 99999709;
            txtDays.setText(txtDays.getText() + "" + days);
        } else if (monthName.equals("Алтын")) {
            days = 55555909;
            txtDays.setText(txtDays.getText() + "" + days);

        } else {
            days = 787869898;
            txtDays.setText(txtDays.getText() + "" + days);
        }
        txtHour.setText(txtHour.getText()+""+days*156);
    }
}