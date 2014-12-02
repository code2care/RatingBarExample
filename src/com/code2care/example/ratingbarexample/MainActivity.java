package com.code2care.example.ratingbarexample;

//Button icon form icon8.com 

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	RatingBar ratingBar;
	TextView rateMessage;
	String ratedValue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ratingBar = (RatingBar) findViewById(R.id.ratingBar);
		rateMessage = (TextView) findViewById(R.id.rateMessage);

		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {

				ratedValue = String.valueOf(ratingBar.getRating());
				rateMessage.setText("You have rated the Product : "
						+ ratedValue + "/5.");

			}
		});

	}

}
