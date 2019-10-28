package syz.com.example.yemian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button6=findViewById(R.id.bt6);



        button6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent= new Intent(SecondActivity.this,SixthActivity.class);

                startActivity(intent);

            }

        });

    }
}
