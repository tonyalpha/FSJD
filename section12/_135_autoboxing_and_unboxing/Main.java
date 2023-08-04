package section12._135_autoboxing_and_unboxing;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /* ArrayList<Integer> studentNumbers = new ArrayList<>();
        studentNumbers.add(1);
        System.out.println(studentNumbers.get(0)); //unboxing

        ArrayList<intWrapper> studentNumbers = new ArrayList<>();
        studentNumbers.add(new intWrapper(25));
        System.out.println(studentNumbers.get(0).getIntValue()); //unboxing */

        ArrayList<Double> demoList = new ArrayList<>();
//        demoList.add(25.2);
//        demoList.add(new Double(25.2));
        demoList.add(Double.valueOf(25.2)); //This is done while autoboxing
//        System.out.println(demoList.get(0)); // watch line below for unboxing
        System.out.println(demoList.get(0).doubleValue());
    }


























    class intWrapper {
        public int intValue;
        public intWrapper(int intValue) {
            this.intValue = intValue;
        }
        public int getIntValue() {
            return intValue;
        }
        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }
    }
}
