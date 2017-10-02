public class evenOddNumber {
    public static void main (String[] args){
        //
        // CHALLENGE
        // Create a method called isEvenNumber that takes
        // a parameter of type int
        // Its purpose is to determine if the argument passed
        // to the method is an even number or not.
        // Return true if an even number, otherwise return false
        //
        // use a while loop to find the even numbers within a range
        // record the total number of even numbers found
        // break once 5 even numbers are found
        // and at the end, display the total number of even numbers found
        //
        int countEvenNumbers = 0;
        int number = 10;
        int endRange = 1000;

        while (number <= endRange){
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number : "+number);
            number++;
            countEvenNumbers ++;
            if (countEvenNumbers >= 5){
                break;
            }
        }

        System.out.println("Total number of even numbers: "+countEvenNumbers);
    }
    public static boolean  isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
