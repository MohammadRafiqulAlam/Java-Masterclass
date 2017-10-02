public class primeNumber {
    public static void main(String[] args){
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using a function
        // if it is a prime number, print it out AND increment a count of
        // the number of prime numbers found
        // if that count is 3 exit the for loop
        // hint: Use the break statement to exit
        int count = 0;
        for (int j = 10; j<=50; j++){
            if (isPrimeNumber(j)){
                count ++;
            }
            if (count == 10){
                System.out.println("Maximum limit of " + count + " numbers reached");
                System.out.println("Exiting for loop");

                break; // this break will terminate the for loop
            }
        }
    }
    public static boolean isPrimeNumber(int number){
        if (number == 1){
            return false;
        }

        for (int i =2; i<=(long) Math.sqrt(number);i++){
            if (number % i == 0 ) {
                return false;
            }
        }
        System.out.println(number + " is a Prime number.");
        return true;
    }
}
