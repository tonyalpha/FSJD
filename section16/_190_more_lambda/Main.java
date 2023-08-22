package section16._190_more_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Anton"));
        list.add(new Data("Eduart"));
        list.add(new Data("Mark"));
        list.add(new Data("Agon"));
        list.add(new Data("Arlind"));

        /*
        Collections.sort(list, Comparator.comparing(Data::getName)); // ANOTHER POSSIBILITY FOR CODE BELOW

        Collections.sort(list, new Comparator<Data>() {

        @Override
        public int compare(Data o1, Data o2) {
        return o1.getName().compareTo(o2.getName());
        }
        });

        !!! ABOVE CODE ADAPTED TO 1 LINE USING LAMBDA EXPRESSION BELOW !!!
         */

        Collections.sort(list, (Data o1, Data o2)->
        {
            if(o1.getName().length() < o2.getName().length()) {
                return -1;
            } else if(o1.getName().length() > o2.getName().length()) {
                return 1;
            } else {
                return 0;
            }
        });

        for(Data data : list) {
            System.out.println(data);
        }
    }
}
