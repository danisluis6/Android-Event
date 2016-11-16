package vn.udn.dut.viewsubclassing;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        xulyDoiManHinh();
    }

    private void initComponents(){
        btn = (RelativeLayout)findViewById(R.id.activity_main);
    }

    private void xulyDoiManHinh(){

        final LinearLayout other = new LinearLayout(this);
        other.setOrientation(LinearLayout.VERTICAL);

        Button btnA  = new Button(this);
        btnA.setWidth(300);
        btnA.setHeight(100);
        btnA.setText("Button A");

        Button btnB = new Button(this);
        btnB.setWidth(300);
        btnB.setHeight(100);
        btnB.setText("Button B");

        Button btnC = new Button(this){
            @Override
            public boolean performClick(){
                setContentView(R.layout.activity_main);
                return super.performClick();
            }
        };
        btnB.setWidth(300);
        btnB.setHeight(100);
        btnB.setText("Come Back");

        other.addView(btnA);
        other.addView(btnB);
        other.addView(btnC);

        setContentView(other);
    }
}
