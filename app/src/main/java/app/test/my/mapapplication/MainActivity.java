package app.test.my.mapapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMap(View view) {
        startActivity(new Intent(this, MapActivity.class));
        Toast.makeText(this, "Starting map", Toast.LENGTH_SHORT).show();
    }
}
