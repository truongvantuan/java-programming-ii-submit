
import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> elements;

    public Pipe() {
        this.elements = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.elements.add(value);
    }

    public T takeFromPipe() {
        T pick = this.elements.get(0);
        this.elements.remove(0);
        return pick;
    }

    public boolean isInPipe() {
        return !this.elements.isEmpty();
    }
}
