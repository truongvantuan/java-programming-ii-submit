
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }
    
    public List<Card> getCards() {
        return this.hand;
    }

    public void print() {
        this.hand.forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = this.hand.stream().mapToInt(card -> card.getValue()).sum();
        int sum2 = o.hand.stream().mapToInt(card -> card.getValue()).sum();
        return sum1 - sum2;
    }
    
    
}
