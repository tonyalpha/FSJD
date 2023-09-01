package section17._205_serialization_of_objects;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String type;
    private int number;

    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
