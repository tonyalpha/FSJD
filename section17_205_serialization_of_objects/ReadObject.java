package section17_205_serialization_of_objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\Users\\asherri\\OneDrive - Facilicom\\Documents\\Projects\\FSJD\\section17_205_serialization_of_objects\\vehicles.dat")) {
            try(ObjectInputStream ois = new ObjectInputStream(fis)) {
                Vehicle v1 = (Vehicle) ois.readObject();
                Vehicle v2 = (Vehicle) ois.readObject();
                System.out.println("Object 1: " + v1);
                System.out.println("Object 2: " + v2);
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException!");
        }
    }
}
