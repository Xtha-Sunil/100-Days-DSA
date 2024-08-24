import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String name = "Sunil Shrestha          ";
        // stripTrailing(), stripLeading()
        System.out.println(name.strip());

        //returns true if it contains only whitespace
        System.out.println(name.isBlank());
        // return true if length == 0
        System.out.println(name.isEmpty());

        // charAt, toCharArray, indexOf, last/first Index, split(), 
        // compreTo, compareIgnoreCase, contains, concat, 
        // startsWith , endsWith, replace, replaceAll
        System.out.println(name.hashCode());
        System.out.println(name.matches("(S)"));
        System.out.println(Arrays.toString(name.split(" "))); 

        // == comparator checks weather the operand are same Object or not
        // String a = "Sunil";
        // String b = "Sunil";
        // System.out.println(a == b); // true because concept of StringPool
        
        // we can avoid this by new keyword, new will create in heap
        // String n1 = new String("Sunil");
        // String n2 = new String("Sunil");
        // System.out.println(n1 == n2); // false because different objects are made
        
        // // if we want to check the value then
        // System.out.print(n1.equals(n2)); // true
    }
}
