package cubex.mahesh.intentex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dial(View view) {
    /*    Intent i = new Intent( );
        EditText et = findViewById(R.id.et1);
        i.setData(Uri.parse("tel:"+et.getText().toString()));
        i.setAction(Intent.ACTION_DIAL);
        startActivity(i); */
     /*    Intent i = new Intent( );
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.nareshit.com"));
        startActivity(i); */
        Intent i = new Intent( );
        i.setAction(Intent.ACTION_GET_CONTENT);
        i.setType("image/*");
        startActivity(i);
    }

    public void next(View view) {
    }

    public void whatsapp(View view) {
    }
}
