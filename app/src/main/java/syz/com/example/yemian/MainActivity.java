package syz.com.example.yemian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.bt1);

        Button button2=findViewById(R.id.bt2);

        Button button3=findViewById(R.id.bt3);





        button1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,FiestActivity.class);

                startActivity(intent);

            }

        });







        button2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,SecondActivity.class);

                startActivity(intent);

            }

        });



        button3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,ThirdActivity.class);

                startActivity(intent);

            }

        });

    }
}


