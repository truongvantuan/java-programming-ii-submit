
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(person -> this.persons.add(person));
    }

    public void print() {
        this.persons.forEach(person -> System.out.println(person));
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
