
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<Literacy> country;
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row));
        } catch (IOException e) {
            System.out.println("Error: không thấy file " + e.getMessage());
        }

        country = rows.stream().map(row -> objectParse(row)).collect(Collectors.toCollection(ArrayList::new));
//        country.stream().forEach(object -> System.out.println(object.toString()));
        
        country.stream().sorted().forEach(object -> System.out.println(object.toString()));

    }

    public static Literacy objectParse(String row) {
        String[] parts = row.split(",");
        String country = parts[3];
        int year = Integer.valueOf(parts[4]);
        String gender = parts[2].split(" ")[1];
        double percent = Double.parseDouble(parts[5]);
        return new Literacy(country, year, gender, percent);
    }
}
