package ex_05_Type_Casting;

public class Lab060_TypeCasting_Narrow {
    public static void main(String[] args) {
        long phone_no = 8956564490l;
       // short s = phone_no; // implict narrowing is not possible
        short s1 = (short) phone_no; // its explicit narrowing in type casting
        System.out.println(s1);

    }
}
