package vn.udn.dut.onclickxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText a,b,c;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

    }

    public void xuLyPhepCong(View v){
        int result = 0;
        try{
            result = Integer.parseInt(a.getText().toString()) + Integer.parseInt(b.getText().toString());
            throw  new LengthFormatException("Size of variable >= 2147483647");
        }catch (LengthFormatException ex){
            Log.d("ERROR",ex.toString());
        }

        c.setText(String.valueOf(result));
    }

    /**
     * Relation widget android in xml
     */
    private void initComponents(){
        a = (EditText)findViewById(R.id.a);
        b = (EditText)findViewById(R.id.b);
        c = (EditText)findViewById(R.id.c);
        btnAdd = (Button) findViewById(R.id.btnAdd);
    }
}
