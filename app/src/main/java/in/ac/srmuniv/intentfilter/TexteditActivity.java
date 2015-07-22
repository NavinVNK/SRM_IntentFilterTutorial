package in.ac.srmuniv.intentfilter;

import in.ac.srmuniv.intentfilter.R;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;

public class TexteditActivity extends Activity {

       @Override
       protected void onCreate(Bundle savedInstanceState) {
              // TODO Auto-generated method stub
              super.onCreate(savedInstanceState);
              setContentView(R.layout.textedit);
              Intent intent = getIntent();
              EditText  text = (EditText) findViewById(R.id.editText1);
              // To get the action of the intent use
              String action = intent.getAction();
              if (action != Intent.ACTION_VIEW) {
                     throw new RuntimeException("Should not happen");
              }
              // To get the data use
             
              Uri data = intent.getData();
              if (data!=null)
              {
                     text.setText(data.toString());
                      URL url;
                     try {
                           url = new URL(data.getScheme(), data.getHost(), data.getPath());
                           BufferedReader rd = new BufferedReader(new InputStreamReader(url.openStream()));
                           String line = "";
                           while ((line = rd.readLine()) != null) {
                                  text.append(line);
                           }

                     } catch (Exception e) {
                           e.printStackTrace();
                     }
              }
             // text.setText("You can Edit");
      
       }

}
