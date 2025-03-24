import java.util.ArrayList;
public class add_list1{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);
        // System.out.println(list);

        // //get opertaion
        // int ele =  list.get(2);
        // System.out.println( "elemet is " + ele);

        // //Delete operation
        // list.remove(2);
        // System.out.println(list);

        // //set operation
        // list.set(2, 100);
        // System.out.println(list);

        // //contains operation
        // System.out.println(list.contains(100));

        // //size operation
        // System.out.println(list.size());
        

        // print the list
        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i) + " ");
        // }
        // System.out.println();

        // //reverse the list
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.println(list.get(i) + " ");
        // }
        // System.out.println();

        //find Max element
         int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }   
            //OR

            // max = Math.max(max, list.get(i));

       
        }    
        System.out.println("Max element = " + max);

    }
}
