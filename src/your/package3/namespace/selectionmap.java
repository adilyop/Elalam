package your.package3.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class selectionmap extends Activity 
{
	
    public ImageView afrique,img2,img3,precedent,europe,asie,ameriquenord,ameriquecentarl,moyenorient,oceanie,ameriquesud;
   // ImageView contentImage;
    TextView pays;
    boolean click1=true,click4=true,click7=true;
    boolean click2=true,click5=true,click8=true;
    boolean click3=true,click6=true;
    boolean imageTouch=false;
    Intent in4;
    FrameLayout lyt,framAfrique,framAsie,framOceanie,framAmeriqueNord,framAmeriqueSud,framAmeriqueCentral,framEurope,framMoyenOrient;
    TextView maroc;



    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectionmap);
        lyt = (FrameLayout) findViewById(R.id.lyt);
        framAfrique = (FrameLayout) findViewById(R.id.frameLayoutAfrique);
        framAsie = (FrameLayout) findViewById(R.id.frameLayoutAsie);
        framOceanie= (FrameLayout) findViewById(R.id.frameLayoutOceanie);
        framAmeriqueNord= (FrameLayout) findViewById(R.id.frameLayoutAmerNord);
        framAmeriqueSud= (FrameLayout) findViewById(R.id.frameLayoutAmerSud);
        framAmeriqueCentral= (FrameLayout) findViewById(R.id.frameLayoutAmerCentral);
        framEurope= (FrameLayout) findViewById(R.id.frameLayoutEurope);
        framMoyenOrient= (FrameLayout) findViewById(R.id.frameLayoutMoyOrient);
       
        precedent = (ImageView) findViewById(R.id.precedent);        
        europe=(ImageView)findViewById(R.id.imageView1);
        asie=(ImageView)findViewById(R.id.imageView2);
        ameriquenord=(ImageView)findViewById(R.id.imageView3);
        ameriquecentarl=(ImageView)findViewById(R.id.imageView4);
        afrique=(ImageView)findViewById(R.id.imageView5);
        moyenorient=(ImageView)findViewById(R.id.imageView6);
        oceanie=(ImageView)findViewById(R.id.imageView7);
        ameriquesud=(ImageView)findViewById(R.id.imageView8);
        img2=(ImageView)findViewById(R.id.imageView2);
        img3=(ImageView)findViewById(R.id.imageView3);
        
        
        
        
        /////////////////////////////////////////////// PAYS AFRIQUE //////////////////
        maroc = (TextView) findViewById(R.id.maroc);
        maroc.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 120;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView malaisie = (TextView) findViewById(R.id.malaisie);
        malaisie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 115;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView philippines = (TextView) findViewById(R.id.philippines);
        philippines.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 150;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView vietnam = (TextView) findViewById(R.id.vietnam);
        vietnam.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 201;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView tailande = (TextView) findViewById(R.id.tailande);
        tailande.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 187;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView sirilanka = (TextView) findViewById(R.id.sirilanka);
        sirilanka.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 177;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView laos = (TextView) findViewById(R.id.laos);
        laos.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 103;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView taiwan = (TextView) findViewById(R.id.taiwan);
        taiwan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 44;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView pakistan = (TextView) findViewById(R.id.pakistan);
        pakistan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 143;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView nepal = (TextView) findViewById(R.id.nepal);
        nepal.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 134;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView afghanistan = (TextView) findViewById(R.id.afghanistan);
        afghanistan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 1;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView coreesud = (TextView) findViewById(R.id.coreesud);
        coreesud.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 50;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView coreenord = (TextView) findViewById(R.id.coreenord);
        coreenord.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 51;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView turkmanistan = (TextView) findViewById(R.id.turkmanistan);
        turkmanistan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 192;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView kirghizistan = (TextView) findViewById(R.id.kirghizistan);
        kirghizistan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 100;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView mongolie = (TextView) findViewById(R.id.mongolie);
        mongolie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 128;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});
        
        TextView kazakhstan = (TextView) findViewById(R.id.kazakhstan);
        kazakhstan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 98;
				Intent in4 = new Intent(selectionmap.this,resultat.class);
				startActivity(in4);
				
			}
		});


        TextView oman = (TextView) findViewById(R.id.oman);
        oman.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 140;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        TextView emirate = (TextView) findViewById(R.id.emirates);
        emirate.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 61;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView kuweit = (TextView) findViewById(R.id.kuweit);
        kuweit.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 102;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        TextView chypre = (TextView) findViewById(R.id.chypre);
        chypre.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 45;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        TextView liban = (TextView) findViewById(R.id.liban);
        liban.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 106;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView georgie = (TextView) findViewById(R.id.georgie);
        georgie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 74;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView jordanie = (TextView) findViewById(R.id.jordanie);
        jordanie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 97;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView azerabijan = (TextView) findViewById(R.id.azerabijane);
        azerabijan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 17;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView fidji = (TextView) findViewById(R.id.fidji);
        fidji.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 69;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});  
        
        TextView nvllguinee = (TextView) findViewById(R.id.nouvelleguinee);
        nvllguinee.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 146;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView cuba = (TextView) findViewById(R.id.cuba);
        cuba.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 55;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 

        TextView haiti = (TextView) findViewById(R.id.haiti);
        haiti.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 84;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView dominic = (TextView) findViewById(R.id.dominicaine);
        dominic.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 58;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView jamaique = (TextView) findViewById(R.id.jamaique);
        jamaique.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 95;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView belize = (TextView) findViewById(R.id.belize);
        belize.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 23;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView guatimala = (TextView) findViewById(R.id.guatimala);
        guatimala.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 79;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView honduras = (TextView) findViewById(R.id.honduras);
        honduras.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 85;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView nigaragua = (TextView) findViewById(R.id.nicaragua);
        nigaragua.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 135;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView salvador = (TextView) findViewById(R.id.selvador);
        salvador.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 166;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView panama = (TextView) findViewById(R.id.panama);
        panama.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 145;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView costarica = (TextView) findViewById(R.id.costarica);
        costarica.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 52;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView venezuela = (TextView) findViewById(R.id.venezuela);
        venezuela.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 199;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView colombie = (TextView) findViewById(R.id.colombie);
        colombie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 46;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView equateur = (TextView) findViewById(R.id.equateur);
        equateur.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 62;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView suriname = (TextView) findViewById(R.id.suriname);
        suriname.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 180;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView perou = (TextView) findViewById(R.id.perou);
        perou.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 149;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView paraguay = (TextView) findViewById(R.id.paraguay);
        paraguay.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 147;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView bolivie = (TextView) findViewById(R.id.bolovie);
        bolivie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 28;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView chili = (TextView) findViewById(R.id.chili);
        chili.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 42;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView uruguay = (TextView) findViewById(R.id.uruguy);
        uruguay.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 197;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView nvllziland = (TextView) findViewById(R.id.nvlzilande);
        nvllziland.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 139;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		}); 
        
        TextView armenie = (TextView) findViewById(R.id.armenie);
        armenie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 13;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});        
        
        TextView Soudan = (TextView) findViewById(R.id.Soudan);
        Soudan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 176;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView Mauritanie = (TextView) findViewById(R.id.Mauritanie);
        Mauritanie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 123;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView Mali = (TextView) findViewById(R.id.Mali);
        Mali.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 118;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView alger = (TextView) findViewById(R.id.textView1);
        alger.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 4;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView Niger = (TextView) findViewById(R.id.Niger);
        Niger.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 136;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView Tchad = (TextView) findViewById(R.id.Tchad);
        Tchad.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 185;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView senegal = (TextView) findViewById(R.id.Senegal);
        senegal.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 169;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView somalie = (TextView) findViewById(R.id.Somalie);
        somalie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 175;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView ethiopie = (TextView) findViewById(R.id.Ethiopie);
        ethiopie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 67;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView nigeria = (TextView) findViewById(R.id.Nigeria);
        nigeria.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 137;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView guinee = (TextView) findViewById(R.id.Guinee);
        guinee.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 80;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView liberia = (TextView) findViewById(R.id.Liberia);
        liberia.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 107;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView cameroun = (TextView) findViewById(R.id.Cameroun);
        cameroun.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 38;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView gabon = (TextView) findViewById(R.id.Gabon);
        gabon.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 72;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView tanzanie = (TextView) findViewById(R.id.Tanzanie);
        tanzanie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 184;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView angola = (TextView) findViewById(R.id.Angola);
        angola.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 7;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView afriquedusud = (TextView) findViewById(R.id.Afriquedusud);
        afriquedusud.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 2;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView madagaskar = (TextView) findViewById(R.id.madagaskar);
        madagaskar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 114;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView namibie = (TextView) findViewById(R.id.Namibie);
        namibie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 132;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView zambie = (TextView) findViewById(R.id.Zambie);
        zambie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 204;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView tunisie = (TextView) findViewById(R.id.tunisie);
        tunisie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 191;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView egypte = (TextView) findViewById(R.id.egypte);
        egypte.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 60;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView libye = (TextView) findViewById(R.id.libye);
        libye.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 108;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView chine = (TextView) findViewById(R.id.Chine);
        chine.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 43;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView inde = (TextView) findViewById(R.id.Inde);
        inde.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 87;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView japon = (TextView) findViewById(R.id.Japon);
        japon.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 96;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView indonisie = (TextView) findViewById(R.id.Indonisie);
        indonisie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 88;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView saoudi = (TextView) findViewById(R.id.Saoudi);
        saoudi.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 11;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView yemen = (TextView) findViewById(R.id.Yemen);
        yemen.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 202;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        TextView syrie = (TextView) findViewById(R.id.syrie);
        syrie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 182;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView iraq = (TextView) findViewById(R.id.Iraq);
        iraq.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 90;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView palestine = (TextView) findViewById(R.id.Palestine);
        palestine.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 206;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView iran = (TextView) findViewById(R.id.Irane);
        iran.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 89;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView australie = (TextView) findViewById(R.id.Australie);
        australie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 15;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView canada = (TextView) findViewById(R.id.Canada);
        canada.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 39;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView mexique = (TextView) findViewById(R.id.Mexique);
        mexique.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 124;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView usa = (TextView) findViewById(R.id.USA);
        usa.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 66;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView bresil = (TextView) findViewById(R.id.Bresile);
        bresil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 31;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView argentine = (TextView) findViewById(R.id.Argentine);
        argentine.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 12;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView espagne = (TextView) findViewById(R.id.Espagne);
        espagne.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 64;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView portugale = (TextView) findViewById(R.id.Portugale);
        portugale.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 154;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView france = (TextView) findViewById(R.id.France);
        france.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 71;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView allemagne = (TextView) findViewById(R.id.Allemagne);
        allemagne.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 5;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView pologne = (TextView) findViewById(R.id.Pologne);
        pologne.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 152;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView ukraine = (TextView) findViewById(R.id.Ukraine);
        ukraine.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 196;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView turque = (TextView) findViewById(R.id.Turque);
        turque.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 194;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        TextView finlande = (TextView) findViewById(R.id.Finlande);
        finlande.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 70;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView suede = (TextView) findViewById(R.id.Suede);
        suede.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 178;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView norvege = (TextView) findViewById(R.id.Norvege);
        norvege.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 138;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView danmark = (TextView) findViewById(R.id.Danmark);
        danmark.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 56;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView russie = (TextView) findViewById(R.id.Russie);
        russie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 158;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView italie = (TextView) findViewById(R.id.Italie);
        italie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 94;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView djibouti = (TextView) findViewById(R.id.djiboti);
        djibouti.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 57;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView erytherie = (TextView) findViewById(R.id.erytherie);
        erytherie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 63;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView burkina = (TextView) findViewById(R.id.burkina);
        burkina.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 34;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView centreafr = (TextView) findViewById(R.id.centreafrique);
        centreafr.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 41;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView ghana = (TextView) findViewById(R.id.ghana);
        ghana.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 75;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});

        
        TextView ivoire = (TextView) findViewById(R.id.cotedivoire);
        ivoire.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 53;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView liberie = (TextView) findViewById(R.id.Liberia);
        liberie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 107;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView seralion = (TextView) findViewById(R.id.serraleone);
        seralion.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 171;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView congo = (TextView) findViewById(R.id.congo);
        congo.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 48;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView congode = (TextView) findViewById(R.id.congodemo);
        congode.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 49;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView ouganda = (TextView) findViewById(R.id.ouganda);
        ouganda.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 141;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView kenya = (TextView) findViewById(R.id.kenya);
        kenya.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 99;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView boutswana = (TextView) findViewById(R.id.boutswana);
        boutswana.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 30;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView zimbabwe = (TextView) findViewById(R.id.zimbabwe);
        zimbabwe.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 205;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView mozambique = (TextView) findViewById(R.id.mozambique);
        mozambique.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 130;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView swizland = (TextView) findViewById(R.id.swaziland);
        swizland.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 181;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView comoros = (TextView) findViewById(R.id.comoros);
        comoros.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 47;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView estonie = (TextView) findViewById(R.id.estonie);
        estonie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 65;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView lettonie = (TextView) findViewById(R.id.lettonie);
        lettonie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 105;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView littuanie = (TextView) findViewById(R.id.littuanie);
        littuanie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 110;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView belarouss = (TextView) findViewById(R.id.belaroussie);
        belarouss.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 27;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView uk = (TextView) findViewById(R.id.uk);
        uk.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 157;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView paysbas = (TextView) findViewById(R.id.paysbas);
        paysbas.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 148;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView irlande = (TextView) findViewById(R.id.irlande);
        irlande.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 91;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView belgique = (TextView) findViewById(R.id.belgique);
        belgique.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 22;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView tcheque = (TextView) findViewById(R.id.tcheque);
        tcheque.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 186;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView moldovie = (TextView) findViewById(R.id.moldovie);
        moldovie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 126;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView slovaque = (TextView) findViewById(R.id.slovaque);
        slovaque.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 173;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView autriche = (TextView) findViewById(R.id.autriche);
        autriche.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 16;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView suisse = (TextView) findViewById(R.id.suisse);
        suisse.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 179;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView romanie = (TextView) findViewById(R.id.roumanie);
        romanie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 156;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView slovenie = (TextView) findViewById(R.id.slovenie);
        slovenie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 174;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        TextView croitie = (TextView) findViewById(R.id.croitie);
        croitie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 54;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView yugoslavie = (TextView) findViewById(R.id.yougoslavie);
        yugoslavie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 203;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView bulgarie = (TextView) findViewById(R.id.bulgarie);
        bulgarie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 33;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView macdonie = (TextView) findViewById(R.id.macdonie);
        macdonie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 113;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView albanie = (TextView) findViewById(R.id.albanie);
        albanie.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 3;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        TextView greece = (TextView) findViewById(R.id.grece);
        greece.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				resultat.id = 77;
				startActivity(new Intent(selectionmap.this,resultat.class));
				
			}
		});
        
        //contentImage=(ImageView)findViewById(R.id.contentImage);

        ////////////////// Etat initial/////////////////////////////////////////////////////////
        
        afrique.setAlpha(100);
        europe.setAlpha(100);
        ameriquecentarl.setAlpha(100);
        ameriquenord.setAlpha(100);
        ameriquesud.setAlpha(100);
        moyenorient.setAlpha(100);
        oceanie.setAlpha(100);
        asie.setAlpha(100);
        
        framAfrique.setVisibility(FrameLayout.GONE);
    	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
    	framAmeriqueNord.setVisibility(FrameLayout.GONE);
    	framAmeriqueSud.setVisibility(FrameLayout.GONE);
    	framAsie.setVisibility(FrameLayout.GONE);
    	framMoyenOrient.setVisibility(FrameLayout.GONE);
    	framEurope.setVisibility(FrameLayout.GONE);
    	framOceanie.setVisibility(FrameLayout.GONE);
        
        
        /////////////////////////////////////////////////////precedennt///////////////////////////////////////
        precedent.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				finish();
				
			}
		});

        
      

        
        ////////////////////////////////////////////Listener sur les 8 Image view//////////////////////////
      europe.setOnClickListener(new OnClickListener()
      { 
        public void onClick(View v)
        {
        	framAfrique.setVisibility(FrameLayout.GONE);
        	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
        	framAmeriqueNord.setVisibility(FrameLayout.GONE);
        	framAmeriqueSud.setVisibility(FrameLayout.GONE);
        	framAsie.setVisibility(FrameLayout.GONE);
        	framMoyenOrient.setVisibility(FrameLayout.GONE);
        	framEurope.setVisibility(FrameLayout.VISIBLE);
        	framOceanie.setVisibility(FrameLayout.GONE);
            if (click1) 
            {
            	europe.setAlpha(255);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click1=false;
            } 
            else 
            {
            	europe.setAlpha(255);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click2=true;
            }
   
                //contentImage.setImageResource(R.drawable.europe); 
            	lyt.setBackgroundResource(R.drawable.europe);
        }
    });
      
      asie.setOnClickListener(new OnClickListener()
      { 
        public void onClick(View v)
        {
        	framAfrique.setVisibility(FrameLayout.GONE);
        	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
        	framAmeriqueNord.setVisibility(FrameLayout.GONE);
        	framAmeriqueSud.setVisibility(FrameLayout.GONE);
        	framAsie.setVisibility(FrameLayout.VISIBLE);
        	framMoyenOrient.setVisibility(FrameLayout.GONE);
        	framEurope.setVisibility(FrameLayout.GONE);
        	framOceanie.setVisibility(FrameLayout.GONE);
            if (click2) 
            {
            	europe.setAlpha(100);
                asie.setAlpha(255);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click2=false;
            } 
            else 
            {
            	europe.setAlpha(100);
                asie.setAlpha(255);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click2=true;
            }
            //contentImage.setImageResource(R.drawable.asie);
            lyt.setBackgroundResource(R.drawable.asie);
        }
    });

      
      ameriquenord.setOnClickListener(new OnClickListener()
      { 
        public void onClick(View v)
        {
        	framAfrique.setVisibility(FrameLayout.GONE);
        	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
        	framAmeriqueNord.setVisibility(FrameLayout.VISIBLE);
        	framAmeriqueSud.setVisibility(FrameLayout.GONE);
        	framAsie.setVisibility(FrameLayout.GONE);
        	framMoyenOrient.setVisibility(FrameLayout.GONE);
        	framEurope.setVisibility(FrameLayout.GONE);
        	framOceanie.setVisibility(FrameLayout.GONE);
            if (click3) 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(255);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click3=false;
            } 
            else 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(255);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click3=true;
            }
            //contentImage.setImageResource(R.drawable.ameriquenord);
            lyt.setBackgroundResource(R.drawable.ameriquenord);
        }
    });
      
      
      ameriquecentarl.setOnClickListener(new OnClickListener()
      { 
        public void onClick(View v)
        {
        	framAfrique.setVisibility(FrameLayout.GONE);
        	framAmeriqueCentral.setVisibility(FrameLayout.VISIBLE);
        	framAmeriqueNord.setVisibility(FrameLayout.GONE);
        	framAmeriqueSud.setVisibility(FrameLayout.GONE);
        	framAsie.setVisibility(FrameLayout.GONE);
        	framMoyenOrient.setVisibility(FrameLayout.GONE);
        	framEurope.setVisibility(FrameLayout.GONE);
        	framOceanie.setVisibility(FrameLayout.GONE);
            if (click4) 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(255);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click4=false;
            } 
            else 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(255);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click4=true;
            }
            //contentImage.setImageResource(R.drawable.ameriquecentr);
            lyt.setBackgroundResource(R.drawable.ameriquecentr);
            
        }
    });
      
      afrique.setOnClickListener(new OnClickListener()
      { 
    	  
        public void onClick(View v)
        {framAfrique.setVisibility(FrameLayout.VISIBLE);
    	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
    	framAmeriqueNord.setVisibility(FrameLayout.GONE);
    	framAmeriqueSud.setVisibility(FrameLayout.GONE);
    	framAsie.setVisibility(FrameLayout.GONE);
    	framMoyenOrient.setVisibility(FrameLayout.GONE);
    	framEurope.setVisibility(FrameLayout.GONE);
    	framOceanie.setVisibility(FrameLayout.GONE);
            if (click5) 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(255);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click5=false;
            } 
            else 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(255);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click5=true;
            }
            //contentImage.setImageResource(R.drawable.afrique);
            lyt.setBackgroundResource(R.drawable.afrique);
        }
    });
      
      moyenorient.setOnClickListener(new OnClickListener()
      { 
        public void onClick(View v)
        {
        	framAfrique.setVisibility(FrameLayout.GONE);
        	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
        	framAmeriqueNord.setVisibility(FrameLayout.GONE);
        	framAmeriqueSud.setVisibility(FrameLayout.GONE);
        	framAsie.setVisibility(FrameLayout.GONE);
        	framMoyenOrient.setVisibility(FrameLayout.VISIBLE);
        	framEurope.setVisibility(FrameLayout.GONE);
        	framOceanie.setVisibility(FrameLayout.GONE);
            if (click6) 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(255);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click6=false;
            } 
            else 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(255);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(100);
                click6=true;
            }
            //contentImage.setImageResource(R.drawable.moyenorient);
            lyt.setBackgroundResource(R.drawable.moyenorient);
        }
    });
      
    
      
      oceanie.setOnClickListener(new OnClickListener()
      { 
    	  
        public void onClick(View v)
        {
        	framAfrique.setVisibility(FrameLayout.GONE);
        	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
        	framAmeriqueNord.setVisibility(FrameLayout.GONE);
        	framAmeriqueSud.setVisibility(FrameLayout.GONE);
        	framAsie.setVisibility(FrameLayout.GONE);
        	framMoyenOrient.setVisibility(FrameLayout.GONE);
        	framEurope.setVisibility(FrameLayout.GONE);
        	framOceanie.setVisibility(FrameLayout.VISIBLE);
            if (click7) 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(255);
                ameriquesud.setAlpha(100);
                click7=false;
            } 
            else 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(255);
                ameriquesud.setAlpha(100);
                click7=true;
            }
            //contentImage.setImageResource(R.drawable.oceanie);
            lyt.setBackgroundResource(R.drawable.oceanie);
        }
    });
      
      ameriquesud.setOnClickListener(new OnClickListener()
      { 
        public void onClick(View v)
        {
        	framAfrique.setVisibility(FrameLayout.GONE);
        	framAmeriqueCentral.setVisibility(FrameLayout.GONE);
        	framAmeriqueNord.setVisibility(FrameLayout.GONE);
        	framAmeriqueSud.setVisibility(FrameLayout.VISIBLE);
        	framAsie.setVisibility(FrameLayout.GONE);
        	framMoyenOrient.setVisibility(FrameLayout.GONE);
        	framEurope.setVisibility(FrameLayout.GONE);
        	framOceanie.setVisibility(FrameLayout.GONE);
            if (click8) 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(255);
                click8=false;
            } 
            else 
            {
            	europe.setAlpha(100);
                asie.setAlpha(100);
                ameriquenord.setAlpha(100);
                ameriquecentarl.setAlpha(100);
                afrique.setAlpha(100);
                moyenorient.setAlpha(100);
                oceanie.setAlpha(100);
                ameriquesud.setAlpha(255);
                click8=true;
            }
           // contentImage.setImageResource(R.drawable.ameriquesud);
            lyt.setBackgroundResource(R.drawable.ameriquesud);
        }
    });
      
     /* 
      contentImage.setOnClickListener(new OnClickListener() 
      {

        public void onClick(View v) 
        {
            try
            {
            Toast.makeText(selectionmap.this,"hello",Toast.LENGTH_SHORT);
            contentImage.setMinimumHeight(400); 
            contentImage.setMinimumWidth(700);

            imageTouch=true;
            }
            catch(Exception e)
            {
                System.out.println("Exception Raise.......................");
            }
        }
    });*/

    }//onCreate Method over..... 


}