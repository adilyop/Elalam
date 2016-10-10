package your.package3.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class information extends Activity {
	//Button b1 = null;
	//Button map;
	ImageView precedent;
	Intent in;
	LinearLayout map,b1;

	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.information);
	        
	        precedent = (ImageView) findViewById(R.id.imageView1);
	        precedent.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					finish();
					
				}
			});
	        
	        b1= (LinearLayout) findViewById(R.id.linearLayout3);
	        b1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent in = new Intent(information.this,recherche.class);
					startActivity(in);
					
				}
			});

	        map= (LinearLayout) findViewById(R.id.linearLayout2);
	        map.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent in1 = new Intent(information.this,selectionmap.class);
					startActivity(in1);
					
				}
			});
 
	      
}

	
}