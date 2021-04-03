
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private final int capacity;
    private final ArrayList<Item> itemList;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() < 0) {
            return;
        }
        if (this.totalWeight() + item.getWeight() <= this.capacity) {
            this.itemList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemList.contains(item);
    }

    public ArrayList<Item> getList() {
        return this.itemList;
    }

    public int totalWeight() {
        int sum = 0;
        sum = itemList.stream().map((item) -> item.getWeight()).reduce(sum, Integer::sum);
        return sum;
    }
}
