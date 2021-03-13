
import java.text.MessageFormat;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MAX = 100;
        int first = 0;
        int second = 0;

        while (true) {

            System.out.println(MessageFormat.format("First:{0}/100\n"
                    + "Second: {1}/100", first, second));
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add") && value > 0) {
                first += value;
            }
            if (first > MAX) {
                first = 100;
            }

            if (command.equals("move") && value > 0) {
                if (value < first) {
                    second += value;
                    first -= value;
                } else if (value >= first) {
                    second += first;
                    first = 0;
                }

                if (second > MAX) {
                    second = MAX;
                }
            }

            if (command.equals("remove")) {
                second -= value;
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }

}
