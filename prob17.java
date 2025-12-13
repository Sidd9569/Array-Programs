//Q1. Calculate the product of all the elements in the given array.
import java.util.*;

public class prob17{
    public static void main(String [] args){
        int [] arr = {10,20,30};
        int n =arr.length;
        int target = 1;
        for(int i = 0 ; i < n ; i++){
            target = arr[i] * target;
        }
        System.out.println(target);
    }
}