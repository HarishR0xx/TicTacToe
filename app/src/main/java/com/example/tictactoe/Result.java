package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    TextView winner;
    String winnerName, player1Name, player2Name;
    Button home, replay;
    Intent homeIntent, gameBoard;
    Bundle bundle;
    MediaPlayer audio;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        winner = findViewById(R.id.winner);
        home = findViewById(R.id.home);
        replay = findViewById(R.id.replay);
        bundle = getIntent().getExtras();
        player1Name= bundle.getString("player1Name");
        player2Name= bundle.getString("player2Name");
        winnerName = bundle.getString("winner");
        winner.setText(winnerName+ " is the winner");
        if(!winnerName.equals("Draw")){
            audio= MediaPlayer.create(this, R.raw.clapping);
            audio.start();
        }
        else{
            audio= MediaPlayer.create(this, R.raw.booing);
            audio.start();
        }
        home.setOnClickListener( v-> {
            homeIntent = new Intent(Result.this, MainActivity.class);
            startActivity(homeIntent);
        });

        replay.setOnClickListener( v-> {
            bundle = new Bundle();
            bundle.putString( "player1Name", player1Name);
            bundle.putString("player2Name", player2Name);
            gameBoard = new Intent(Result.this, GameBoard.class);
            gameBoard.putExtras(bundle);
            startActivity(gameBoard);
        });
    }

    @Override
    public void onBackPressed(){
        moveTaskToBack(true);
    }
}