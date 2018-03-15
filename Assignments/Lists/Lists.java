import java.util.*;

class Lists {

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

        ArrayList<Integer> toDo = new ArrayList<Integer>();

        toDo.add(1);
        toDo.add(2);
        toDo.add(3);
        
        for(int i = 0; i < toDo.size(); i++) {
            System.out.println("To Do List: [" + i + "]" + toDo.get(i));
            // Scanner scan;
            // scan = new Scanner(System.in);
            // if(nextLine()) {

            // }
        }
    }
}