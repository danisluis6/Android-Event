# Android-Event

    [Event] ExplicitListener
    + Definition XML or GUI

![alt tag](https://github.com/danisluis6/Android-Event/blob/master/ExplicitListener/1.png)
![alt tag](https://github.com/danisluis6/Android-Event/blob/master/ExplicitListener/2.png)

	package vn.udn.dut.explicitlistener;

	import android.content.Context;
	import android.util.Log;
	import android.view.View;
	import android.widget.Toast;

	/**
	 * Created by vuongluis on 16/11/2016.
	 */

	public class ExplicitListener implements View.OnClickListener,View.OnLongClickListener{

	    @Override
	    public void onClick(View view) {
		if(view.getId()==R.id.btn){
		    Log.d("TAG","OK");
		}
	    }

	    @Override
	    public boolean onLongClick(View view) {
		return false;
	    }
	}

    + Definition MainActivity

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
 
    + Definition XML

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
	    tools:context="vn.udn.dut.explicitlistener.MainActivity">

	    <Button
		android:id="@+id/btn"
		android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:gravity="center"
		android:text="Explicit As Listener"
		android:background="@color/colorPrimary"
		android:textColor="#ffffff"
		android:textSize="26dp"/>
	</RelativeLayout>





