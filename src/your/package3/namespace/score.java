package your.package3.namespace;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class score extends Activity {
	
	TextView txt1,txt2;
	Button init;
	Db db;
	ImageView precedent;
	public static String scor1, scor2;
	int a=1;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        
        txt1 = (TextView) findViewById(R.id.txtscor1);
        txt2 = (TextView) findViewById(R.id.txtscor2);
        
        db = new Db(score.this);
        db.open();
        String scor1 = db.getscor1(1);
        String scor2 = db.getscor1(2);
     
        txt1.setText(scor1);
        txt2.setText(scor2);
        db.close();
        
        precedent = (ImageView) findViewById(R.id.ImageView01);
        precedent.setOnClickListener(new OnClickListener() {		
       			public void onClick(View v) {
       				finish();			
       				}});
        init = (Button) findViewById(R.id.init);
        init.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			db = new Db(score.this);
	        db.open();
	        db.changer(1, 0);
	        db.changer(2, 0);
	        
	        String scor1 = db.getscor1(1);
	        String scor2 = db.getscor1(2);
	     
	        txt1.setText(scor1);
	        txt2.setText(scor2);
	        db.close();
			
		}
	});
        
}
}