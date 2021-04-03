
import java.util.ArrayList;

public class OneItemBox extends Box {

    private final ArrayList<Item> item;

    public OneItemBox() {
        this.item = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.item.isEmpty()) {
            this.item.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item.contains(item);
    }

}
