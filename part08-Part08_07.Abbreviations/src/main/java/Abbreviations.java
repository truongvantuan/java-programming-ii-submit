
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.abbreviations.containsKey(abbreviation)) {
            System.out.println("Abbreviation already in HashMap");
        } else {
            this.abbreviations.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (this.abbreviations.containsKey(abbreviation)) {
            return this.abbreviations.get(abbreviation);
        }
        return null;
    }
}
