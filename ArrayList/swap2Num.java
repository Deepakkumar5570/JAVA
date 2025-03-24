import java.util.ArrayList;
import java.util.Collections;

public class swap2Num {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        //swap 2 numbers
        int idx1 = 1;
        int idx2 = 3;
        System.out.println("before swapping");
        System.out.println(list);
        System.out.println("after swapping");
        swap(list, idx1, idx2);
        System.out.println(list);

        System.out.println("after sorting or Ascending order");
        

        //Sorting
        Collections.sort(list);
        System.out.println(list);

        System.out.println("after reverse  or Desending order");

        //Reverse
        Collections.reverse(list);  
        System.out.println(list);
    }
    
}
