package ex_14_Strings;

public class Lab144_StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Vini";
        String s1 = new String("Vini");

        StringBuffer stringbuffer = new StringBuffer("Vini");
        StringBuilder stringbuilder = new StringBuilder("Vini");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringbuffer);
        System.out.println(stringbuilder);
    }


}
