
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                break;
            }

            inputs.add(value);
        }

        inputs.stream().filter(number -> number >= 1 && number <= 5).forEach(s -> System.out.println(s));
    }
}
