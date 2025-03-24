
import java.util.*;
public class container_w_most_water{
    
    public static int storeWater(ArrayList<Integer> height){
        int max = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size()-1;
        while(lp < rp){
            //calculate water area
            int width = rp-lp;
            int h = Math.min(height.get(lp), height.get(rp));
            int area = width * h;
            max = Math.max(max, area);
            //update ptr
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        // System.out.println(list);
        // int max = Integer.MIN_VALUE;
        // int i = 0;
        // int j = list.size()-1;
        // while(i < j){
        //     int width = j-i;
        //     int height = Math.min(list.get(i), list.get(j));
        //     int area = width * height;
        //     max = Math.max(max, area);
        //     if(list.get(i) < list.get(j)){
        //         i++;
        //     }else{
        //         j--;
        //     }
        // }
        System.out.println("Max water " + storeWater(list));
    }
}