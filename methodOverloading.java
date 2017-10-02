public class methodOverloading {
    public static void main(String[] args) {
        //
        // Create a method called calcFeetAndInchesToCentimeter
        // It needs to have two parameters.
        // feet is the first parameter, inches is the second parameter
        //
        // You should validate that the first parameter feet is >=0
        // You should validate the second parameter inches is >=0 and <=12
        // return -1 is either of the above is not true
        //
        // Create a second method of the same name but with only one parameter
        // inches is the parameter
        // validate that its =>0
        // return -1 if that is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        //
        double centimeters = calcFeetAndInchesToCentimeter(1);
        if (centimeters != -1) {
            System.out.println("In centimeters: " + centimeters + " cm");
        } else {
            System.out.println("Please check your input!");
        }
    }
    public static double calcFeetAndInchesToCentimeter(int feet, double inches){
        System.out.println("The input is " + feet + "' " + inches + "''");
        if ( feet <0 || inches <0 || inches > 12) {
            return -1;
        } else {
            //convert to Centimeters
            return (feet*12*2.54 + inches*2.54);
        }
    }
    public static double calcFeetAndInchesToCentimeter(double inches){
        if (inches <0) {
            return -1;
        } else {
            return calcFeetAndInchesToCentimeter((int) inches/12, inches%12);
        }
    }
}
