package Ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'K'; // char are from ato z , A to Z and special characters also !@#$%^&&*
        //char are always in single quotes ''
        //char c2 = "Aeref" // this is not a char, it's a string
        char c2 = 'B';
        char c3 = '1';
        char c4 = '9';
        char c5 = '@';
        char c6 = '_';
        char c7 = '(';
        char c8 = ' '; // space is also a character

        // Escape character

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r'; //deletes the first word

        System.out.println("Vinitha"+new_line+"Shanmugavelayutham");
        System.out.println("Vinitha"+tab_line+"Shanmugavelayutham");
        System.out.println("Vinitha"+back_space+"Shanmugavelayutham");
        System.out.println("Vinitha"+carriage_return+"Shanmugavelayutham");
        System.out.println("Vinitha is old\rShanmugavelayutham"); // deletes full word
        System.out.println("this is the first line\nthis is the second line\bthis is the\tthird line this is the\r");

    char c10 = 'A';
    // it takes ASCII value, basically A ASCII value is 65
        // ASCII has limited numbers 0 to 255

        char ruppes = '₹';
        //unicode has all the symbols and characters
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        //unicode has smily also
    }
}
