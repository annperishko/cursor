package task1_2;


public class Person {
    private final String name;
    private final int age;
    private final Gender gender;
    private final Countries country;
    private Continents continent;

    public Person(String name, int age, Gender gender, Countries country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Countries getCountry() {
        return country;
    }

    public Gender getGender() {
        return gender;
    }

    public Continents getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
