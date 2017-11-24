import java.util.ArrayList;

public class Deck {

    private String suites;
    private String values;
public Deck(){}

    public Deck(String suites, String values) {
        this.suites = suites;
        this.values = values;
    }

    public String getSuites() {
        return suites;
    }

    public void setSuites(String suites) {
        this.suites = suites;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }


    @Override
    public String toString() {
        return "Deck{" +
                "suites='" + suites + '\'' +
                ", values='" + values + '\'' +
                '}';
    }
}
