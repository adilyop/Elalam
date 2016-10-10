package your.package3.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class jeux extends Activity  {
	//Button b1=null;Button b2=null,score;
	LinearLayout b1,b2,score;
	ImageView precedent; 
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jeux);
	        
	        b1 = (LinearLayout)findViewById(R.id.linearLayout1);
	        b1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent in3 = new Intent(jeux.this,jeuxpays.class);
					startActivity(in3);
				}
			});
	        
	        b2 = (LinearLayout)findViewById(R.id.linearLayout2);
	        b2.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent in3 = new Intent(jeux.this,jeuxcapitale.class);
					startActivity(in3);
				}
			});
	        
	        score = (LinearLayout) findViewById(R.id.linearLayout4);
	        score.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent in5 = new Intent(jeux.this, score.class);
					startActivity(in5);					
				}
			});
	          
	        precedent = (ImageView) findViewById(R.id.imageView3);
	        precedent.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					finish();
					
				}
			});
	        
	        
	        
}
}
