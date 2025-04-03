package ex_10_For_Loop;

public class Lab107_ForLoop_2 {
    public static void main(String[] args) {
        for (long i = 1l; i < 10; i++){
            System.out.println(i);
        } // any datatype is allowed, but it's not advisable to do, int datatype is enough,
        // anyway it increase the value by using increment operator
        for (float j = 0.0f; j < 10.67; j++){
            System.out.println("Hi float -> " + j);
        }
    }
}
