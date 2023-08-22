package section17._198_creating_directory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        {
            File directory = new File("C:\\New Folder\\Directory\\StudyEasy\\Student\\Tony");
            directory.mkdirs();
            System.out.println("Folder created!");

            File file = new File("C:\\New Folder\\Directory\\StudyEasy\\Student\\Tony\\Test.txt.txt");
            try {
                file.createNewFile();
                System.out.println("File created!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}