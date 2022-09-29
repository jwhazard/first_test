package kr.ac.pknu.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = (ImageView) findViewById(R.id.dice1);

    }

    public void diceRoller(View v) {
        int random = (int) ((Math.random() * 6) + 1);

        switch (random) {
            case 1:
                dice.setImageResource((R.drawable.dice1));
                Toast.makeText(this, "One!", Toast.LENGTH_LONG).show();
                break;
            case 2:
                dice.setImageResource((R.drawable.dice2));
                Toast.makeText(this, "Two!", Toast.LENGTH_LONG).show();
                break;
            case 3:
                dice.setImageResource((R.drawable.dice3));
                Toast.makeText(this, "Three!", Toast.LENGTH_LONG).show();
                break;
            case 4:
                dice.setImageResource((R.drawable.dice4));
                Toast.makeText(this, "Four!", Toast.LENGTH_LONG).show();
                break;
            case 5:
                dice.setImageResource((R.drawable.dice5));
                Toast.makeText(this, "Five!", Toast.LENGTH_LONG).show();
                break;
            case 6:
                dice.setImageResource((R.drawable.dice6));
                Toast.makeText(this, "Six!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}