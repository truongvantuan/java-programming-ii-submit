
import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T> list;
    
    public Hideout() {
        this.list = new ArrayList<T>();
    }

    public void putIntoHideout(T toHide) {
        this.list.add(toHide);
    }

    public T takeFromHideout() {
        if (this.list.isEmpty()) {
            return null;
        }

        return this.list.remove(0);
    }

    public boolean isInHideout() {
        return !this.list.isEmpty();
    }
}
