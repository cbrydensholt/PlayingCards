package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {

    int player1score;
    int player2score;
    Card player1draw;
    Card player2draw;


    ArrayList<Card> gameList = new ArrayList<>();

    Deck deck = new Deck();

    public void transferList(){

        for(Card c : deck.deckList){
            gameList.add(c);
        }

    }

    public void playGame() {



        do{


        player1draw = deck.deckList.get(0);
        player2draw = deck.deckList.get(1);


        int difBetweenValue = 0;
        if(player1draw.getValue() >= player2draw.getValue()){
            difBetweenValue = player1draw.getValue() - player2draw.getValue();
            }
        if(player2draw.getValue() >= player1draw.getValue()){
            difBetweenValue = player2draw.getValue() - player1draw.getValue();
        }




                System.out.println("Player 1 has drawn " + deck.deckList.get(0).getSuit() + " of " + deck.deckList.get(0).getFace() + " with value " + player1draw.getValue());
                System.out.println("Player 2 has drawn " + deck.deckList.get(1).getSuit() + " of " + deck.deckList.get(1).getFace() + " with value " + player2draw.getValue());

                if (player1draw.getValue() > player2draw.getValue()) {
                    player1score = player1score + difBetweenValue;
                } else if (player2draw.getValue() > player1draw.getValue()) {
                    player2score = player2score + difBetweenValue;
                } 

                System.out.println("Player 1 score is " + player1score);
                System.out.println("Player 2 score is " + player2score);


                deck.deckList.remove(player1draw);
                deck.deckList.remove(player2draw);

                System.out.println(deck.deckList.size());


            }  while(deck.deckList.size() > 0);











    }

    public void testDeck() {
        System.out.println("heh");
        for (Card c : deck.deckList) {
            System.out.println(c.getSuit() + " " + c.getValue() + " " + c.getFace());
        }

    /* public void drawCard(){
        System.out.println("You have drawn " + deckList.get(0).getSuit() + " of " + deckList.get(0).getFace());
        deckList.remove(0);
        System.out.println("There are now " + deckList.size() + " cards left");
        //System.out.println(deckList.get(0));

    } */


    }
}