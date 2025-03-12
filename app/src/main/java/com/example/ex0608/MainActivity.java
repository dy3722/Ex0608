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
    String tv3upSt;
    String tv3downSt;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hatunaTextView();
        hatunaEditText();
        hatunaImageView();
        hatunaButton();
        hatunaLinearLayout();

        sum = 0;

        rnd = new Random();
        tv1upNum = rnd.nextInt(100-10)+10;
        tv1upSt = "" + tv1upNum;
        tv1up.setText(tv1upSt);
        tv1downNum = rnd.nextInt(100-10)+10;
        tv1downSt = "" + tv1downNum;
        tv1down.setText(tv1downSt);

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
        if (stage1 && !(et1.getText().toString().equals("")))
        {
            et1text = et1.getText().toString();
            et1num = Integer.parseInt(et1text);
            if (et1num == tv1upNum+tv1downNum)
            {
                iv1.setVisibility(View.VISIBLE);
                iv1.setImageResource(R.drawable.v_photo);
                sum++;
            }
            else
            {
                iv1.setVisibility(View.VISIBLE);
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

    public void check2(View view) {
        if (stage2 && !(et2.getText().toString().equals("")))
        {
            et2text = et2.getText().toString();
            et2num = Integer.parseInt(et2text);
            if (et2num == tv2upNum+tv2downNum)
            {
                iv2.setVisibility(View.VISIBLE);
                iv2.setImageResource(R.drawable.v_photo);
                sum++;
            }
            else
            {
                iv2.setVisibility(View.VISIBLE);
                iv2.setImageResource(R.drawable.x_photo);
            }
            stage2 = !stage2;
            stage3 = !stage3;
            ll3.setVisibility(View.VISIBLE);
            tv3upNum = tv2upNum+tv2downNum;
            tv3upSt = "" + tv3upNum;
            tv3up.setText(tv3upSt);
            tv3downNum = rnd.nextInt(100-10)+10;
            tv3downSt = "" + tv3downNum;
            tv3down.setText(tv3downSt);

        }
    }

    public void check3(View view) {
        if (stage3 && !(et3.getText().toString().equals("")))
        {
            et3text = et3.getText().toString();
            et3num = Integer.parseInt(et3text);
            if (et3num == tv3upNum+tv3downNum)
            {
                iv3.setVisibility(View.VISIBLE);
                iv3.setImageResource(R.drawable.v_photo);
                sum++;
            }
            else
            {
                iv3.setVisibility(View.VISIBLE);
                iv3.setImageResource(R.drawable.x_photo);
            }
            stage3 = !stage3;

            if (sum == 0)
            {
                btnNew.setText("0% , 0/3");
            }
            else if (sum == 1)
            {
                btnNew.setText("33.3% , 1/3");
            }
            else if (sum == 2)
            {
                btnNew.setText("66.6% , 2/3");
            }
            else
            {
                btnNew.setText("100% , 3/3");
            }
        }
    }

    public void newGame(View view) {
        tv1upNum = rnd.nextInt(100-10)+10;
        tv1upSt = "" + tv1upNum;
        tv1up.setText(tv1upSt);
        tv1downNum = rnd.nextInt(100-10)+10;
        tv1downSt = "" + tv1downNum;
        tv1down.setText(tv1downSt);
        et1.getText().clear();
        et2.getText().clear();
        et3.getText().clear();
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        ll2.setVisibility(View.INVISIBLE);
        ll3.setVisibility(View.INVISIBLE);
        stage1 = true;
        stage2 = false;
        stage3 = false;
        btnNew.setText("New");
        sum = 0;
    }
}