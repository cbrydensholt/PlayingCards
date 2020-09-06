package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game();
        Deck deck = new Deck();
        Card card = new Card();
        deck.instantiateCards();
        //deck.testDeck();
        //deck.addToGameDeck();
        deck.shuffleDeck();
        //deck.drawCard();
        //game.transferList();
        game.testDeck();
        game.playGame();
        //game.testDeck();


    }
}
