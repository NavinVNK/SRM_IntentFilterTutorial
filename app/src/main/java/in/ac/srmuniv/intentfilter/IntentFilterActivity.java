package in.ac.srmuniv.intentfilter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IntentFilterActivity extends Activity {
    private Button b1;

       /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v){
            
             // Intent i = new Intent(v.getContext(),TexteditActivity.class);
                Intent i = new Intent(Intent.ACTION_VIEW,null);
                //Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:123"));
               i.addCategory("com.nawin");
              // i.addCategory("com.nawin.editable");
                //i.addCategory("com.nawin.readable");
              // i.setData(Uri.parse("http://www.srmuniv.ac.in"));
            
                startActivity(i);              
            }
        });
    }


}