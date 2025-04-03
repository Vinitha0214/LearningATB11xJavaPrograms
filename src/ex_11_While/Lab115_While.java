package ex_11_While;

public class Lab115_While {
    public static void main(String[] args) {
        // its same like the for loop, initialization part is outside
        // its called as entry controlled loop
        int i = 0; // initialization
        while ( i < 10) { // condition
            System.out.println(i);
            i++; // updation
        }
        // ICU
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
