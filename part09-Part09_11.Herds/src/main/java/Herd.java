
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private final List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movale) {
        this.herd.add(movale);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable animal : herd) {
            animal.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable animal : this.herd) {
            sb.append(animal.toString() + "\n");
        }
        return sb.toString();
    }
}
