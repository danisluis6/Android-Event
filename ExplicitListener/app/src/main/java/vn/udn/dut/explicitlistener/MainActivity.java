package vn.udn.dut.explicitlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        addExplicitListener();
    }

    private void initComponents(){
        btn = (Button)findViewById(R.id.btn);
    }

    private void addExplicitListener(){
        btn.setOnClickListener(new ExplicitListener());
    }
}
