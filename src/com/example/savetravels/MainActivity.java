package com.example.savetravels;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.savetravels.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        final Button button_boa = (Button) findViewById(R.id.bank_of_america);
        button_boa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), BankInfoActivity.class);
            	i.putExtra(EXTRA_MESSAGE, "Bank of America");
            	startActivity(i);
            }
        });
        
        final Button button_citibank = (Button) findViewById(R.id.citibank);
        button_citibank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), BankInfoActivity.class);
            	i.putExtra(EXTRA_MESSAGE, "Citibank");
            	startActivity(i);
            }
        });
        
        final Button button_wells_fargo = (Button) findViewById(R.id.wells_fargo);
        button_wells_fargo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), BankInfoActivity.class);
            	i.putExtra(EXTRA_MESSAGE, "Wells Fargo");
            	startActivity(i);
            }
        });
        
        final Button button_chase = (Button) findViewById(R.id.chase);
        button_chase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	Intent i = new Intent(getApplicationContext(), BankInfoActivity.class);
            	i.putExtra(EXTRA_MESSAGE, "Chase");
            	startActivity(i);
            }
        });
        
        final Button button_pnc = (Button) findViewById(R.id.pnc);
        button_pnc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	Intent i = new Intent(getApplicationContext(), BankInfoActivity.class);
            	i.putExtra(EXTRA_MESSAGE, "PNC");
            	startActivity(i);
            }
        });
        
        final Button button_suntrust = (Button) findViewById(R.id.suntrust);
        button_suntrust.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	Intent i = new Intent(getApplicationContext(), BankInfoActivity.class);
            	i.putExtra(EXTRA_MESSAGE, "Suntrust");
            	startActivity(i);
            }
        });
        
        final Button button_other_bank = (Button) findViewById(R.id.other_bank);
        button_other_bank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	Intent i = new Intent(getApplicationContext(), BankInfoActivity.class);
            	i.putExtra(EXTRA_MESSAGE, "Other Bank");
            	startActivity(i);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
}
