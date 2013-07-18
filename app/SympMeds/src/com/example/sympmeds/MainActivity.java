package com.example.sympmeds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	public final static String SYMPTOM_LIST = "com.example.sympmeds.LIST";
	
	/**onCreate() is called when the MainActivity activity is started,
	 * which is at the start of the application.
	 * It has the default code plus code to start up the spinner.
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This was generated by default by Eclipse
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /** Called when the user clicks the Search button.
     * It calls up the DrugList activity with the list that is respect to
     * what is selected from the spinner in this activity.
     */
    public void start(View view) {
    	// Do something in response to button}
		Intent intent = new Intent(this, SymptomList.class);
		String blank = getResources().getString(R.string.app_name);
		intent.putExtra(SYMPTOM_LIST, blank);
		
		startActivity(intent);
    }
    
}
