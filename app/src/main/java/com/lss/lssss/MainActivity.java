package com.lss.lssss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }



    private void initView() {
        Button button = findViewById(R.id.button2);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        CardView cardView = findViewById(R.id.cardView3);
        CardView cardView4 = findViewById(R.id.cardView4);
        LinearLayout layout =findViewById(R.id.constraintLayout);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("") ){
                    button.setBackgroundColor(getColor(R.color.grey));
                }
                else {
                    button.setBackgroundColor(getColor(R.color.oreng));
                }
            }
        });
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( password.getText().toString().equals("")){
                    button.setBackgroundColor(getColor(R.color.grey));
                }
                else {
                    button.setBackgroundColor(getColor(R.color.oreng));
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистривались",Toast.LENGTH_LONG).show();
                    button.setVisibility(View.INVISIBLE);
                    email.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    textView3.setVisibility(View.INVISIBLE);
                    cardView.setVisibility(View.INVISIBLE);
                    cardView4.setVisibility(View.INVISIBLE);
                    layout.setVisibility(View.INVISIBLE);
                }
                else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}