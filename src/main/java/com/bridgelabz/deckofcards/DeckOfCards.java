package com.bridgelabz.deckofcards;

public class DeckOfCards {

    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] deck = new String[52];

    /*
     * uniqueDeckOfCard method is used to initialize the deck with cards
     */
    public void uniqueDeckOfCard() {
        int count = 0;
        for (int row = 0; row < suits.length; row++) {
            for (int column = 0; column < ranks.length; column++) {
                deck[count] = ranks[column] + "-" + suits[row] + " ";
                count++;
            }
        }

    }


    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.uniqueDeckOfCard();
    }

}
