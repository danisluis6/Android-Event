package vn.udn.dut.anomouslistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        addAnomousListener();
    }

    private void initComponents() {
        txt = (TextView)findViewById(R.id.txt);
    }

    private void addAnomousListener(){
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Learn Anomous Listener",Toast.LENGTH_LONG).show();
            }
        });
    }
}
