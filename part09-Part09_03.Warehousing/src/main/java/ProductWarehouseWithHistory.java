
import java.text.MessageFormat;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private final ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taked = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return taked;
    }

    public void printAnalysis() {
        System.out.println(MessageFormat.format("Product: {0}\n"
                + "History: {1}\n"
                + "Largest amount of product: {2}\n"
                + "Smallest amount of product: {3}\n"
                + "Average: {4}", super.getName(), this.changeHistory.toString(),
                this.changeHistory.maxValue(), this.changeHistory.minValue(),
                this.changeHistory.average()));
    }
}
