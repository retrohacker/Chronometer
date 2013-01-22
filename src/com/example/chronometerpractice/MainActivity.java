package com.example.chronometerpractice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Chronometer chron = (Chronometer) this.findViewById(R.id.chronometer);
        TextView clockFace = (TextView) this.findViewById(R.id.clock);
        
        // Create an object for interfacing with the Chronometer
        OnTick chronInterface = new OnTick(clockFace, "HH:mm:ss");
        
        chron.setOnChronometerTickListener(chronInterface);
        chron.start();
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
