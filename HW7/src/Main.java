import task1_2.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static task1_2.Countries.*;
import static task1_2.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Petro", 25, MALE, UKRAINE));
        personList.add(new Person("Olena", 19, FEMALE, UKRAINE));
        personList.add(new Person("Marek", 50, MALE, POLAND));
        personList.add(new Person("Rasine", 65, FEMALE, POLAND));
        personList.add(new Person("Cherina", 42, FEMALE, FRANCE));
        personList.add(new Person("Bridgett", 18, FEMALE, FRANCE));
        personList.add(new Person("Jaron", 42, MALE, ISRAEL));
        personList.add(new Person("Namir", 18, MALE, ISRAEL));
        personList.add(new Person("John", 10, MALE, USA));
        personList.add(new Person("Jane", 78, FEMALE, USA));
        personList.add(new Person("Alonzo", 12, MALE, ARGENTINA));
        personList.add(new Person("Azael", 43, FEMALE, ARGENTINA));
        personList.add(new Person("Thomas", 12, MALE, AUSTRALIA));
        personList.add(new Person("Brittney", 43, FEMALE, AUSTRALIA));

        System.out.println("\ttask 1");
        personList.stream()
                .filter(i -> i.getAge() >= 18 && i.getAge() < 60)
                .forEach(i -> System.out.println(i.getName() + " - " + i.getGender()));

        System.out.println("\ttask 2");

        personList.stream()
                .filter(i -> i.getAge() >= 18 && i.getAge() < 60)
                .collect(Collectors.groupingBy(person -> person.getCountry().getContinent(),
                        Collectors.groupingBy(Person::getCountry,
                                Collectors.groupingBy(Person::getGender,
                                        Collectors.toList()))))
                .forEach((a, b) ->
                {
                    System.out.println(a);
                    b.forEach((c, d) -> {
                        System.out.println("\t" + c.toString());
                        d.forEach((e, f) -> {
                            System.out.println("\t\t" + e.toString());
                            System.out.println("\t\t\t" + f.toString());
                        });
                    });
                });
    }
}
