package com.jeekiarn.horizontal_listview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	private HorizoantalListView mHlvSimpleList;

	private CustomData[] mCustomData = new CustomData[] {
			new CustomData(Color.RED, "Red"),
			new CustomData(Color.DKGRAY, "Dark Gray"),
			new CustomData(Color.GREEN, "Green"),
			new CustomData(Color.LTGRAY, "Light Gray"),
			new CustomData(Color.WHITE, "White"),
			new CustomData(Color.RED, "Red"),
			new CustomData(Color.BLACK, "Black"),
			new CustomData(Color.CYAN, "Cyan"),
			new CustomData(Color.DKGRAY, "Dark Gray"),
			new CustomData(Color.GREEN, "Green"),
			new CustomData(Color.RED, "Red"),
			new CustomData(Color.LTGRAY, "Light Gray"),
			new CustomData(Color.WHITE, "White"),
			new CustomData(Color.BLACK, "Black"),
			new CustomData(Color.CYAN, "Cyan"),
			new CustomData(Color.DKGRAY, "Dark Gray"),
			new CustomData(Color.GREEN, "Green"),
			new CustomData(Color.LTGRAY, "Light Gray"),
			new CustomData(Color.RED, "Red"),
			new CustomData(Color.WHITE, "White"),
			new CustomData(Color.DKGRAY, "Dark Gray"),
			new CustomData(Color.GREEN, "Green"),
			new CustomData(Color.LTGRAY, "Light Gray"),
			new CustomData(Color.WHITE, "White"),
			new CustomData(Color.RED, "Red"),
			new CustomData(Color.BLACK, "Black"),
			new CustomData(Color.CYAN, "Cyan"),
			new CustomData(Color.DKGRAY, "Dark Gray"),
			new CustomData(Color.GREEN, "Green"),
			new CustomData(Color.LTGRAY, "Light Gray"),
			new CustomData(Color.RED, "Red"),
			new CustomData(Color.WHITE, "White"),
			new CustomData(Color.BLACK, "Black"),
			new CustomData(Color.CYAN, "Cyan"),
			new CustomData(Color.DKGRAY, "Dark Gray"),
			new CustomData(Color.GREEN, "Green"),
			new CustomData(Color.LTGRAY, "Light Gray") };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mHlvSimpleList = (HorizoantalListView) findViewById(R.id.hlvSimpleList);
		CustomArrayAdapter adapter = new CustomArrayAdapter(this, mCustomData);

		// Assign adapter to HorizontalListView
		mHlvSimpleList.setAdapter(adapter);
		mHlvSimpleList.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
