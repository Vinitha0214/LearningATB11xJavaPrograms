package ex_14_Strings;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        char c = 'A'; // it's a char
        System.out.println(c);

        String s1 = "ABC"; // it's a string
        System.out.println(s1.length());// it will tell the number of char, starts from 1
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(" E")); // space also we can give
    }
}
