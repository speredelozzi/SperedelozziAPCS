import java.util.Scanner;

class forLoops {

    public static void main(String args[]) {

        // for(int i = 0; i <= 100; i += 2) {
        // System.out.println(i);
        // } //prediction:0,2,4,6...98,100

        // for(int i = 0; i <= 100; i += 3) {
        //     if(i % 2 == 0) {
        //         System.out.println(i + " is an even number");
        //     }
        //     else {
        //         System.out.println(i + " is an odd number");            
        //     }//prediction: "0 even," "3 odd," "6 even,"... "97 odd," "100 even"
        // }

        // for(int i = 0; i < 1000; i += i) {
        //     System.out.println(i);
        // }//prediction: 000000

        // for(int i = 100; i > 0; i--) {
        // System.out.println(i);
        // }//prediction: 100,99,98...1

        // for(int i = 0; i > -100; i--) {
        // System.out.println(i);
        // }

        // for(int i = 1; i < 20; i *= 2) {
        // System.out.println(i);
        // }

        // for(int i = 0; i < 100; i += 3) {
        //     System.out.println(i);
        // }

        // for(int i = 1; i <= 10; i++) {
        //     double n = Math.pow((2),(i));
        //     System.out.println(n);
        // }

        Scanner scan;
        for(int i = 1; i < 4; i++) {
            scan = new Scanner(System.in);
            System.out.println("Enter a valid int: ");
            if(scan.hasNextInt()) {
                i = scan.nextInt();
                System.out.println("Success");
            }
            else if(i == 3) {
                System.out.println("You fail");
            }
        }
    }
}