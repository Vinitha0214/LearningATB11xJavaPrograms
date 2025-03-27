package ex_07_Increment_Decrement_Op;

public class Lab069_In_De_Op {
    public static void main(String[] args) {
        // Take inputs
        String age_String = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
        //String a4 = args[4]; //java.lang.ArrayIndexOutOfBoundsException
        //if there is no agrument value, will get this exception
        int age = Integer.parseInt(age_String);
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
