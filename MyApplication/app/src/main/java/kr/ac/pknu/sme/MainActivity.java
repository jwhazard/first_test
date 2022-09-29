package kr.ac.pknu.sme;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textview1);
        tv2 = (TextView) findViewById(R.id.textview2);
        tv3 = (TextView) findViewById(R.id.textview3);

    }

    public void changeColor(View v) {
        Toast.makeText(this, "You changed color! " + ((Button) v).getText(), Toast.LENGTH_LONG).show();
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);

        switch(v.getId()) {
            case R.id.button1:
                tv1.setVisibility(View.VISIBLE);
                break;
            case R.id.button2:
                tv2.setVisibility(View.VISIBLE);
                break;
            case R.id.button3:
                tv3.setVisibility(View.VISIBLE);
                break;
        }
    }
}

//public class MainActivity extends Activity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//}