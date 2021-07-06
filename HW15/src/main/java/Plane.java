import java.util.Objects;

public class Plane {
    private final String planeModel;
    private final String serialNumber;
    private final int seats;

    public Plane(String planeModel, String serialNumber, int seats) {
        this.planeModel = planeModel;
        this.serialNumber = serialNumber;
        this.seats = seats;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return seats == plane.seats && planeModel.equals(plane.planeModel) && serialNumber.equals(plane.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, serialNumber, seats);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeModel='" + planeModel + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", numberOfSeats=" + seats +
                '}';
    }
}
