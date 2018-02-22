import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;
    public static double loanTotal = -1;
    public static double interest = 0;
    public static double monthsRemaining = -1;

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
        }    //If it reaches here, the input was invalid. Loop again.
        System.out.println("You selected mode " + mode);

        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Enter loan amount: $");
            if(scan.hasNextDouble()) {
                loanAmt = scan.nextDouble();
                if(0 < loanAmt) {
                    break;
                }
            }
        }
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Enter loan term: ");
            if(scan.hasNextInt()) {
                loanTerm = scan.nextInt();
                if(0 < loanTerm) {
                    break;
                }
            }
        }
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Enter interest rate (%): ");
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
        double loanTotal = interest + loanAmt;
        System.out.println(" ");
        System.out.println("Original loan amount: $" + loanAmt);
        System.out.println("Loan term: " + loanTerm + " years");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest to be paid: $" + interest);
        System.out.println("Total loan payment: $" + loanTotal);
    }
    public static void compoundingNoInterest() {
        double monthsRemaining = loanTerm * 12;
        double realInterest = interestRate / 100;
        loanTotal = loanAmt;
        while(monthsRemaining > 0) {
            interest = loanTotal * (realInterest / 12);
            loanTotal = loanTotal + interest;
            monthsRemaining--;
        }
        double totalInterest = loanTotal - loanAmt;
        System.out.println(" ");
        System.out.println("Original loan amount: $" + loanAmt);
        System.out.println("Loan term: " + loanTerm + " years");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest to be paid: $" + totalInterest);
        System.out.println("Total loan payment: $" + loanTotal);
    }
    public static void compoundingInterest() {
        double realInterest = interestRate / 100;
        double ratePerMonth = realInterest / 12;
        loanTotal = loanAmt;
        double monthlyPayment = 1 + loanAmt * (ratePerMonth / (1 - Math.pow((1 + ratePerMonth), (loanTerm * -12))));
        double outstandingBalance = loanAmt;
        while(outstandingBalance > 0) {
            interest = outstandingBalance * ratePerMonth;
            outstandingBalance = interest + outstandingBalance - monthlyPayment;
            loanTotal = loanTotal + interest;
        }
        double totalInterest = loanTotal - loanAmt;
        
        double finalMonthPayment = loanTotal - (monthlyPayment * 12 * loanTerm);
        System.out.println(" ");
        System.out.println("Original loan amount: $" + loanAmt);
        System.out.println("Loan term: " + loanTerm + " years");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum monthly payment: $" + monthlyPayment);
        System.out.println("Payment for the final month: $" + finalMonthPayment);
        System.out.println("Interest to be paid: $" + totalInterest);
        System.out.println("Total loan payment: $" + loanTotal);
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