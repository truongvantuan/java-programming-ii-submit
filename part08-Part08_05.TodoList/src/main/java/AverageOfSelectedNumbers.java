
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        TodoList list = new TodoList();
list.add("read the course material");
list.add("watch the latest fool us");
list.add("take it easy");

list.print();
list.remove(2);

System.out.println();
list.print();

    }
}
