
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.print("Enter a string: ");
        String in = input.nextLine();

        if (checker.isDayOfWeek(in)) {
            System.out.println("Form is correct!");
        } else {
            System.out.println("The form is incorrect");
        }
    }
}
