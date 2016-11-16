# Android-Event

    [Event] onClickXML
    + Definition XML or GUI

![alt tag](https://github.com/danisluis6/Android-Event/blob/master/VariableListener/1.png)
![alt tag](https://github.com/danisluis6/Android-Event/blob/master/VariableListener/2.png)

	<?xml version="1.0" encoding="utf-8"?>
	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:tools="http://schemas.android.com/tools"
	    android:id="@+id/activity_main"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:paddingBottom="@dimen/activity_vertical_margin"
	    android:paddingLeft="@dimen/activity_horizontal_margin"
	    android:paddingRight="@dimen/activity_horizontal_margin"
	    android:paddingTop="@dimen/activity_vertical_margin"
	    tools:context="vn.udn.dut.variablelistener.MainActivity">

	    <LinearLayout
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:orientation="horizontal"
		android:gravity="center">
		<EditText
		    android:id="@+id/randx"
		    android:layout_width="160dp"
		    android:layout_height="55dp"
		    android:gravity="center"
		    android:text="..."
		    android:background="@android:color/transparent"/>

		<EditText
		    android:id="@+id/randy"
		    android:layout_width="160dp"
		    android:layout_height="55dp"
		    android:gravity="center"
		    android:text="..."
		    android:background="@android:color/transparent"/>
	    </LinearLayout>

	    <EditText
		android:id="@+id/result"
		android:layout_width="match_parent"
		android:layout_height="55dp"
		android:layout_marginTop="60dp"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		android:background="@android:color/transparent"/>

	    <LinearLayout
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:orientation="horizontal"
		android:layout_marginTop="120dp"
		android:gravity="center">
		<Button
		    android:id="@+id/btnNhan"
		    android:layout_width="160dp"
		    android:text="Nhan"
		    android:textSize="18dp"
		    android:padding="10dp"
		    android:layout_height="wrap_content" />
		<Button
		    android:id="@+id/btnChia"
		    android:layout_width="160dp"
		    android:text="Chia"
		    android:textSize="18dp"
		    android:padding="10dp"
		    android:layout_height="wrap_content" />
	    </LinearLayout>
	</RelativeLayout>



    + Definition MainActivity

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
  	




