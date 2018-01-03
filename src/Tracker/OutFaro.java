package Tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OutFaro {
    ArrayList<String> first26;
    ArrayList<String> last26;
    ArrayList<String> oneShuffle;
    String[] suitesFirstHalf;
    String[] valuesFirstHalf;
    String[] suitesSecondHalf;
    String[] valuesSecondHalf;


    public ArrayList<String> OutFaro(String[] suitesFirstHalf, String[] valuesFirstHalf,
                                     String[] suitesSecondHalf, String[] valuesSecondHalf) {

        this.suitesFirstHalf = suitesFirstHalf;
        this.valuesFirstHalf = valuesFirstHalf;
        this.suitesSecondHalf = suitesSecondHalf;
        this.valuesSecondHalf = valuesSecondHalf;


        first26 = new ArrayList<>();

        for (String deckFirstSuites : suitesFirstHalf) {
            for (String deckFirstValues : valuesFirstHalf) {
                first26.add(deckFirstValues + " of " + deckFirstSuites);
            }
        }

        last26 = new ArrayList<>();

        for (String deckSecondSuites : suitesSecondHalf) {
            for (String deckSecondValues : valuesSecondHalf) {
                last26.add(deckSecondValues + " of " + deckSecondSuites);
            }
        }

        // One Shuffle
        oneShuffle = new ArrayList<>();

        for (int i = 0; i < first26.size() - 1; i++) {
            for (int j = 0; j < last26.size() - 1; j++) {
                oneShuffle.add(first26.get(i));
                oneShuffle.add(last26.get(j));
                i++;

            }
        }

        return oneShuffle;
    }

    @Override
    public String toString() {
        return "OutFaro{" +
                "oneShuffle=" + oneShuffle +
                '}';
    }
}
