package com.example.xxia.androidblank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.newrelic.agent.android.NewRelic;
import com.newrelic.agent.android.logging.AgentLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewRelic.withApplicationToken(
                "Insert Token Here"
        ).withLogLevel(AgentLog.AUDIT).start(this.getApplication());
    }
}
