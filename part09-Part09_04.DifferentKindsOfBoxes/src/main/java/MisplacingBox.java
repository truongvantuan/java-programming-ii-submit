
import java.util.ArrayList;


public class MisplacingBox extends Box{
    private final ArrayList<Item> itemList;
    
    public MisplacingBox() {
        this.itemList = new ArrayList<>();
    }
    
    
    @Override
    public void add(Item item) {
        this.itemList.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
