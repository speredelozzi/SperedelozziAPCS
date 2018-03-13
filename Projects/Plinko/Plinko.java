import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};
    public static int[] finalamt = {0,0,0,0,0,0,0,0};

    public static int mode = -1;
    public static int discNum = -1;
    public static int discNum1 = -1;
    public static int discSlot = -1;
    public static int discSlotReal = -1;
    public static int row = -1;
    public static int position = -1;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    int position = discNumRequest(discSlotReal);
                    singleDisc();
                }
                else if(mode == MULTI_DISC) {
                    int position = discNumRequest(discSlotReal);
                    int discNum = multiDiscRequest(discNum1);
                    multiDisc();
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }
        }
    }
    public static int discNumRequest(int discSlotReal) {
        Scanner scan;
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Pick a slot to drop the disc(s) (0-8): ");
            if(scan.hasNextInt()) {
                discSlot = scan.nextInt();
                if( 0 <= discSlot && discSlot < 9 ) {
                    discSlotReal = discSlot * 2;
                    return discSlotReal;
                }
            }
        }
    }

    public static void singleDisc() {
        for(row = 12; row >= 0; row--) {
            if(position == 16) {
                position --;
            }
            else if(position == 0) {
                position ++;
            }
            else if(Math.random() > .5) {
                position ++;
            }
            else {
                position --;
            }
            if(isEven(row)) {
                printEvenRow();
            }
            else {
                printOddRow();
            }
        }
    System.out.println("You landed in position " + position/2 + " and earned " + VALUES[position/2] + " points!" );
    }

    public static int multiDiscRequest(int discNum1) {
        Scanner scan;
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Pick an amount of discs: ");
            if(scan.hasNextInt()) {
                discNum1 = scan.nextInt();
                if( 0 < discNum1) {
                    return discNum1;
                }
            }
        }
    }

    public static void multiDisc() {
        for(int n = 0; n <= discNum; n++) {
            for(row = 12; row >= 0; row--) {
                if(position == 16) {
                    position --;
                }
                else if(position == 0) {
                    position ++;
                }
                else if(Math.random() > .5) {
                    position ++;
                }
                else {
                    position --;
                }
            }
        }

        finalamt[position/2]++;
        VALUES[position/2]++;

        System.out.println("You landed in position 0: " + finalamt[0] + " times" );
        System.out.println("You landed in position 1: " + finalamt[1] + " times" );
        System.out.println("You landed in position 2: " + finalamt[2] + " times" );
        System.out.println("You landed in position 3: " + finalamt[3] + " times" );
        System.out.println("You landed in position 4: " + finalamt[4] + " times" );
        System.out.println("You landed in position 5: " + finalamt[5] + " times" );
        System.out.println("You landed in position 6: " + finalamt[6] + " times" );
        System.out.println("You landed in position 7: " + finalamt[7] + " times" );
        System.out.println("You landed in position 8: " + finalamt[8] + " times" );
        System.out.println("Total score: " + VALUES);
    }

    public static void printOddRow() {
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if (!isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        //Print the visualization of the row if it's single disc mode.
    System.out.print("\n");
    }

    public static void printEvenRow() {
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
    System.out.print("\n");
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}