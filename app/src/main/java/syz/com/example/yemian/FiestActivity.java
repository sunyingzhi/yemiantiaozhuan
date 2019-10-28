package syz.com.example.yemian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FiestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button4=findViewById(R.id.bt4);

        Button button5=findViewById(R.id.bt5);





        button4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent= new Intent(FiestActivity.this,FourthActivity.class);

                startActivity(intent);

            }

        });



        button5.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent= new Intent(FiestActivity.this,FifthActivity.class);

                startActivity(intent);

            }

        });

    }
}
