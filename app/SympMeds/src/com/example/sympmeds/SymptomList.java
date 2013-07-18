package com.example.sympmeds;
/*
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
*/
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SymptomList extends Activity {
	public final static String DRUG_LIST = "com.example.sympmeds.LIST";
	
	/**onCreate() is called when the MainActivity activity is started,
	 * which is at the start of the application.
	 * It has the default code plus code to start up the spinner.
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intent intent = getIntent();
        setContentView(R.layout.activity_main);
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        		this, R.array.symptom_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
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
    public void openList (View view) {
    	// Do something in response to button}
		Intent intent = new Intent(this, DrugList.class);
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		String text = spinner.getSelectedItem().toString();
		intent.putExtra(DRUG_LIST, text);
		startActivity(intent);
    }
    
}
