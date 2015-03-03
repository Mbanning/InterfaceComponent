package com.masonbanning.interfacecomponent;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class Component extends ActionBarActivity {
    Button button;
    Button button2;
    Button button3;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_component, menu);
        return true;
    }

    public void onCheckBoxClicked(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();

        if (checked) {
           button.setVisibility(view.VISIBLE);
           button2.setVisibility(view.VISIBLE);
           button3.setVisibility(view.VISIBLE);
           button4.setVisibility(view.VISIBLE);
        }
        else
        {
            button.setVisibility(view.GONE);
            button2.setVisibility(view.GONE);
            button3.setVisibility(view.GONE);
            button4.setVisibility(view.GONE);
        }
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
