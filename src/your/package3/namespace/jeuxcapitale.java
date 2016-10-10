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

public class jeuxcapitale extends Activity {
	Db db;
	boolean song = true;
	String s1="reponse1",s2="reponse2",s3="reponse3",s4="reponse4",pays="";
	int v,f1,f2,f3;
	Intent inten ;
	String s="adil";
	ImageView precedent ;
	ImageView song1;
	ImageView song2;
	Intent in4;
	Button valider,recommencer,quitter,commencer;
	CheckBox rep1,rep2,rep3,rep4;
	int faux1,faux2,faux3,vrais;
	TextView txtscore;
	TextView kestion;
	public static int points = 0;
	
	//Rand la place de la reponse correcte
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
        
        
        setContentView(R.layout.jeuxcapitale);
        kestion = (TextView) findViewById(R.id.textView2);
        song1 = (ImageView) findViewById(R.id.imageson1);
        song2 = (ImageView) findViewById(R.id.imageson2);
        precedent =(ImageView) findViewById(R.id.imagejeuxcap);
        valider = (Button) findViewById(R.id.button2);
        recommencer = (Button) findViewById(R.id.button3);
        quitter = (Button) findViewById(R.id.button1);
        rep1=(CheckBox) findViewById(R.id.checkBox1);
        rep2=(CheckBox) findViewById(R.id.checkBox2);
        rep3=(CheckBox) findViewById(R.id.checkBox3);
        rep4=(CheckBox) findViewById(R.id.checkBox4);
        txtscore =  (TextView) findViewById(R.id.textView3);
        commencer = (Button) findViewById(R.id.button4);
        
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
        
        
        
        song1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				 in4 = new Intent(jeuxcapitale.this,music.class);
				stopService(in4);
				song2.setVisibility(ImageView.VISIBLE);
				song1.setVisibility(ImageView.GONE);
			}
		});
        
        song2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				 in4 = new Intent(jeuxcapitale.this,music.class);
				startService(in4);
				song1.setVisibility(ImageView.VISIBLE);
				song2.setVisibility(ImageView.GONE);
				
			}
		});
        
        quitter.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
					finish();
				}
		});
        
        
        recommencer.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				points =0;
				txtscore.setText(""+points);
				quitter.setVisibility(ImageView.GONE);
				recommencer.setVisibility(ImageView.GONE);
				valider.setVisibility(ImageView.VISIBLE);
				}
		});
        
        
        precedent.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				 finish();
				}
		});
        
commencer.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				points =0;
				commencer.setVisibility(Button.GONE);
				valider.setVisibility(Button.VISIBLE);
				vrais = (int)(206.00 * Math.random()) + 1;
				faux1 = (int)(206.00 * Math.random()) + 1;
		        faux2 = (int)(206.00 * Math.random()) + 1;
		        faux3 = (int)(206.00 * Math.random()) + 1;
		        
		        db=new Db(jeuxcapitale.this);
		        db.open();
		        s1 = db.getCapital(vrais);
		        s2 = db.getCapital(faux1);
		        s3 = db.getCapital(faux2);
		        s4 = db.getCapital(faux3);
		        pays = db.getName(vrais);kestion.setText("Qelle est la capitale du : "+pays);
		        db.close();
		        
				int nbr= (int)(4.0 * Math.random()) ;
				rep1.setText(adil(nbr,s1,s2,s3,s4)[0]);
		        rep2.setText(adil(nbr,s1,s2,s3,s4)[1]);
		        rep3.setText(adil(nbr,s1,s2,s3,s4)[2]);
		        rep4.setText(adil(nbr,s1,s2,s3,s4)[3]);
		
valider.setOnClickListener(new OnClickListener() {
        	
			public void onClick(View v) {
				
				if(((rep1.isChecked())&&((rep1.getText()).equals(""+s1)))||((rep2.isChecked())&&(rep2.getText().equals(""+s1)))||((rep3.isChecked())&&(rep3.getText().equals(""+s1)))||((rep4.isChecked())&&(rep4.getText().equals(""+s1))))
	        	{points +=5;
					txtscore.setText(""+points);
					Toast.makeText(jeuxcapitale.this, "BRAVOO !!! ", 10).show();
	        	}
				else {Toast.makeText(jeuxcapitale.this, "La bonne réponse est :"+s1+"\nVotre score est : "+points, 10).show();
				quitter.setVisibility(ImageView.VISIBLE);
				recommencer.setVisibility(ImageView.VISIBLE);
				valider.setVisibility(ImageView.GONE);
				
				db = new Db(jeuxcapitale.this);
	  	        db.open();   
	  	        String scor1 = db.getscor1(2);
	  	        int scordata = Integer.valueOf(scor1);
	  	        if (scordata <points)
	  	        { db.changer(2, points);	
	  	      Toast.makeText(jeuxcapitale.this, "Nouveau record !!", 100).show();
	  	        }  	     
	  	        db.close();
				
				
				}
				
				vrais = (int)(206.00 * Math.random()) + 1;
				faux1 = (int)(206.00 * Math.random()) + 1;
		        faux2 = (int)(206.00 * Math.random()) + 1;
		        faux3 = (int)(206.00 * Math.random()) + 1;
		        
		        db=new Db(jeuxcapitale.this);
		        db.open();
		        s1 = db.getCapital(vrais);
		        s2 = db.getCapital(faux1);
		        s3 = db.getCapital(faux2);
		        s4 = db.getCapital(faux3);
		        pays = db.getName(vrais);kestion.setText("Qelle est la capitale du : "+pays);
		        db.close();
		        
				int nbr= (int)(4.0 * Math.random()) ;
				rep1.setText(adil(nbr,s1,s2,s3,s4)[0]);
		        rep2.setText(adil(nbr,s1,s2,s3,s4)[1]);
		        rep3.setText(adil(nbr,s1,s2,s3,s4)[2]);
		        rep4.setText(adil(nbr,s1,s2,s3,s4)[3]);
		        rep1.setChecked(false);	rep2.setChecked(false);rep3.setChecked(false);rep4.setChecked(false);
				
			}});//valider
			}});//commencer
	
}
	
	
	
	@Override
	protected void onDestroy() {
		//in4 = new Intent(jeuxcapitale.this,music.class);
		stopService(new Intent(jeuxcapitale.this,music.class));
		
		
		super.onDestroy();
	}

}