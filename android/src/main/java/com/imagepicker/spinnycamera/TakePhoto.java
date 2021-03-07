package com.custom.camlib.spinnycamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.custom.camlib.MyDebug;


public class TakePhoto extends Activity {
	private static final String TAG = "TakePhoto";
	public static final String TAKE_PHOTO = "net.sourceforge.opencamera.TAKE_PHOTO";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		if( MyDebug.LOG )
			Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);

		Intent intent = new Intent(this, BaseSpinnyCameraActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.putExtra(TAKE_PHOTO, true);
		this.startActivity(intent);
		if( MyDebug.LOG )
			Log.d(TAG, "finish");
		this.finish();
	}

    protected void onResume() {
		if( MyDebug.LOG )
			Log.d(TAG, "onResume");
        super.onResume();
    }
}
