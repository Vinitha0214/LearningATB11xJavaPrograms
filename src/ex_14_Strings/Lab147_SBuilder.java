package ex_14_Strings;

public class Lab147_SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        System.out.println(sb);
        System.out.println(sb.reverse()); // reverse
    }
}
