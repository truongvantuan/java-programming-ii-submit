
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        if (command.equals("n")) {
            averageNegativeNumbers(inputs);
        } else {
            averagePositiveNumbers(inputs);
        }

    }

    public static void averageNegativeNumbers(List<String> inputs) {
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();
        System.out.println("Average of the negative numbers: " + average);
    }

    public static void averagePositiveNumbers(List<String> inputs) {
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0).average().getAsDouble();
        System.out.println("Average of the positive numbers: " + average);
    }
}
