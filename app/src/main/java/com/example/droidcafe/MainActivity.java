package com.example.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String mOrdermessage;
    public static final String EXTRA_MESSAGE = "Extra_Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void btnClicked(View v){
        Intent intent=new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra(EXTRA_MESSAGE,mOrdermessage);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        /*int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_order) {
            return true;
        }
*/
        switch(item.getItemId()){
            case R.id.action_order:
                displayToast(getString(R.string.action_order_message));
                Intent intent=new Intent(MainActivity.this, OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE,mOrdermessage);
                startActivity(intent);

                return true;
                //break;
            case R.id.action_status:
                displayToast(getString(R.string.action_status_message));
                return true;
                //break;
            case R.id.action_favorites:
                displayToast(getString(R.string.action_favorites_messages));
                return true;
                //break;
            case R.id.action_contact:
                displayToast(getString(R.string.action_contact_message));
                return true;
                //break;
             default:
                 //break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void donutToast(View v){
        mOrdermessage=(getString(R.string.donut_order_message));
        displayToast(mOrdermessage);
    }

    public void icecreamToast(View v){
        mOrdermessage=(getString(R.string.icecream_order_message));
        displayToast(mOrdermessage);
    }

    public void froyoToast(View v){

        mOrdermessage=(getString(R.string.froyo_order_message));
        displayToast(mOrdermessage);
    }
}
