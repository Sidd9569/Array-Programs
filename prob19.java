//Q3. Find the minimum value out of all elements in the array.
import java.util.*;
public class prob19{
    public static void main(String [] args){
        int [] arr ={10,20,33,50,35};
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < n; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}