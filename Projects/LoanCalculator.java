import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Enter loan amount: $" + loanAmt);
            if(scan.hasNextDouble()) {
                loanAmt = scan.nextDouble();
                if(0 < loanAmt) {
                    break;
                }
            }
        }
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Enter loan term: " + loanTerm);
            if(scan.hasNextInt()) {
                loanTerm = scan.nextInt();
                if(0 < loanTerm) {
                    break;
                }
            }
        }
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Enter interest rate (%): " + interestRate);
            if(scan.hasNextDouble()) {
                interestRate = scan.nextDouble();
                if(0 < interestRate && interestRate < 100) {
                    break;
                }
            }
        }
        if(mode == 1) {
            flatInterest();
        }
        else if(mode == 2) {
            compoundingNoInterest();
        }
        else if(mode == 3) {
            compoundingInterest();
        }

    }
    public static void flatInterest() {
        double realInterest = interestRate / 100;
        double interest = loanAmt * loanTerm * realInterest;
        double totalPayment = interest + loanAmt;
        System.out.println(" ");
        System.out.println("Original loan amount: $" + loanAmt);
        System.out.println("Loan term: " + loanTerm + " years");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest to be paid: $" + interest);
        System.out.println("Total loan payment: $" + totalPayment);
    }

        //Calculate flat interest and print it out here
    public static void compoundingNoInterest() {

    }
    public static void compoundingInterest() {

    }
    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}