package section17._199_writing_into_files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\asherri\\OneDrive - Facilicom\\Documents\\Projects\\FSJD\\section17\\_199_writing_into_files\\StudyEasy");
        file.mkdir();
        file = new File("C:\\Users\\asherri\\OneDrive - Facilicom\\Documents\\Projects\\FSJD\\section17\\_199_writing_into_files\\StudyEasy\\Team.txt");

        // WRITING FILES
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Mark\n");
            bw.write("Anton\n");
            bw.write("Eduart\n");
            bw.write("Kristian\n");
            bw.write("Marko\n");
            bw.write("Fat\n");
            System.out.println("Writing into file completed!");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error occurred while writing!");
        }

        // READING FILES
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\asherri\\OneDrive - Facilicom\\Documents\\Projects\\FSJD\\section17\\_199_writing_into_files\\StudyEasy\\Team.txt"));
            String line;
            System.out.println("****************");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
