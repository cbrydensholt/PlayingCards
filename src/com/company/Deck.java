package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

    private Card[] deck;
    private int currentCard;


   public static ArrayList<Card> deckList = new ArrayList<>();

    public Deck(Card[] deck, int currentCard) {
        this.deck = deck;
        this.currentCard = currentCard;
    }

    public Deck() {

    }

    public void instantiateCards() {

        //spade
        for (int i = 1; i < 14; i++) {
            Card card = new Card(0, "spades", "");
            card.setValue(i);
            card.setFace(Integer.toString(i));
            if (i == 11) {
                card.setFace("Jack");

            } else if (i == 12) {
                card.setFace("Queen");
            } else if (i == 13) {
                card.setFace("King");
            } else if (i == 1) {
                card.setFace("Ace");
            }

            //System.out.println(card.getSuit() + " " + card.getValue() + " " + card.getFace());
            deckList.add(card);

        }

        for (int i = 1; i < 14; i++) {
            Card card = new Card(0, "hearts", "");
            card.setValue(i);
            card.setFace(Integer.toString(i));
            if (i == 11) {
                card.setFace("Jack");

            } else if (i == 12) {
                card.setFace("Queen");
            } else if (i == 13) {
                card.setFace("King");
            } else if (i == 1) {
                card.setFace("Ace");
            }


            //System.out.println(card.getSuit() + " " + card.getValue() + " " + card.getFace());
            deckList.add(card);

        }
        for (int i = 1; i < 14; i++) {
            Card card = new Card(0, "diamonds", "");
            card.setValue(i);
            card.setFace(Integer.toString(i));
            if (i == 11) {
                card.setFace("Jack");

            } else if (i == 12) {
                card.setFace("Queen");
            } else if (i == 13) {
                card.setFace("King");
            } else if (i == 1) {
                card.setFace("Ace");
            }


            //System.out.println(card.getSuit() + " " + card.getValue() + " " + card.getFace());
            deckList.add(card);

        }
        for (int i = 1; i < 14; i++) {
            Card card = new Card(0, "clubs", "");
            card.setValue(i);
            card.setFace(Integer.toString(i));
            if (i == 11) {
                card.setFace("Jack");

            } else if (i == 12) {
                card.setFace("Queen");
            } else if (i == 13) {
                card.setFace("King");
            } else if (i == 1) {
                card.setFace("Ace");
            }


            //System.out.println(card.getSuit() + " " + card.getValue() + " " + card.getFace());
            deckList.add(card);

        }




    }



        public void testDeck() {

        for (Card c : deckList) {
            System.out.println(c.getSuit() + " " + c.getValue() + " " + c.getFace());
        }

    }

    public void shuffleDeck() {

        Collections.shuffle(deckList);
        //iterable
        for (Card c : deckList) {
            System.out.println(c.getSuit() + " " + c.getValue() + " " + c.getFace());
        }

    }

    public Card drawCard(){
        System.out.println("You have drawn " + deckList.get(0).getSuit() + " of " + deckList.get(0).getFace());
        deckList.remove(0);
        System.out.println("There are now " + deckList.size() + " cards left");
        //System.out.println(deckList.get(0));

        return deckList.get(0);

    }


    public ArrayList<Card> getDeckList() {
        return deckList;
    }

    public void setDeckList(ArrayList<Card> deckList) {
        this.deckList = deckList;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + Arrays.toString(deck) +
                ", currentCard=" + currentCard +
                ", deckList=" + deckList +
                '}';
    }
}