
public class Main {

    public static void main(String[] args) {
        ProductWarehouse pw = new ProductWarehouse("mustard", 15);
        pw.addToWarehouse(10);
        System.out.print(pw);
    }

}
