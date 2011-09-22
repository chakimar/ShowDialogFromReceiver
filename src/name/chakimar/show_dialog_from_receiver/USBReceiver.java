package name.chakimar.show_dialog_from_receiver;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class USBReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent data) {
		
		Toast.makeText(context, "received", Toast.LENGTH_SHORT).show();
		
		Intent intent = new Intent(context, MainActivity.class);
		intent.setAction("show");
		PendingIntent pIntent = PendingIntent.getActivity(context, 0, intent, 0);
		try {
			pIntent.send();
		} catch (CanceledException e) {
			e.printStackTrace();
		}
	}

}
