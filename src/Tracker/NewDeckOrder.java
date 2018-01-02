package Tracker;

import java.util.ArrayList;
import java.util.List;

public class NewDeckOrder {

    private ArrayList<String> bicycleDeckOrder;

  public NewDeckOrder() {

        String[] suitesFirstHalf = {"Hearts", "Clubs"};
        String[] valuesFirstHalf = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] suitesSecondHalf = {"Diamonds", "Spades"};
        String[] valuesSecondHalf = {"King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};

        bicycleDeckOrder = new ArrayList<>();

        for (String deckFirstSuites : suitesFirstHalf) {
            for (String deckFirstValues : valuesFirstHalf) {
                bicycleDeckOrder.add(deckFirstValues + " of " + deckFirstSuites);
            }
        }

        for (String deckSecondSuites : suitesSecondHalf) {
            for (String deckSecondValues : valuesSecondHalf) {
                bicycleDeckOrder.add(deckSecondValues + " of " + deckSecondSuites);
            }
        }
    }

    public ArrayList<String> getList() {
        return bicycleDeckOrder;
    }
    @Override
    public String  toString() {
        return "New Deck Order " + bicycleDeckOrder;
    }
}
