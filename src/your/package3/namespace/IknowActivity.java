package your.package3.namespace;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;




public class IknowActivity extends Activity  {
    /** Called when the activity is first created. */
    Button b11 ;
    
    LinearLayout b1,b2,b4,b3;
  


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        b1 = (LinearLayout) findViewById(R.id.linearLayout2);
        b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			Intent in = new Intent(IknowActivity.this,information.class);
			startActivity(in);
			
			}});
        
        b2 = (LinearLayout) findViewById(R.id.linearLayout3);
        b2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent in2 = new Intent(IknowActivity.this,jeux.class);
				startActivity(in2);
			}
		});
      
        b3 = (LinearLayout) findViewById(R.id.linearLayout4);
        b3.setOnClickListener(
        		new OnClickListener() {
			public void onClick(View v) {
				// boite de dialogue
				AlertDialog.Builder boite;
                boite = new AlertDialog.Builder(IknowActivity.this);
               
                boite.setTitle("A propos : ");
                boite.setIcon(R.drawable.propos);
                    boite.setMessage("ElAlam : \n" +
                    		"C'est une application développée dans le cadre du Méditel Apps Challenge 2013\n" +
                    		"par : GUEZZI Adil\n" +
                    		"e-mail : guezziadil@gmail.com\n\n" +
                    		"Qui offre un accès facile et offline aux :\n" +
                    		"- informations sur chaque pays\n" +
                    		"- recherche par nom ou capitale\n" +
                    		"- recherche sur carte\n" +
                    		"- teste de connaissances\n");
                boite.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   
                    public void onClick(DialogInterface dialog, int which) {
                   
                    }
                    }
                );
                boite.show();
				
			}});
        
        
        b4 = (LinearLayout) findViewById(R.id.linearLayout6);
        b4.setOnClickListener(
        		new OnClickListener() {
			public void onClick(View v) {finish();}});
        
        
    }
}