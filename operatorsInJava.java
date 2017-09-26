public class operatorsInJava {
    public static void main(String[] args){
        // Arithmetic operators: +, - , *, /
        // remainder operator %
        // increment operator ++
        // decrement operator --
        // +=, -=, *=, /= takes the number stored in the variable
        // in left side of = and uses the operator to recalculate
        // the value of the variable
        // conditional operators: if ( var == value)
        // <=, >=, !=, <, > can be used in if condition
        // &&, || can be used to validate multiple conditions
        // ?: is the shorthand for if-then-else
        // bitwise operators: ~, <<, >>, >>>, &, ^, |
        //
        //--------CHALLENGE------------
        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the
        // remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message
        //  "Total was over the limit" if the remaining total
        // (#4) is equal to 20 or less
        //
        double dVar1 = 20d;// putting d at the end is optional
        double dVar2 = 80d;
        double total1 = (dVar1 + dVar2) * 25;
        double remainder = total1 % 40;
        if (remainder <= 20 )
            System.out.println("Total was over the limit");
    }
}
