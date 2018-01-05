package Tracker;

import java.util.ArrayList;

public class OutFaro {
    private ArrayList<String> shuffleResults;
    private ArrayList<String> oneShuffles;
    private ArrayList<String> twoShuffles;
    private ArrayList<String> threeShuffles;
    private ArrayList<String> fourShuffles;
    private ArrayList<String> fiveShuffles;
    private ArrayList<String> sixShuffles;
    private ArrayList<String> sevenShuffles;
    private ArrayList<String> eightShuffles;
    int shuffleCounter;
    NewDeckOrder americanOrder;


    public ArrayList<String> getOneShuffle() {
        return shuffleResults;
    }

    public void setOneShuffle(ArrayList<String> oneShuffle) {
        this.shuffleResults = oneShuffle;
    }

    public ArrayList<String> firstShuffle(ArrayList<String> newDeckOrder, int numberOfFaros) {


        // first out faro Shuffle
        shuffleResults = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        while (shuffleCounter != numberOfFaros) {

            for (int i = 0; i < newDeckOrder.size() - 26; i++) {
                for (int j = 26; j < newDeckOrder.size(); j++) {
                    temp.add(newDeckOrder.get(i));
                    temp.add(newDeckOrder.get(j));
                    i++;
                }
            }

            shuffleCounter++;
            if (shuffleCounter == numberOfFaros) {
                shuffleResults = temp;
            } else {
                firstShuffle(temp, numberOfFaros);
            }

        }

        return shuffleResults;
    }

    public ArrayList<String> getTwoShuffles() {
        return twoShuffles;
    }

    public void setTwoShuffles(ArrayList<String> twoShuffles) {
        this.twoShuffles = twoShuffles;
    }

//    public ArrayList<String> secondShuffle(ArrayList<String> firstShuffleResults) {
//
//        firstShuffleResults = oneShuffle;
//
//        // Second Shuffle
//        twoShuffles = new ArrayList<>();
//
//        for (int i = 0; i < firstShuffleResults.size() - 26; i++) {
//            for (int j = 26; j < firstShuffleResults.size(); j++) {
//                twoShuffles.add(firstShuffleResults.get(i));
//                twoShuffles.add(firstShuffleResults.get(j));
//                i++;
//
//            }
//        }
//
//        return twoShuffles;
//
//    }
//


    @Override
    public String toString() {
        return "OutFaro{" +
                "oneShuffle=" + shuffleResults +
                '}';
    }
}
