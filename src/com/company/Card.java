package com.company;

public class Card {


    int value;
    String suit;
    String face;

    public Card(int value, String suit, String face) {
        this.value = value;
        this.suit = suit;
        this.face = face;
    }

    public Card() {

    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", suit='" + suit + '\'' +
                ", face='" + face + '\'' +
                '}';
    }

  /*public void instantiateCards(){

        //spade
        for(int i =0; i<15; i++){
            Card card = new Card(0, "spade");
            card.setValue(i);
                System.out.println(card.getSuit() + " " + card.getValue());

        }


    } */


}


//lav varibaler og constructor der kan constructe de forskellige kort vi skal bruge
//brug måske array som i intarray opgaven, og bare -1 plads hver gang vi trækker et kort.
//brug shuffle() til at shuffle
//brug loop til at vælge kort
//brug getters til at vise værdien, og brug disse værdier til at finde ud af hvem