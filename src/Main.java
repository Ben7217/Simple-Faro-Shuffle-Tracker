import Tracker.NewDeckOrder;

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
        if(temp.contains(cardToTrack)) {
            cardsPosition += temp.indexOf(cardToTrack) + 1;
        }
        System.out.println("\n" + cardToTrack + " found at position " + cardsPosition + ".");






    }







}
