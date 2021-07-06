import java.util.Objects;

public class Pilot {
    private String name;
    private int age;
    private String modelOfPlane;

    public Pilot(String name, int age, String modelOfPlane) {
        this.age = age;
        this.name = name;
        this.modelOfPlane = modelOfPlane;
    }

    public String getName() {
        return name;
    }

    public String getPlaneModel() {
        return modelOfPlane;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pilot pilot = (Pilot) o;
        return age == pilot.age && name.equals(pilot.name) && modelOfPlane.equals(pilot.modelOfPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, modelOfPlane);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", planeModel='" + modelOfPlane + '\'' +
                '}';
    }
}
