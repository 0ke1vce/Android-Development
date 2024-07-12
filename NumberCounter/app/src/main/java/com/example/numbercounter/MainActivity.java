package com.example.numbercounter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    Button rst;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.Number);
        btn=findViewById(R.id.button);
        rst=findViewById(R.id.resett);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                txt.setText(""+increaseCounter());

                String x=txt.getText().toString();
                int y=Integer.parseInt(x);   // To convert String to integer
                y++;
                x=Integer.toString(y);      //To convert Integer to string
                txt.setText(x);

            }
        });

        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String x="0";
                txt.setText(x);

//                txt.setText(reset());
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
  /*
    public int increaseCounter(){
        int x=Integer.parseInt(txt.getText().toString());
        return ++x;
    }
*/

   /* public String reset(){
        return "0";
        }
    */

}