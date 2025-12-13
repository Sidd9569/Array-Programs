//Q5. WAP to find the smallest missing positive element in the sorted Array. (take the array as input)
import java.util.*;
public class prob21{
    public static void main(String [] args){
        int [] arr = {-2,2,-40,70,80};
        int n = arr.length;
        int target = Integer.MAX_VALUE ;
        for(int i = 0 ; i < n ; i++){
            if (arr[i] < target && arr[i] > 0){
                target = arr[i];
            }
        }
        System.out.println(target);
    }
}