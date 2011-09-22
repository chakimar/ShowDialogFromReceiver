package name.chakimar.show_dialog_from_receiver;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import name.chakimar.show_dialog_from_receiver.R;

public class MainActivity extends Activity {
	private static final int DIALOG_HELLO = 1;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent intent = getIntent();
        if (intent != null && "show".equals(intent.getAction())) {
            showDialog(DIALOG_HELLO);	
        }
    }

	@Override
	protected Dialog onCreateDialog(int id) {
		if (id == DIALOG_HELLO) {
			return new AlertDialog.Builder(this)
			.setMessage("Hello")
			.create();
		}
		return super.onCreateDialog(id);
	}
    
    
}