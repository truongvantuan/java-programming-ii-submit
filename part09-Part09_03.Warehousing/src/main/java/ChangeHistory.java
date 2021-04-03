
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private final ArrayList<Double> historyChange;
    
    public ChangeHistory() {
        this.historyChange = new ArrayList<>();
    }
    
    public void add(double status) {
        this.historyChange.add(status);
    }
    
    public void clear() {
        this.historyChange.clear();
    }
    
    public double maxValue() {
        if (this.historyChange.isEmpty()) {
            return 0;
        }
        
        return Collections.max(historyChange);
    }
    
    public double minValue() {
        if (this.historyChange.isEmpty()) {
            return 0;
        }
        
        return Collections.min(historyChange);
    }
    
    public double average() {
        if (this.historyChange.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        
        sum = this.historyChange.stream().map((item) -> item).reduce(sum, (accumulator, _item) -> accumulator + _item);
        
        return sum / this.historyChange.size();
    }
    
    @Override
    public String toString() {
        return this.historyChange.toString();
    }
}
