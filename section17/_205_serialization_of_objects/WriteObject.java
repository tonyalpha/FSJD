package section17._205_serialization_of_objects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Bike", 5);
        Vehicle car = new Vehicle("Car", 10);

        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\asherri\\OneDrive - Facilicom\\Documents\\Projects\\FSJD\\section17\\_205_serialization_of_objects\\vehicles.dat")) {
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(bike);
                oos.writeObject(car);
                System.out.println("Objects written successfully!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }
    }
}
