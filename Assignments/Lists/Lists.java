import java.util.*;

class Lists {

    public static int add = 1;
    public static int remove = 2;
    public static int view = 3;
    public static int mode = 0;
    public static int quit = 4;
    public static String task;

    public static void main(String args[]) {

        // ArrayList<Integer> numList = new ArrayList<Integer>();

        // numList.add(5);
        // numList.add(0,10);
        // numList.add(1,15);
        // numList.remove(1);
        // numList.add(20);
        // numList.add(1,25);
        // numList.add(0,30);
        // numList.add(3,35);
        // numList.remove(2);

        // for(int i = 0; i < numList.size(); i++) {
        //     System.out.println(numList.get(i));
        // }
        // //OG prediction: {5,10,15,20,1,25,0,30,3,35}
        // //Second ediition prediction: 30,10,35,5,20

        
        
        Scanner scan;
        while(true) {
            scan = new Scanner(System.in);
            modeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == add) {
                    addTask();
                }
                else if(mode == remove) {
                    removeTask();
                }
                else if(mode == view) {
                    viewList();
                }
                else if(mode == quit) {
                    break;
                }
                else {
                    break;
                }
            }
        }        
        // for(int i = 0; i < toDo.size(); i++) {
        //     String task;
        //     Scanner scan;
        //     while(true) {
        //         scan = new Scanner(System.in);
        //         System.out.println(i + " : ");
        //         if(scan.hasNextLine()) {
        //             task = scan.nextLine();
        //             System.out.println("To Do List: [" + i + "]" + task);
        //         }    
        //     }
        // }
    }

    public static void modeStatement() {
        System.out.println("\n"
            + "Options:\n"
            + "(1) add a task \n"
            + "(2) remove a task \n"
            + "(3) view the list \n"
            + "(4) quit" );
    }

    public static void addTask() {
        Scanner scan;
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("New task: ");
            if(scan.hasNextLine()) {
                task = scan.nextLine();
                break;
            }
        }           
    }

    public static void removeTask() {
        Scanner scan;
        while(true) {
            scan = new Scanner(System.in);
            System.out.print("Remove task: ");
            if(scan.hasNextLine()) {
                task = scan.nextLine();
                break;
            }
        }        
    }

    public static void viewList() {
        ArrayList<Integer> toDo = new ArrayList<Integer>();
        toDo.add(0);
        for(int i = 0; i < toDo.size(); i++) {
            System.out.println("To Do List: [" + i + "] " + toDo.get(i));
        }
    }
}