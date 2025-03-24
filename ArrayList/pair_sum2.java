import java.util.*;
public class pair_sum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int sum){

        int pivot = -1; //breaking point
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1;  //smallest element
        int rp = pivot; //largest element
        while(lp != rp){

            //case 1
            if(list.get(lp) + list.get(rp) == sum){
                System.out.println("Pair found " + list.get(lp) + " " + list.get(rp));
                return true;
                //case 2
            }else if(list.get(lp) + list.get(rp) < sum){
                lp = (lp+1) % list.size();
                //case 3
            }else{
                rp = (rp-1+list.size()) % list.size();
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //Sorted and rotated array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int sum = 16;
        System.out.println(pairSum2(list, sum));
        
    }
    
}
