package com.example.acer.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


       /* Intent intent=new Intent(this,second.class);
        intent.putExtra("data",editText.getText().toString());
        startActivity(intent);*/



    public void open(View view) {
        switch (view.getId()){
            case R.id.web:
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
                startActivity(i);
                break;
            case R.id.dial:
                Intent i2=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7013345889"));
                startActivity(i2);
                break;
            case R.id.share:
                Intent i3 = new Intent();
                i3.setAction(Intent.ACTION_SEND);
                i3.putExtra(Intent.EXTRA_TEXT,"Text:123" );
                i3.setType("text/plain");
                startActivity(i3);
                break;
            case R.id.openmap:
                Intent i4=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.5937° N, 78.9629° E"));
                startActivity(i4);
                break;
        }

    }

    }

