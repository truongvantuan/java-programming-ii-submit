
public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.volume += amount;
            if (volume > 100) {
                reset100();
            }
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            this.volume -= amount;
        }
        if (volume < 0) {
            reset0();
        }
    }

    public void reset100() {
        this.volume = 100;
    }

    public void reset0() {
        this.volume = 0;
    }

    @Override
    public String toString() {
        return this.volume + "/100";
    }
}
