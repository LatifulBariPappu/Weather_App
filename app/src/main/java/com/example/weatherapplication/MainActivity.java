package com.example.weatherapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText cityName,cityCode;
    Button getButton;
    TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityName=findViewById(R.id.search_city_edit_text);
        cityCode=findViewById(R.id.search_citycode_edit_text);
        getButton=findViewById(R.id.getBtn);
        resultTv=findViewById(R.id.resultTv);

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            }
        });
    }
}