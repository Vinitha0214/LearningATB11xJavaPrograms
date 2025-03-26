package ex_05_Type_Casting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
       //byte b = val; // invlaid - narrowing - implicit casting is not allowed

        byte b1 = (byte)val; // valid narrowing - Explicit casting - Allowed
        //Data loss will be there
        //first int value will be converted into binary value,
        // this value will change to 8 bits, from 8 bits it change to decimal value
        System.out.println(b1); // output is 56
    }
}
