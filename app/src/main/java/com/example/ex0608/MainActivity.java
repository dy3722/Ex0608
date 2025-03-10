package com.example.ex0608;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Random;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv1up,tv1down,tv2up,tv2down,tv3up,tv3down;
    EditText et1,et2,et3;
    ImageView iv1,iv2,iv3;
    Button btn1,btn2,btn3,btnNew;
    LinearLayout ll2,ll3;
    Random rnd;
    int tv1upNum;
    int tv1downNum;
    int tv2upNum;
    int tv2downNum;
    int tv3upNum;
    int tv3downNum;
    String et1text;
    int et1num;
    String et2text;
    int et2num;
    String et3text;
    int et3num;
    boolean stage1 = true;
    boolean stage2 = false;
    boolean stage3 = false;
    String tv1upSt;
    String tv1downSt;
    String tv2upSt;
    String tv2downSt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hatunaTextView();
        hatunaEditText();
        hatunaImageView();
        hatunaButton();
        hatunaLinearLayout();

        rnd = new Random();
        tv1upNum = rnd.nextInt(100-10)+10;
        tv1upSt = "" + tv1upNum;
        tv1up.setText(tv1upSt);
        tv1downNum = rnd.nextInt(100-10)+10;
        tv1downSt = "" + tv1downNum;
        tv1down.setText(tv1downSt);

        /*
        et2text = et2.getText().toString();
        et2num = Integer.parseInt(et2text);
        et3text = et3.getText().toString();
        et3num = Integer.parseInt(et3text);

         */
    }

    private void hatunaLinearLayout() {
        ll2 = findViewById(R.id.ll2);
        ll3 = findViewById(R.id.ll3);
    }

    private void hatunaButton() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnNew = findViewById(R.id.btnNew);
    }

    private void hatunaImageView() {
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
    }

    private void hatunaEditText() {
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
    }

    private void hatunaTextView() {
        tv1up = findViewById(R.id.tv1up);
        tv1down = findViewById(R.id.tv1down);
        tv2up = findViewById(R.id.tv2up);
        tv2down = findViewById(R.id.tv2down);
        tv3up = findViewById(R.id.tv3up);
        tv3down = findViewById(R.id.tv3down);
    }

    public void check1(View view) {
        if (stage1)
        {
            et1text = et1.getText().toString();
            et1num = Integer.parseInt(et1text);
            if (et1num == tv1upNum+tv1downNum)
            {
                iv1.setImageResource(R.drawable.v_photo);
            }
            else
            {
                iv1.setImageResource(R.drawable.x_photo);
            }
            stage1 = !stage1;
            stage2 = !stage2;
            ll2.setVisibility(View.VISIBLE);
            tv2upNum = tv1upNum+tv1downNum;
            tv2upSt = "" + tv2upNum;
            tv2up.setText(tv2upSt);
            tv2downNum = rnd.nextInt(100-10)+10;
            tv2downSt = "" + tv2downNum;
            tv2down.setText(tv2downSt);
        }
    }
}