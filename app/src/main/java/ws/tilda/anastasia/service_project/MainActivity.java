package ws.tilda.anastasia.service_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mStartServiceBtn;
    private Button mStopServiceBtn;
    private Intent mServiceIntent;

    //Create service | done

    //Add a task | done

    //Create receiver, register dynamically

    //Catch system event

    // Catch your own event

    //Catch event from the service

    //Create notification, make the service foreground

    //Declare receiver statically in manifest

    //Bound service


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartServiceBtn = findViewById(R.id.btn_start_service);

        mStopServiceBtn = findViewById(R.id.btn_stop_service);

        mStartServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mServiceIntent = new Intent(MainActivity.this, CountService.class);
                startService(mServiceIntent);
            }
        });

        mStopServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(mServiceIntent);
            }
        });
    }
}
