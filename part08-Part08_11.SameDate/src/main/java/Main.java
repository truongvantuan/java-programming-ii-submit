
public class Main {

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 3);
        System.out.println(d.equals("ss"));
        System.out.println(d.equals(new SimpleDate(1, 2, 3)));
        System.out.println(d.equals(new SimpleDate(1, 2, 4)));

    }
}
