package com.bacanax.arclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bacanax.arclassroom.databinding.ActivityMenuBinding;

public class MainActivity extends AppCompatActivity {

    boolean isUnityLoaded = false;
    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //handleIntent(getIntent());
    }

  /*  @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
        setIntent(intent);
    }

    void handleIntent(Intent intent) {
        if(intent == null || intent.getExtras() == null) return;

        if(intent.getExtras().containsKey("setColor")){
            View v = findViewById(R.id.intro_button);
            switch (intent.getExtras().getString("setColor")) {
                case "yellow": v.setBackgroundColor(Color.YELLOW); break;
                case "red": v.setBackgroundColor(Color.RED); break;
                case "blue": v.setBackgroundColor(Color.BLUE); break;
                default: break;
            }
        }
    }

    public void btnLoadUnity(View v) {
        isUnityLoaded = true;
        Intent intent = new Intent(this, MainUnityActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) isUnityLoaded = false;
    }

    @Override
    public void onBackPressed() {

        //finishAffinity();
        finish();
    }*/

    public void goMenuActivity(View view){
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);

    }
}