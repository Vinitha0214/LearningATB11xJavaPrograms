package ex_10_For_Loop;

public class Lab110_ForLoop_Condition {
    public static void main(String[] args) {
        int i = 10; // only initialization part outside is possible,
        // condition and updation part is not possible
        for ( ; i > 0 ; i--) {
              System.out.println(i);
          }
       // boolean c = i > 0;
       // for (; c; i--) {
       //     System.out.println(i); // it will run some random value and with exit code 130
      //  }
    }
}
