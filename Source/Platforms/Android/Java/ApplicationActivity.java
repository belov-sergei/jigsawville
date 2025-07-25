// Copyright ❤️ 2025, Wow Play

package com.wowplay.jigsawville;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ApplicationActivity extends Activity {
	static {
		System.loadLibrary("Jigsawville");
	}

	public native String GetText();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView textView = new TextView(this);
		textView.setText(GetText());

		setContentView(textView);
	}
} 