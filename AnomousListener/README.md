# Android-Event

    [Event] onClickXML
    + Definition XML or GUI

![alt tag](https://github.com/danisluis6/Android-Event/blob/master/AnomousListener/1.png)
![alt tag](https://github.com/danisluis6/Android-Event/blob/master/AnomousListener/2.png)

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
	    tools:context="vn.udn.dut.anomouslistener.MainActivity">
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:text="AnomousListener"
		android:id="@+id/txt"
		android:gravity="center"
		android:textColor="@color/colorAccent"
		android:textSize="30dp"/>
	</RelativeLayout>


    + Definition MainActivity

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




