/* Made by Maicon Felipe Reolon
 * Source: https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types and Digital Innovation One(https://web.dio.me)
 */

public class primitiveTypes {
    public static void main (String [] args) {
                
        //byte, short, int and long are primitive types that can accept only entire numbers, each one having different sizes in memory.
        byte number = 4;           //From -128 to 127 (8 bits).
        short number2 = 30000;     //From -2^15(-32,768) to 2^15-1 (32,767) (16 bits).
        int number3 = 2140789;     //From -2^31 (2,147,483,648) to 2^31-1 (2,147,483,647) (32 bits).
        long number4 = 954679845l;  //From -2^63 (9,223,372,036,854,775,808) to 2^63-1 (9,223,372,036,854,775,807) (64 bits).

        //float and double refer to numbers with decimal places.
        float number5 = 783465873f; //From 2-149^(1.4 E-45) to (2-2^-23).2^127 (3.402,823,5 E+38) (32 bits).
        double number6;            //From 2^-1074 (4.9 E-324) to (2-2^-52).2^1023 (1.797,693,134,862,315,7 E+308) (64 bits).

        char sex = 'M';            //char is a primitive type that accept only one character (16 bits).
        boolean a = true;          //boolean it's a primitive type that receive only true or false arguments.

        number6 = number+number2+number3+number4+number5;
        System.out.print(number6+"\n");

        final short SHORTNUMBER = 1; //final is used to a value that can't be changed, a constant value.
        int normalNumber = SHORTNUMBER; //A value in short(8 bits) can be converted to int(16 bits), but the reverse isn't possible.
        short shortNumber2 = (short) normalNumber; 
        if(shortNumber2!=1){
            System.out.print(shortNumber2+"\n");
        }
        else {
            System.out.print("Something it's wrong");
        }
    }
}