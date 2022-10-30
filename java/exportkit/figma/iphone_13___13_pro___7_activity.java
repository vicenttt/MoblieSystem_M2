
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_13___13_pro___1
	 *	@date 		Wednesday 26th of October 2022 12:52:17 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class iphone_13___13_pro___7_activity extends Activity {

	
	private View _bg__iphone_13___13_pro___7_ek2;
	private ImageView ___2022_10_11___6_42_1_ek2;
	private View rectangle_11_ek3;
	private ImageView vector_ek65;
	private ImageView vector_ek66;
	private TextView search_ek7;
	private ImageView _vector_ek67;
	private ImageView vector_ek68;
	private ImageView vector_ek69;
	private View rectangle_14;
	private TextView forgot_your_password_;
	private TextView please_enter_the_email_you_use_to_sign_in_to_acme_;
	private TextView your_email;
	private TextView e_g___abcde__gmail_com;
	private View line_4_ek1;
	private View rectangle_25;
	private TextView request_password_reset;
	private TextView _back_to_sign_in;
	private ImageView vector_ek70;
	private ImageView vector_ek71;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_13___13_pro___7);

		
		_bg__iphone_13___13_pro___7_ek2 = (View) findViewById(R.id._bg__iphone_13___13_pro___7_ek2);
		___2022_10_11___6_42_1_ek2 = (ImageView) findViewById(R.id.___2022_10_11___6_42_1_ek2);
		rectangle_11_ek3 = (View) findViewById(R.id.rectangle_11_ek3);
		vector_ek65 = (ImageView) findViewById(R.id.vector_ek65);
		vector_ek66 = (ImageView) findViewById(R.id.vector_ek66);
		search_ek7 = (TextView) findViewById(R.id.search_ek7);
		_vector_ek67 = (ImageView) findViewById(R.id._vector_ek67);
		vector_ek68 = (ImageView) findViewById(R.id.vector_ek68);
		vector_ek69 = (ImageView) findViewById(R.id.vector_ek69);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		forgot_your_password_ = (TextView) findViewById(R.id.forgot_your_password_);
		please_enter_the_email_you_use_to_sign_in_to_acme_ = (TextView) findViewById(R.id.please_enter_the_email_you_use_to_sign_in_to_acme_);
		your_email = (TextView) findViewById(R.id.your_email);
		e_g___abcde__gmail_com = (TextView) findViewById(R.id.e_g___abcde__gmail_com);
		line_4_ek1 = (View) findViewById(R.id.line_4_ek1);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		request_password_reset = (TextView) findViewById(R.id.request_password_reset);
		_back_to_sign_in = (TextView) findViewById(R.id._back_to_sign_in);
		vector_ek70 = (ImageView) findViewById(R.id.vector_ek70);
		vector_ek71 = (ImageView) findViewById(R.id.vector_ek71);
	
		
		_vector_ek67.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_13___13_pro___3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_to_sign_in.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_13___13_pro___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	