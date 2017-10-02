public class switchCase {
    public static void main(String[] args){
        //
        // CHALLENGE
        // Create a switch statement using char
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char charVar = 'F'; 

        switch (charVar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The character is: " + charVar);
                break;
            default:
                System.out.println("Not found");
        }
        // Java 7 onwards includes the capability of switch on string
        String nameString = "JOE"; // what if the string is in lowercase?
        switch (nameString.toLowerCase()){ // converts entire string to lowercase
            case "joe": // test should be done using lowercase
                System.out.println("Name found: " + nameString);
                break;
            default:
                System.out.println("Not found");
        }
    }
}
