package ex_14_Strings;

public class Lab141_String_Interivew_IM {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello"; // SCP - 1 string


        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello"); // OA - 3 strings

        // == -> comparison, but in strings -> this check the location reference

        System.out.println(s1 == s3);
        // s1 is in SCP, s3 is in OA, hence it print false
        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // if you want to check the content, then use equals function
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));// not checks the case-sensitive

    }
}
