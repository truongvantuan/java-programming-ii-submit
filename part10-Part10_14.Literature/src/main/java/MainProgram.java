
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRcm = Integer.parseInt(scanner.nextLine());
            books.add(new Book(title, ageRcm));
            System.out.println("");
        }

        System.out.println("");
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        for (Book book : books) {
            System.out.println(book);
        }
//        System.out.println("Books:");
//        books.forEach(book -> System.out.println(book.toString()));
//
////        orderBaseOnAge(books);
//        System.out.println("--------------");
//        orderBaseOnAgeName(books);

    }

    public static void orderBaseOnAge(List<Book> books) {
        System.out.println("Books:");
        books.stream().sorted().forEach(book -> System.out.println(book));
    }

    public static void orderBaseOnAgeName(List<Book> books) {
        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
                .thenComparing(Book::getName);

        books.sort(comparator);
        System.out.println("Books:");
        books.forEach(book -> System.out.println(book));
    }
}
