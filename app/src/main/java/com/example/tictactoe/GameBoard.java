package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GameBoard extends AppCompatActivity {

    TextView b00, b01, b02, b10, b11, b12, b20, b21, b22, player1, player2;
    String b00s, b01s, b02s, b10s, b11s, b12s, b20s, b21s, b22s;
    static int count = 0;
    Intent result;
    String player1Name, player2Name;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameboard);
        Bundle bundle = getIntent().getExtras();
        player1Name = bundle.getString("player1Name");
        player2Name = bundle.getString("player2Name");
        player1 = findViewById(R.id.player1);
        player1.setText(player1Name);
        player2 = findViewById(R.id.player2);
        player2.setText(player2Name);
        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b00.setOnClickListener(v -> {
            if (b00.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b00.setText("x");
                }
                else{
                    b00.setText("o");
                }
            }
            else{
                Toast.makeText(this,"Already Occupied", Toast.LENGTH_SHORT).show();
            }
            checkWinner();
        });
        b01.setOnClickListener(v -> {
            if (b01.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b01.setText("x");
                }
                else{
                    b01.setText("o");
                }
            }
            checkWinner();
        });
        b02.setOnClickListener(v -> {
            if (b02.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b02.setText("x");
                }
                else{
                    b02.setText("o");
                }
            }
            checkWinner();
        });
        b10.setOnClickListener(v -> {
            if (b10.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b10.setText("x");
                }
                else{
                    b10.setText("o");
                }
            }
            checkWinner();
        });
        b11.setOnClickListener(v -> {
            if (b11.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b11.setText("x");
                }
                else{
                    b11.setText("o");
                }
            }
            checkWinner();
        });
        b12.setOnClickListener(v -> {
            if (b12.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b12.setText("x");
                }
                else{
                    b12.setText("o");
                }
            }
            checkWinner();
        });
        b20.setOnClickListener(v -> {
            if (b20.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b20.setText("x");
                }
                else{
                    b20.setText("o");
                }
            }
            checkWinner();
        });
        b21.setOnClickListener(v -> {
            if (b21.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b21.setText("x");
                }
                else{
                    b21.setText("o");
                }
            }
            checkWinner();
        });
        b22.setOnClickListener(v -> {
            if (b22.getText().toString().equals(" ")){
                count+=1;
                if(count%2!=0){
                    b22.setText("x");
                }
                else{
                    b22.setText("o");
                }
            }
            checkWinner();
        });
    }
    void checkWinner(){
        if(count>=5){
            b00s=b00.getText().toString();
            b02s=b02.getText().toString();
            b01s=b01.getText().toString();
            b10s=b10.getText().toString();
            b11s=b11.getText().toString();
            b12s=b12.getText().toString();
            b20s=b20.getText().toString();
            b21s=b21.getText().toString();
            b22s=b22.getText().toString();

            if(b00s.equals(b01s) && b00s.equals(b02s) && !b00s.equals(" ")){
                count=0;
                if(b00s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(b10s.equals(b11s) &&b10s.equals(b12s) && !b10s.equals(" ")){
                count=0;
                if(b10s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(b20s.equals(b21s) &&b20s.equals(b22s) && !b20s.equals(" ")){
                count=0;
                if(b20s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(b00s.equals(b10s) &&b00s.equals(b20s) && !b00s.equals(" ")){
                count=0;
                if(b00s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(b01s.equals(b11s) &&b01s.equals(b21s) && !b01s.equals(" ")){
                count=0;
                if(b01s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(b02s.equals(b12s) &&b02s.equals(b22s) && !b02s.equals(" ")){
                count=0;
                if(b02s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(b00s.equals(b11s) &&b00s.equals(b22s) && !b00s.equals(" ")){
                count=0;
                if(b00s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(b02s.equals(b11s) &&b02s.equals(b20s) && !b02s.equals(" ")){
                count=0;
                if(b02s.equals("x")){
                    displayResults(player1Name, player2Name, player1Name);
                }
                else{
                    displayResults(player1Name,player2Name,player2Name);
                }
            }
            if(count==9){
                count=0;
                displayResults(player1Name, player2Name, "Draw");
            }
        }
    }
    void displayResults(String p1, String p2, String winner){
        Bundle bundle = new Bundle();
        bundle.putString("player1Name", p1);
        bundle.putString("player2Name", p2);
        bundle.putString( "winner", winner);
        result = new Intent(GameBoard.this, Result.class);
        result.putExtras(bundle);
        startActivity(result);
    }

    @Override
    public void onBackPressed(){
        moveTaskToBack(true);
    }
}