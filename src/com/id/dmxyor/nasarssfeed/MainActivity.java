package com.id.dmxyor.nasarssfeed;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        IotdHandler handler = new IotdHandler();
        handler.processFeed();
        
        resetDisplay(handler.getTitle(), handler.getDate(), handler.getImage(), handler.getDescription().toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void resetDisplay(String title, String date, Bitmap image, String description) {
    	TextView titleView = (TextView)findViewById(R.id.imageTitle);
    	titleView.setText(title);
    	
    	TextView dateView = (TextView)findViewById(R.id.imageDate);
    	dateView.setText(date);
    	
    	ImageView imageView = (ImageView)findViewById(R.id.imageDisplay);
    	imageView.setImageBitmap(image);

    	TextView descView = (TextView)findViewById(R.id.imageDescription);
    	descView.setText(description);

    }
    
}
