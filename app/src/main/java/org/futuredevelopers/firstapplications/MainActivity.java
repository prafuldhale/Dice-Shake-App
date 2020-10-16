package org.futuredevelopers.firstapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] diceImg = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice_sound);
        final ImageView dice1 = findViewById(R.id.imgDice1);
        final ImageView dice2 = findViewById(R.id.imgDice2);
       // static  int total= 0;
        Button btRoll = findViewById(R.id.roll_dice);
        btRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();


                int randNo = rand.nextInt(6);
                int randNo1 = rand.nextInt(6);

                dice1.setImageResource(diceImg[randNo]);
                dice2.setImageResource(diceImg[randNo1]);

                mp.start();
                Log.i("imageLog :", randNo + " " + randNo1);
            }
        });
    }

}