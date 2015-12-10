package org.apache.cordova.faizmolpay;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException{
		if (action.equals("dopay")){
			setContentView(R.layout.activity_payment_page);
		}
	}