
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {

        List<Book> books = new ArrayList<>();
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        books = rows.stream().map(row -> bookParsing(row)).collect(Collectors.toCollection(ArrayList::new));
        return books;
    }

    public static Book bookParsing(String line) {
        String[] parts = line.split(",");
        Book newBook = new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]);
        return newBook;
    }

}
