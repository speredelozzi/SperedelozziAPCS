import java.util.Scanner;

// class ValidationUtils {
//     public static void main(String args[]) {
//         System.out.print("Enter a string: ");
//         Scanner scan = new Scanner(System.in);
//         if(isValidString(scan)) {
//             System.out.println("String Success!");
//         }
//         else {
//             System.out.println("String Failure!");
//         }
//     }

    
//     public static Boolean isValidString(Scanner scan) {
//         try {
//             String s = scan.nextLine();
//         }
//         catch(Exception e) {
//             return false; //An error was raised. The user input could not be read as a String.
//         }
//         return true; //No error was raised. The scanner read it successfully as a String.
//     }
// }

// class ValidationUtils {
//     public static void main(String args[]) {
//         System.out.print("Enter an int: ");
//         Scanner scan = new Scanner(System.in);
//         if(isValidInt(scan)) {
//             System.out.println("Int Success!");
//         }
//         else {
//             System.out.println("Int Failure!");
//         }
//     }

    
//     public static Boolean isValidInt(Scanner scan) {
//         try {
//             int s = scan.nextInt();
//         }
//         catch(Exception e) {
//             return false; //An error was raised. The user input could not be read as an Int.
//         }
//         return true; //No error was raised. The scanner read it successfully as an Int.
//     }
// }

// class ValidationUtils {
//     public static void main(String args[]) {
//         System.out.print("Enter a double: ");
//         Scanner scan = new Scanner(System.in);
//         if(isValidDouble(scan)) {
//             System.out.println("Double Success!");
//         }
//         else {
//             System.out.println("Double Failure!");
//         }
//     }

    
//     public static Boolean isValidDouble(Scanner scan) {
//         try {
//             double s = scan.nextDouble();
//         }
//         catch(Exception e) {
//             return false; //An error was raised. The user input could not be read as a double.
//         }
//         return true; //No error was raised. The scanner read it successfully as a double.
//     }
// }

class ValidationUtils {
    public static void main(String args[]) {
        System.out.print("enter a boolean: ");
        Scanner scan = new Scanner(System.in);
        if(isValidBoolean(scan)){
            System.out.println("boolean success!");
        }
        else {
            System.out.println("boolean failure!");
        }
    }

    public static Boolean isValidBoolean(Scanner scan) {
        try {
            String s = scan.nextLine().toLowerCase();
            return (
                s.equals("f") ||
                s.equals("t") ||
                s.equals("true") ||
                s.equals("false") ||
                s.equals("0") ||
                s.equals("1")
            );
           
        }
        catch(Exception e) {
            return false; //error. user input is not a valid Boolean
        }
        // return true; //no error. user input is a valid Boolean
        // while(true)
        //     if (s.equals("t") || s.equals("true") || s.equals("1"))

    }
}