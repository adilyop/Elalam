package your.package3.namespace;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class music extends Service {

	MediaPlayer mp ;
	@Override
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
		mp = MediaPlayer.create(this, R.drawable.kalimba);
		mp.start();
		//mp.release();
		
		
	};
	
	@Override
	public void onDestroy() {
		mp.stop();
		super.onDestroy();
		
		
	}
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	

}
