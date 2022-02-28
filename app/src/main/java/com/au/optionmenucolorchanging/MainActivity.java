package com.au.optionmenucolorchanging;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            RelativeLayout r=findViewById(R.id.rlayout);
            switch (item.getItemId())
            {
                case R.id.red:
                    Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                    r.setBackgroundColor(Color.RED);

                    break;
                case R.id.blue:
                    Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
                    r.setBackgroundColor(Color.BLUE);
                    break;
                case R.id.green:
                    Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
                    r.setBackgroundColor(Color.GREEN);
                    break;
                case R.id.yellow:
                    Toast.makeText(this, "Yellow", Toast.LENGTH_SHORT).show();
                    r.setBackgroundColor(Color.YELLOW);
                    break;
            }
            return true;
    }
}