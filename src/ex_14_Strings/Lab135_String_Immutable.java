package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        //Strings are immutable in nature, because for better memory management
        String name = "vinitha";
        name.toUpperCase();//this function makes Capital letters -VINITHA
        System.out.println(name);// this will print small vinitha
        // because name points to small vinitha in the SCP - string constant pool
        // in case if you change to name = name.touppercase, then the result will be in CAPS
    }
}
