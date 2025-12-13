//Q4. WAP to find the duplicate elements from the given array of elements.
import java.util.*;
public class prob20{
    public static void main(String [] args){
        int [] arr = {10,20,20,30,30};
        int n = arr.length;

        for (int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}