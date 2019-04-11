package com.example.droidcafe;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView t = findViewById(R.id.order_textview);
        t.setText(message);
        rg = (RadioGroup) findViewById(R.id.rg);
       // rg.setOnCheckedChangeListener(this);


    }

 public void displayToast(String message){
     Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
 }

    public void onRadioButtonClicked(View view) {
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.sameday:
                if(checked)
                    displayToast(getString(R.string.sameday));
               // Toast.makeText(getApplicationContext(), "sameday", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nextday:
                if(checked)
                    displayToast(getString(R.string.nextday));
               // Toast.makeText(getApplicationContext(), "nextday", Toast.LENGTH_SHORT).show();
                break;


            case R.id.pickup:
                if(checked)
                    displayToast(getString(R.string.pickup));
                //Toast.makeText(getApplicationContext(), "pickup", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /*@Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int groupid = group.getId();

            if (R.id.sameday == checkedId) {
                Log.e("Radiobtn", "####");
                Toast.makeText(getApplicationContext(), "sameday", Toast.LENGTH_SHORT).show();
            }


    }*/
}