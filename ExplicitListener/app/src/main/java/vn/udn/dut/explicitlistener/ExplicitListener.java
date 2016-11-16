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
