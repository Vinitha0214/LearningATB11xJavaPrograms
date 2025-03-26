package ex_05_Type_Casting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
       // int total = course + gst; // Narrow implicit
        int total1 = course + (int)gst;
        System.out.println(total1);

        float total2 = course + gst; // widening - auto- - implicit
        float total3 = (float)course + gst; // widening - explicit
        System.out.println(total2);
        System.out.println(total3);

    }
}
