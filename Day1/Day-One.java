// Display a message to the command prompt.
class displayMessage {
    public static void main (String args[]) {
        System.out.println("Hello From my first app java program");
    }
}

// Receives an input (as main arguments) and checks for its value and prints it back.
class printInput {
    public static void main(String args[]){
        if (args.length > 0) {
            String argOne = args[0]; // Arg by default is string 
            System.out.println("Your Argument entered is '" + argOne + "'");
        } else {
            System.out.println("Error, Please enter argument.");
        }
    }
}

// Receives two inputs (as main arguments) a number and a string 
// and prints the string on different lines according to the given number.

class printNumberAndString {
    public static void main(String args[]){
        if (args.length == 2) {
            int numberArg = Integer.parseInt(args[0]);
            String stringArg = args[1];

            for (int i = 0; i < numberArg; i++) {
                System.out.println("Your String entered is '" + stringArg + "'");
            }
        } else {
            System.out.println("Error, Please enter two argument.");
        }
    }
}


