package com.hackee.gcmtest1;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.android.gcm.GCMBaseIntentService;

public class GCMIntentService extends GCMBaseIntentService {

	@Override
	protected void onMessage(Context paramContext, Intent intent) {
		Log.d("AAAA", "Recv msg");
	}

	@Override
	protected void onError(Context paramContext, String paramString) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onRegistered(Context paramContext, String regId) {
		Log.d("AAAA", "Reg: " + regId);
	}

	@Override
	protected void onUnregistered(Context paramContext, String regId) {
		Log.d("AAAA", "unReg: " + regId);
	}

}
