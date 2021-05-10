
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> list2 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> list3 = numbers.stream()
                .filter(number -> number % 3 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> list5 = numbers.stream()
                .filter(number -> number % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return Stream.of(list2, list3, list5).flatMap(x -> x.stream()).collect(Collectors.toCollection(ArrayList::new));
    }

}
