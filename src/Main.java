import Tracker.NewDeckOrder;
import Tracker.OutFaro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        NewDeckOrder deckOrder;
        // Bicycle new deck order
        System.out.println("Current deck order:");
        NewDeckOrder newDeckOrder = new NewDeckOrder();
        System.out.println(newDeckOrder.toString());

        // One out faro
        System.out.println("\nPlease enter the card you wish to track: ");
        Scanner input = new Scanner(System.in);
        String cardToTrack = input.nextLine();

        deckOrder = new NewDeckOrder();

        int cardsPosition = 0;
        ArrayList<String> temp = deckOrder.getList();
        if (temp.contains(cardToTrack)) {
            cardsPosition += temp.indexOf(cardToTrack) + 1;
        }
        System.out.println("\n" + cardToTrack + " starting position is " + cardsPosition + ".");
        System.out.println("\nPerforming one out faro.");

        OutFaro outFaro = new OutFaro();

        String[] firstHalfSuites = new String[]{"Hearts", "Clubs"};
        String[] firstHalfValues = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] secondHalfSuites = new String[]{"Diamonds", "Spades"};
        String[] secondHalfValues = new String[]{"King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};

        System.out.println("First shuffle results: " + outFaro.OutFaro(firstHalfSuites, firstHalfValues, secondHalfSuites, secondHalfValues));

        int cardAfterOneShuffle = 0;
        if (outFaro.OutFaro(firstHalfSuites, firstHalfValues,
                secondHalfSuites, secondHalfValues).contains(cardToTrack)) {
            cardAfterOneShuffle += outFaro.OutFaro(firstHalfSuites, firstHalfValues,
                    secondHalfSuites, secondHalfValues).indexOf(cardToTrack) + 1;

        }
        System.out.println("After one shuffle, your card is at number " + cardAfterOneShuffle);

    }


}
