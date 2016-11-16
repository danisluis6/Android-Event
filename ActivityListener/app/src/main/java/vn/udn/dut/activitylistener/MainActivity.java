package vn.udn.dut.activitylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener{

    private TextView txt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        addActivityListener();
    }

    private void initComponents(){
        txt = (TextView)findViewById(R.id.txt);
        btn = (Button)findViewById(R.id.btn);
    }

    @Override
    public boolean onLongClick(View view) {
        if(view.getId()==R.id.btn){
            txt.setVisibility(View.INVISIBLE);
        }
        return false;
    }

    public void addActivityListener(){
        btn.setOnLongClickListener(this);
    }
}
