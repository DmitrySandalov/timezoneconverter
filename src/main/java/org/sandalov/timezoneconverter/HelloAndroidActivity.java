package org.sandalov.timezoneconverter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {

	/**
	 * Called when the activity is first created.
	 * 
	 * @param savedInstanceState
	 *            If the activity is being re-initialized after previously being
	 *            shut down then this Bundle contains the data it most recently
	 *            supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it
	 *            is null.</b>
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView timeView = (TextView)findViewById(R.id.textViewTime);
		TextView dateView = (TextView)findViewById(R.id.textViewDate);
		
		Date now = new Date();
		Locale current = getResources().getConfiguration().locale;
		String time = new SimpleDateFormat("d MMM yyyy", current).format(now);
		String date = new SimpleDateFormat("HH:mm", current).format(now);
		timeView.setText(time);
		dateView.setText(date);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(org.sandalov.timezoneconverter.R.menu.main,
				menu);
		return true;
	}

}
