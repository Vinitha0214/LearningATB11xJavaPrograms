package ex_13_Functions;

public class Lab129_Method_Functions {
    public static void main(String[] args) {
        // user defined functions
        // Step 1 -> Defining the function
        // Step 2 -> calling the function - is very important,
        // if I don't call the function, it will not execute.

    f1(); // step 2 - calling
    f1();
    f1();
    name_of_the_function();

        }
    static void f1() { // step 1 - defining
        System.out.println("Hi");

    }
    static void name_of_the_function() {
        System.out.println("This is the code it will print");
    }
}
