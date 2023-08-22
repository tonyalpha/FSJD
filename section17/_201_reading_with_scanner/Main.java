package section17._201_reading_with_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\asherri\\OneDrive - Facilicom\\Documents\\Projects\\FSJD\\section17\\_201_reading_with_scanner\\Test.txt"));
            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
