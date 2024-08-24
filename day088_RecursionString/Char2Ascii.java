package day021;

public class Char2Ascii {
    public static void main(String[] args) {
        System.out.println('a' + 0);  // 97
        System.out.println('a' - 0);  // 97
        System.out.println('a' + 'a'); // 97 + 97
        System.out.println('a' - 'a'); // 0
        System.out.println('1' - 'a'); //-48
        System.out.println(1 - 'a'); // -96
        System.out.println(1 + 'a'); // 98
    }   
}
