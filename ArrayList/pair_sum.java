import java.util.*;
public class pair_sum {
    public static void pairSum(ArrayList<Integer> list, int sum){
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            if(list.get(i) + list.get(j) == sum){
                System.out.println("Pair found " + list.get(i) + " " + list.get(j));
                break;
            }else if(list.get(i) + list.get(j) < sum){
                i++;
            }else{
                j--;
            }
        }
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(50);
        list.add(60);
        list.add(70);
        int sum = 82;
    //     int i = 0;
    //     int j = list.size()-1;
    //     while(i < j){
    //         if(list.get(i) + list.get(j) == sum){
    //             System.out.println("Pair found " + list.get(i) + " " + list.get(j));
    //             break;
    //         }else if(list.get(i) + list.get(j) < sum){
    //             i++;
    //         }else{
    //             j--;
    //         }
    //     }
        pairSum(list, sum);
    }
    
}
