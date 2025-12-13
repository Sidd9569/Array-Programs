//Q2. Find the second largest element in the given Array in one pass.
import java.util.*;
public class prob18{
    public static void main(String [] args){

        int [] arr = {10,20,40,33,35};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int num = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if (arr[i] > max){
                num = max ;
                max = arr[i];
            }
            else if (arr[i] >  num  && arr[i]!= max){
                num = arr[i];
            }
        }
        System.out.println(num);
        
    }
}