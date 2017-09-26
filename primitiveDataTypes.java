public class primitiveDataTypes {
    public static void main(String args[]){
        //----------------------------------
        // ---- Primitive Data types ------
        //----------------------------------
        //
        //---------- LITERAL VALUES-------
        // Java is case sensitive
        // byte (2^8) cam store a number between -128 and 127
        // short (2^16) can store a number between -32768 and 32767
        // int (2^32) can store values between -2_147_483_648 and 2_147_483_647
        // long (2^64) can store values between -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807
        int firstInt = 22;
        // type sout to select IntelliJ template for System.out.println
        System.out.println("First Number: "+firstInt);
        //
        //----------CHALLENGE 1-----------------
        System.out.println("--->(CHALLENGE 1)<---");
        // 1. Create a byte variable and set it to any valid byte number
        byte byteVariable = 127;
        // 2. Create a short variable and set it to any valid short number
        short shortVariable = 32767;
        // 3. Create a int variable and set it to any valid int number
        int intVariable = 147483647;
        // 4. Create a variable of type long and set it equal to
        // 50000 + 10 times the sum of the byte, plus the short,
        // plus the int
        long longTotal = 50000L + 10L * (byteVariable + shortVariable + intVariable);
        System.out.println("Long total: "+longTotal);
        //
        //-----------FLOAT AND DOUBLES -------------
        //The Decimal, Double, and Float variable types are different in the
        // way that they store the values. Precision is the main difference
        // where float is a single precision (32 bit) floating point data
        // type, double is a double precision (64 bit) floating point data
        // type and decimal is a 128-bit floating point data type.
        float floatNumber = firstInt / 7f;
        double doubleNumber = firstInt / 7d;
        System.out.println("floatNumber: " + floatNumber);
        System.out.println("doubleNumber: " + doubleNumber);
        //
        //-------CHALLENGE 2---------
        System.out.println("--->(CHALLENGE 2)<---");
        // Convert a given number of pounds to Kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and
        // store in a variable
        // 3.print out the result
        //
        //NOTES: 1 pound =  0.45359237 Kg
        float inPounds = 20.3f;
        float inKgs = inPounds * 0.45359237f;
        System.out.println("In Kgs: "+inKgs);
        //
        //---------CHARACTERS AND BOOLEAN---------
        // char cab store only character (size 2 bytes)
        // unicode value for a symbol can be found in unicode-table.com
        System.out.println("--->(CHARACTERS AND BOOLEAN)<---");
        char unicodeChar = '\u00A9';
        System.out.println("unicodeChar: " + unicodeChar);
        boolean isMale = true;
        System.out.println(isMale);
        String myString = "This is a string";
        System.out.println(myString);
    }
}
