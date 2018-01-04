package Tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OutFaro {
    private ArrayList<String> oneShuffle;
    private ArrayList<String> twoShuffles;


    public ArrayList<String> getOneShuffle() {
        return oneShuffle;
    }

    public void setOneShuffle(ArrayList<String> oneShuffle) {
        this.oneShuffle = oneShuffle;
    }

    public ArrayList<String> firstShuffle(String[] suitesFirstHalf, String[] valuesFirstHalf,
                                          String[] suitesSecondHalf, String[] valuesSecondHalf) {

        ArrayList<String> first26 = new ArrayList<>();

        for (String deckFirstSuites : suitesFirstHalf) {
            for (String deckFirstValues : valuesFirstHalf) {
                first26.add(deckFirstValues + " of " + deckFirstSuites);
            }
        }

        ArrayList<String> last26 = new ArrayList<>();

        for (String deckSecondSuites : suitesSecondHalf) {
            for (String deckSecondValues : valuesSecondHalf) {
                last26.add(deckSecondValues + " of " + deckSecondSuites);
            }
        }

        // One Shuffle
        oneShuffle = new ArrayList<>();

        for (int i = 0; i < first26.size(); i++) {
            for (int j = 0; j < last26.size(); j++) {
                oneShuffle.add(first26.get(i));
                oneShuffle.add(last26.get(j));
                i++;

            }
        }

        return oneShuffle;
    }

    public ArrayList<String> getTwoShuffles() {
        return twoShuffles;
    }

    public void setTwoShuffles(ArrayList<String> twoShuffles) {
        this.twoShuffles = twoShuffles;
    }

    public ArrayList<String> secondShuffle(ArrayList<String> firstShuffleResults) {

        ArrayList<String> first26SecondShuffle = new ArrayList<>();
        ArrayList<String> last26SecondShuffle = new ArrayList<>();

        for(int i = 0; i < firstShuffleResults.size() - 26; i++) {
            first26SecondShuffle.add(firstShuffleResults.get(i));
        }

        for(int j = 26; j < firstShuffleResults.size(); j++) {
            last26SecondShuffle.add(firstShuffleResults.get(j));
        }

        // Second Shuffle
        twoShuffles = new ArrayList<>();

        for (int i = 0; i < first26SecondShuffle.size() - 1; i++) {
            for (int j = 0; j < last26SecondShuffle.size() - 1; j++) {
                twoShuffles.add(first26SecondShuffle.get(i));
                twoShuffles.add(last26SecondShuffle.get(j));
                i++;

            }
        }

        return twoShuffles;

    }

    @Override
    public String toString() {
        return "firstShuffle{" +
                "oneShuffle=" + oneShuffle +
                '}';
    }
}
