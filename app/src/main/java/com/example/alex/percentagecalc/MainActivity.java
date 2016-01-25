package com.example.alex.percentagecalc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView totalTextView;
    EditText percentageTxt;
    EditText numberTxt;
    TextView hideTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentageTxt = (EditText) findViewById(R.id.percentageTxt);
        numberTxt = (EditText) findViewById(R.id.numberTxt);
        hideTxt = (TextView) findViewById(R.id.toHide);

        Button calcButton = (Button) findViewById(R.id.calcBtn);
        final Button secretButton = (Button) findViewById(R.id.sbutton);
        final ImageButton greenImageButton = (ImageButton) findViewById(R.id.greenButton);

        calcButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                float percentage = Float.parseFloat(percentageTxt.getText().toString());
                float dec = percentage/100;
                float total = dec*Float.parseFloat(numberTxt.getText().toString());
                totalTextView.setText(Float.toString(total));
                //if (hideTxt.getVisibility() == 0){
                // /   hideTxt.setVisibility(View.VISIBLE);
                //}
                //hideTxt.setVisibility(View.INVISIBLE);
                //hideTxt.setText(((String) secretButton.getVisibility()));
                secretButton.setVisibility(View.INVISIBLE);
                greenImageButton.setImageAlpha(0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
