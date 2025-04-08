package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {

     //  int result = result();  - void function will not return anything, so can't assign
        int result = integer(); // assigning value
        System.out.println(result); // giving output

        boolean r1 = boolean_Datatype();
        System.out.println(r1);

        char r2 = ch();
        System.out.println(r2);

        float r3 = return_PI_Value();
        System.out.println(r3);

        String r4 = retrun_String();
        System.out.println(r4);




    }

//static returnDataType (void, any other data type)

    static  void result() {
        System.out.println("Vinitha");
    }

    static int integer(){
        return 10;
    }
    static boolean boolean_Datatype() {
        return true;
    }
    static char ch() {
        return 'A';
    }
    static float return_PI_Value() {
        return 3.14f;
    }
    static long long_value() {
        return 15l;
    }
    static String retrun_String() {
        return "Hello";
    }
    static byte return_byte() {
        return 100;
    }


}

