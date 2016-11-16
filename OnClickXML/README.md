# Android-Event

    [Event] onClickXML
    + Definition XML or GUI

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
	    tools:context="vn.udn.dut.onclickxml.MainActivity">

	    <EditText
		android:id="@+id/a"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		android:hint="Please enter number a ?"
		android:padding="15dp"
		android:background="@android:color/transparent"/>

	    <EditText
		android:id="@+id/b"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		android:layout_marginTop="60dp"
		android:hint="Please enter number b ?"
		android:padding="15dp"
		android:background="@android:color/transparent"/>

	    <EditText
		android:id="@+id/c"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		android:layout_marginTop="120dp"
		android:hint=""
		android:textColor="@color/colorAccent"
		android:padding="15dp"
		android:background="@android:color/transparent"/>

	    <Button
		android:id="@+id/btnAdd"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:text="Addition"
		android:padding="5dp"
		android:layout_marginTop="180dp"
		android:onClick="xuLyPhepCong"/>
	</RelativeLayout>

    + Definition MainActivity

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


