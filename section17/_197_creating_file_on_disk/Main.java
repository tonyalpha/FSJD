package section17._197_creating_file_on_disk;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        {
            File file = new File("C:\\New Folder\\StudyEasy.txt");
            try {
                file.createNewFile();
                System.out.println("File created!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
