package ex_14_Strings;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        //String buffer is mutable in nature, we can do manipulations of the string
        // memory management of string is better in String buffer

        // append function - add the strings (like concatenation)
        StringBuffer stringbuffer = new StringBuffer("Vini");
        stringbuffer.append("Karthi");
        System.out.println(stringbuffer);// only one string is stored
        //ViniKarthi
        System.out.println(stringbuffer.reverse()); // reverse of the words
    }
}
