
import java.util.ArrayList;

public class Box implements Packable {

    private final double capacity;
    private final ArrayList<Packable> items;

    public Box(double volume) {
        this.capacity = volume;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        weight = items.stream().map((item) -> item.weight()).reduce(weight, (accumulator, _item) -> accumulator + _item);
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items," + " total weight " + this.weight() + " kg";
    }

}
