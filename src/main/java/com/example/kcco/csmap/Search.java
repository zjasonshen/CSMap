package com.example.kcco.csmap;



import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;




public class Search extends ActionBarActivity {
    public final static String TERM = "com.example.kcco.csmap.TERM";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Need this method to grab the text from the text box and send it over to MapActivity.java and
     * call the method displaySearchPins( string )
     * @param view
     */
    public void findTerm( View view)
    {
        Intent intent = new Intent( this, MapMainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String term = editText.getText().toString();

        intent.putExtra(TERM, term);

        startActivity(intent);
    }


    /**
     * Will need to have a method that will return a buiding ID and transportation ID from the
     * search activity.
     */

}
