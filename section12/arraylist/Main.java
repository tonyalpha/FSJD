package section12.arraylist;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> listNames = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        listNames.add("Anton");
        listNames.add("Eduart");
        listNames.add("Agon");
        listNames.add("Arlind");
        listNames.add("Arjanit");
        listNames.add("Mark");
        listNames.add("Idriz");
        listNames.add("Kristian");
//        System.out.println(listNames.get(0));
//        System.out.println(listNames);
        main.displayList(listNames);
        main.removeNameByPosition(listNames.size()-1);
        System.out.println("\n\n");
        main.displayList(listNames);

        main.removeNameByName("Idriz");

        System.out.println("\n\n");
        main.displayList(listNames);

        System.out.println("\n\n");
        main.modifyName(4, "Arianit");
        main.displayList(listNames);

        System.out.println("\n\n");
        int position = main.search("Anton");
        if(position != -1) {
            main.modifyName(position, "Tony");
        } else {
            System.out.println("Invalid entry.");
        }
        main.displayList(listNames);
    }

    void removeNameByPosition(int position) {
        listNames.remove(position);
    }
    void removeNameByName(String name) {
        listNames.remove(name);
    }

    void modifyName(int position, String newName) {
        listNames.set(position, newName);
    }

    int search(String name) {
        return listNames.indexOf(name);
    }
    void displayList(ArrayList<String> names) {
        for(String name: names) {
            System.out.println(name);
        }
    }
}
