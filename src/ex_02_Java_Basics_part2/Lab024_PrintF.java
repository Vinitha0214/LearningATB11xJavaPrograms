package ex_02_Java_Basics_part2;

public class Lab024_PrintF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("your variable is %d",a);
        //printf is used for formatting
        //basically %d replace the int value of a and b in this program
        // %d -> int, byte, long, short - data type
        // %s -> string
        // %f -> float, double
        // %b -> boolean

        int b = 20;
        System.out.println("-------");
        System.out.printf("%d + %d", a,b);
        //it will not do sum because this %d considered as a string when its inside ""
    }
}
