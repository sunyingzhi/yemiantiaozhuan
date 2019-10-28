package syz.com.example.yemian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button button6=findViewById(R.id.bt7);



        button6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent= new Intent(ThirdActivity.this,SeventhActivity.class);

                startActivity(intent);

            }

        });
    }
}
