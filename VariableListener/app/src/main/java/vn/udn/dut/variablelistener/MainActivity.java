package vn.udn.dut.variablelistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnNhan,btnChia;
    private EditText result,randx,randy;

    private View.OnClickListener operating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        addVariableListener();
    }

    private void initComponents() {
        randx = (EditText)findViewById(R.id.randx);
        randy = (EditText)findViewById(R.id.randy);
        result = (EditText)findViewById(R.id.result);
        btnNhan = (Button)findViewById(R.id.btnNhan);
        btnChia = (Button)findViewById(R.id.btnChia);
    }

    private void addVariableListener(){
        operating = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(view.getId()==R.id.btnNhan){
                    int a = new Random().nextInt(1000);
                    int b = new Random().nextInt(100)+10;
                    randx.setText(String.valueOf(a));
                    randy.setText(String.valueOf(b));
                    result.setText(String.valueOf(a*b));
                }
                if(view.getId()==R.id.btnChia){
                    int a = new Random().nextInt(1000);
                    int b = new Random().nextInt(100)+10;
                    randx.setText(String.valueOf(a));
                    randy.setText(String.valueOf(b));
                    result.setText(String.valueOf(a/b));
                }
            }
        };
        btnNhan.setOnClickListener(operating);
        btnChia.setOnClickListener(operating);
    }

}
