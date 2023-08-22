package section17._203_file_deletion;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\asherri\\OneDrive - Facilicom\\Documents\\Projects\\FSJD\\section17\\_203_file_deletion\\team.txt");
        if(file.delete()) {
            System.out.println("Deletion is successful!");
        } else {
            System.out.println("Error while deleting!");
        }
    }
}
