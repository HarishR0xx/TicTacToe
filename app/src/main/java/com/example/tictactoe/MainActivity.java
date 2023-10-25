package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText player1, player2;
    Button play;
    Intent gameBoard;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        play=findViewById(R.id.play);
        play.setOnClickListener( v -> {
            if (player1.getText().toString().equals("")){
                player1.setError("Enter the player 1 name");
                player1.requestFocus();
            }
            if (player2.getText().toString().equals("")){
                player2.setError("Enter the player 2 name");
                player2.requestFocus();
            }
            if(!player1.getText().toString().equals("") && !player2.getText().toString().equals("")){
                Bundle bundle = new Bundle();
                bundle.putString( "player1Name", player1.getText().toString());
                bundle.putString("player2Name", player2.getText().toString());
                gameBoard = new Intent(MainActivity.this, GameBoard.class);
                gameBoard.putExtras(bundle);
                startActivity(gameBoard);
            }
        });
    }
}