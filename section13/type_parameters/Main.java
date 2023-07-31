package section13.type_parameters;

/*
*
* The naming conventions are as follows:
T - Type
E - Element
K - Key
N - Number
V - Value
*
 */

public class Main {
    public static void main(String[] args) {
        Data<Integer, String> data = new Data<>(1, "Anton");
        System.out.println("Key: " + data.getKey() + "\nValue: " + data.getValue());
        data.display("Element", 25);
    }
}
