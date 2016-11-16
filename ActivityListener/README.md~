# Android-Event

    [Event] onClickXML
    + Definition XML or GUI

![alt tag](https://github.com/danisluis6/Android-Event/blob/master/ActivityListener/1.png)
![alt tag](https://github.com/danisluis6/Android-Event/blob/master/ActivityListener/2.png)

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
	    tools:context="vn.udn.dut.activitylistener.MainActivity">

	    <TextView
		android:id="@+id/txt"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:text="Hello World!"
		android:textColor="@color/colorAccent"
		android:textSize="36dp"
		android:layout_centerHorizontal="true"/>

	    <Button
		android:id="@+id/btn"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:text="Activity As Listener"
		android:gravity="center"
		android:padding="20dp"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		android:layout_marginTop="80dp"/>
	</RelativeLayout>
	
    + Definition MainActivity

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

  	




