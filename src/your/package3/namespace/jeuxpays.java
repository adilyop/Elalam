package your.package3.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class jeuxpays extends Activity {
	Db db;
	ImageView song1;
	ImageView song2;
	Intent in4;
	ImageView precedent;
	ImageView drap;
	CheckBox rep1,rep2,rep3,rep4;
	 String s1="reponse1",s2="reponse2",s3="reponse3",s4="reponse4",s="test";
	Button valider ,quitter , recommencer,commencer;
	int vrai,faux1,faux2,faux3;
	public static int score=00;
	TextView scor;
		
	
	 String[] adil(int nbr,String s11,String s21,String s31,String s41){
		
		String[] s={"0","0","0","0"};
		s[nbr] = s11;
		s[(nbr+1)%4] = s21;
		s[(nbr+2)%4] = s31;
		s[(nbr+3)%4] = s41;	
		return s;
	}
		
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeuxpays);
       
        song1 = (ImageView) findViewById(R.id.imageson1);
        song2 = (ImageView) findViewById(R.id.imageson2);
        scor =  (TextView) findViewById(R.id.textView3);scor.setText("00");
        commencer = (Button) findViewById(R.id.commencer);
        valider = (Button) findViewById(R.id.valider);
        quitter = (Button) findViewById(R.id.quitter);
        recommencer = (Button) findViewById(R.id.recommencer);
        rep1 = (CheckBox) findViewById(R.id.checkBox1);
        rep2 = (CheckBox) findViewById(R.id.checkBox2);
        rep3 = (CheckBox) findViewById(R.id.checkBox3);
        rep4 = (CheckBox) findViewById(R.id.checkBox4);
        drap = (ImageView) findViewById(R.id.imageView2); 
        
        
       
song1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				 in4 = new Intent(jeuxpays.this,music.class);
				stopService(in4);
				song2.setVisibility(ImageView.VISIBLE);
				song1.setVisibility(ImageView.GONE);
			}
		});
        
        song2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				 in4 = new Intent(jeuxpays.this,music.class);
				startService(in4);
				song1.setVisibility(ImageView.VISIBLE);
				song2.setVisibility(ImageView.GONE);
				
			}
		});
        
        
 recommencer.setOnClickListener(new OnClickListener() {		
			public void onClick(View v) {
				score=0;
				scor.setText("00");
				valider.setVisibility(Button.VISIBLE);
				recommencer.setVisibility(Button.GONE);
				quitter.setVisibility(Button.GONE);
				}});
 
 quitter.setOnClickListener(new OnClickListener() {		
			public void onClick(View v) {
				finish();
				}});
 precedent = (ImageView) findViewById(R.id.imageView1);
 precedent.setOnClickListener(new OnClickListener() {		
			public void onClick(View v) {
				finish();			
				}});
        
        rep1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				rep2.setChecked(false);rep3.setChecked(false);rep4.setChecked(false);
			}});
        rep2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				rep1.setChecked(false);rep3.setChecked(false);rep4.setChecked(false);
			}});
        rep3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				rep2.setChecked(false);rep1.setChecked(false);rep4.setChecked(false);
			}});
        rep4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				rep2.setChecked(false);rep3.setChecked(false);rep1.setChecked(false);
			}});
        
 commencer.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				score=0;
				vrai = (int)(206.00 * Math.random()) + 1;
				faux1 = (int)(206.00 * Math.random()) + 1;
		        faux2 = (int)(206.00 * Math.random()) + 1;
		        faux3 = (int)(206.00 * Math.random()) + 1;
				drap.setImageResource(resultat.mesFlags[vrai-1]);
				int nbr= (int)(4.0 * Math.random()) ;
				
				db=new Db(jeuxpays.this);
		        db.open();
		        s1 = db.getName(vrai);
		        s2 = db.getName(faux1);
		        s3 = db.getName(faux2);
		        s4 = db.getName(faux3);
		        db.close();
				
				rep1.setText(adil(nbr,s1,s2,s3,s4)[0]);
		        rep2.setText(adil(nbr,s1,s2,s3,s4)[1]);
		        rep3.setText(adil(nbr,s1,s2,s3,s4)[2]);
		        rep4.setText(adil(nbr,s1,s2,s3,s4)[3]);
				commencer.setVisibility(Button.GONE);
				valider.setVisibility(Button.VISIBLE);
				
		
 valider.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			      
				
			        
			        if(((rep1.isChecked())&&((rep1.getText()).equals(""+s1)))||((rep2.isChecked())&&(rep2.getText().equals(""+s1)))||((rep3.isChecked())&&(rep3.getText().equals(""+s1)))||((rep4.isChecked())&&(rep4.getText().equals(""+s1))))
			        	{
			        	score +=5;
			        	scor.setText(""+score);
			        	
			        }
			        else {valider.setVisibility(Button.GONE);
			        	  recommencer.setVisibility(Button.VISIBLE);
			        	  quitter.setVisibility(Button.VISIBLE);
			        	  Toast.makeText(jeuxpays.this, "La bonne réponse est : "+s1+"\n Votre score est : "+score, 100).show();
			        	  
			        	  db = new Db(jeuxpays.this);
			  	        db.open();   
			  	        String scor1 = db.getscor1(1);
			  	        int scordata = Integer.valueOf(scor1);
			  	        if (scordata <score)
			  	        { db.changer(1, score);	
			  	      Toast.makeText(jeuxpays.this, "Nouveau record !!", 100).show();
			  	        }  	     
			  	        db.close();
			        	  
			        }
			        
			        
			        vrai = (int)(206.00 * Math.random()) + 1;
			        faux1 = (int)(206.00 * Math.random()) + 1;
			        faux2 = (int)(206.00 * Math.random()) + 1;
			        faux3 = (int)(206.00 * Math.random()) + 1;
			        int nbr= (int)(4.0 * Math.random()) ;
			        
			        drap.setImageResource(resultat.mesFlags[vrai-1]);
			        
			        
			        db=new Db(jeuxpays.this);
			        db.open();
			        s1 = db.getName(vrai);
			        s2 = db.getName(faux1);
			        s3 = db.getName(faux2);
			        s4 = db.getName(faux3);
			        db.close();
			        
			        rep1.setText(adil(nbr,s1,s2,s3,s4)[0]);
			        rep2.setText(adil(nbr,s1,s2,s3,s4)[1]);
			        rep3.setText(adil(nbr,s1,s2,s3,s4)[2]);
			        rep4.setText(adil(nbr,s1,s2,s3,s4)[3]);
			        rep1.setChecked(false);	rep2.setChecked(false);rep3.setChecked(false);rep4.setChecked(false);
				
			}
		});//valider
        
			}
	});//commencer
 

}
	

	protected void onDestroy() {
		//in4 = new Intent(jeuxcapitale.this,music.class);
		stopService(new Intent(jeuxpays.this,music.class));
		
		
		super.onDestroy();
	}

}

