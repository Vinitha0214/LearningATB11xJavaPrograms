package ex_05_Type_Casting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Implicit widening - automatically it convert smaller to bigger data type without mentioning datatype (int)
        int a1 = (int)b; // Explicit casting - Widening (doesn't require) - mentioning (int)b
        //
    }
}
