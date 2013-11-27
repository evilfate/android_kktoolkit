package com.example.kktoolkitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.kkbox.toolkit.ui.KKActivityDelegate;
import com.kkbox.toolkit.ui.KKFragment;
import com.kkbox.toolkit.ui.KKServiceActivity;

public class ExampleActivity extends ActionBarActivity implements KKServiceActivity {

	private KKActivityDelegate delegate;

	public ExampleActivity() {
		delegate = new KKActivityDelegate(this);
	}

	@Override
	public void startActivityIfNoDialog(Intent intent) {
		delegate.startActivityIfNoDialog(intent);
	}

	@Override
	public void finishIfNoDialog() {
		delegate.finishIfNoDialog();
	}

	@Override
	public void startActivityForResultIfNoDialog(Intent intent, int requestCode) {
		delegate.startActivityForResultIfNoDialog(intent, requestCode);
	}

	@Override
	public void sendMessageToActiveSubFragments(Bundle arguments) {
		delegate.sendMessageToActiveSubFragments(arguments);
	}

	@Override
	public void finishAllKKActivity() {
		delegate.finishAllKKActivity();
	}

	@Override
	public void activateSubFragment(KKFragment fragment) {
		delegate.activateSubFragment(fragment);
	}

	@Override
	public void deactivateSubFragment(KKFragment fragment) {
		delegate.deactivateSubFragment(fragment);
	}

	@Override
	public void onServiceStarted() {}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		delegate.onCreate(savedInstanceState);
	}

	@Override
	protected void onResume() {
		super.onResume();
		delegate.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		delegate.onPause();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		delegate.onDestroy();
	}
}
