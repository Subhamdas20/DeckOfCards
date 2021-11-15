package com.bridgelabz.deckofcards;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
    ArrayList<String> cardList = new ArrayList<>();
    HashMap<String, Integer> cardMap = new HashMap<>();

    public Player(String firstname) {
        this.firstname = firstname;
    }

    String firstname;

    public void setCardList(String card) {
        cardList.add(card);
    }

    public void getCard() {
        for (String position : cardList) {
            System.out.print(position + ", ");
        }
    }

    public void numberOfSuits() {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for (int i = 0; i < suit.length; i++) {
            for (String card : cardList) {
                if (card.contains(suit[i])) {
                    if (cardMap.containsKey(suit[i])) {
                        cardMap.put(suit[i], cardMap.get(suit[i]) + 1);
                    } else {
                        cardMap.put(suit[i], 1);
                    }
                }
            }

        }

        cardMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }
}
