import Tracker.NewDeckOrder;
import Tracker.OutFaro;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Bicycle new deck order
        System.out.println("Current deck order:");
        NewDeckOrder newDeckOrder = new NewDeckOrder();
        newDeckOrder.setBicycleDeckOrder(newDeckOrder.americanNewDeckOrder());
        System.out.println(newDeckOrder.getBicycleDeckOrder().toString());

        // User input
        System.out.println("\nPlease enter the card you wish to track: ");
        String cardToTrack = input.nextLine();

        System.out.println("\nHow many out Faro's would you like to shuffle?");
        int numberOfFaros = input.nextInt();


        int cardsPosition = 0;

        if (newDeckOrder.americanNewDeckOrder().contains(cardToTrack)) {
            cardsPosition += newDeckOrder.americanNewDeckOrder().indexOf(cardToTrack) + 1;
        }
        System.out.println("\n" + cardToTrack + " starting position is " + cardsPosition + ".");

//        System.out.println("\n" + "Performing one out faro.");



        OutFaro outFaro = new OutFaro();

        outFaro.firstShuffle(newDeckOrder.getBicycleDeckOrder(), numberOfFaros);

        System.out.println("\n" + "After " + numberOfFaros + " shuffles the deck order is: " + outFaro.getOneShuffle());




        int cardAfterOneShuffle = 0;
        if (outFaro.getOneShuffle().contains(cardToTrack)) {
            cardAfterOneShuffle += outFaro.getOneShuffle().indexOf(cardToTrack) + 1;

        }
        System.out.println("\n" + "After " + numberOfFaros + " shuffles your card is at number " + cardAfterOneShuffle);




//        outFaro.setTwoShuffles(outFaro.secondShuffle(outFaro.getOneShuffle()));
//        int cardAfterTwoShuffles = 0;
//
//         System.out.println("\n" + "Second shuffle results: " + outFaro.getTwoShuffles());
//
//        if (outFaro.getTwoShuffles().contains(cardToTrack)) {
//            cardAfterTwoShuffles += outFaro.getTwoShuffles().indexOf(cardToTrack) + 1;
//
//        }
//
//        System.out.println("\n" + "After two shuffles, your card is at number " + cardAfterTwoShuffles);


    }


}
