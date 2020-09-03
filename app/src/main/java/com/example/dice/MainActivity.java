package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView ivDice;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(this,R.raw.die_roll);
        ivDice=findViewById(R.id.ivDice);
        ivDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp!=null)
                {
                mp.stop();
                mp.release();
                mp=null;
                }
                mp=MediaPlayer.create(getApplicationContext(),R.raw.die_roll);
                mp.start();
                Random r =new Random();
                int num =r.nextInt(6)+1;
                switch (num)
                {
                    case 1:
                        ivDice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        ivDice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        ivDice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        ivDice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        ivDice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        ivDice.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });
    }
}