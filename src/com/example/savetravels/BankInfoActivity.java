package com.example.savetravels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

public class BankInfoActivity extends Activity {

	Map<String, BankInfo> map = new HashMap<String, BankInfo>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// Initializing bank information
		map.put("Bank of America", new BankInfo(new String[] {"Barclays", "Deutsche Bank"}, "3%", "1% + $5"));
		map.put("Chase", new BankInfo(null, "3%", "3% + $5"));
		map.put("Citibank", new BankInfo(null, "3%", "3% + $2"));
		map.put("PNC", new BankInfo(null, "3%", "$5"));
		map.put("Suntrust", new BankInfo(null, "3%", "$5"));
		map.put("Wells Fargo", new BankInfo(null, "3%", "3% + $5"));
		map.put("Other Bank", new BankInfo(null, "Average foreign transaction fee is usually 3%", "ATM fees usually range from $2 to $5"));
		
		super.onCreate(savedInstanceState);
		
		Intent intent = getIntent();
	    String message_bank_name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

		setContentView(R.layout.activity_bank_info);

	    // Set text view for bank name
	    TextView bankName = (TextView) findViewById(R.id.text_bank);
	    bankName.setTextSize(40);
	    bankName.setText(message_bank_name);
	    
	    // Set text view for foreign transaction fee
	    TextView foreignFee = (TextView) findViewById(R.id.foreign_fee);
	    foreignFee.setTextSize(30);
	    foreignFee.setText((CharSequence) map.get(message_bank_name).transaction_fee);
	    
	    // Set text view for ATM fee
	    TextView ATMfee = (TextView) findViewById(R.id.ATM_fee);
	    ATMfee.setTextSize(30);
	    ATMfee.setText((CharSequence) map.get(message_bank_name).atm_fee);
	    
	    // Set label sizes
	    ((TextView) findViewById(R.id.textView1)).setTextSize(20);
	    ((TextView) findViewById(R.id.textView2)).setTextSize(20);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bank_info, menu);
		return true;
	}
	
	public class BankInfo
	{
		private String[] partner;
		private String transaction_fee;
		private String atm_fee;
		
		public BankInfo() {
			this(null, null, null);
		}
		
		public BankInfo(String[] p, String t, String a) {
			partner = p;
			transaction_fee = t;
			atm_fee = a;
		}
	}

}
