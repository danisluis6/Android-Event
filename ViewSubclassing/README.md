# Android-Event

    [Event] onClickXML
    + Definition XML or GUI

![alt tag](https://github.com/danisluis6/Android-Event/blob/master/ViewSubclassingListener/1.png)
![alt tag](https://github.com/danisluis6/Android-Event/blob/master/ViewSubclassingListener/2.png)

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
	    android:layout_margin="20dp"
	    android:onClick="xuLyDoiManHinh"
	    android:background="@color/colorAccent"
	    tools:context="vn.udn.dut.viewsubclassing.MainActivity">

	</RelativeLayout>

    + Definition MainActivity

	package vn.udn.dut.viewsubclassing;

	import android.app.Activity;
	import android.support.v7.app.AppCompatActivity;
	import android.os.Bundle;
	import android.widget.Button;
	import android.widget.LinearLayout;
	import android.widget.RelativeLayout;

	public class MainActivity extends AppCompatActivity {

	    private RelativeLayout btn;

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initComponents();
		xulyDoiManHinh();
	    }

	    private void initComponents(){
		btn = (RelativeLayout)findViewById(R.id.activity_main);
	    }

	    private void xulyDoiManHinh(){

		final LinearLayout other = new LinearLayout(this);
		other.setOrientation(LinearLayout.VERTICAL);

		Button btnA  = new Button(this);
		btnA.setWidth(300);
		btnA.setHeight(100);
		btnA.setText("Button A");

		Button btnB = new Button(this);
		btnB.setWidth(300);
		btnB.setHeight(100);
		btnB.setText("Button B");

		Button btnC = new Button(this){
		    @Override
		    public boolean performClick(){
		        setContentView(R.layout.activity_main);
		        return super.performClick();
		    }
		};
		btnB.setWidth(300);
		btnB.setHeight(100);
		btnB.setText("Come Back");

		other.addView(btnA);
		other.addView(btnB);
		other.addView(btnC);

		setContentView(other);
	    }
	}

  	




