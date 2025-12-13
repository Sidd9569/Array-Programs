//Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
import java.util.*;
public class prob25{
    public static void main(String [] args){
        int [] arr ={10,20,30,40,90,60};
        int n = arr.length;

        int even = 0;
        int odd = 0 ;

        for(int i = 0 ; i < n ; i++ ){
            if (i % 2 == 0){
                even = arr[i] + even ;
            }
            else{
                odd = arr[i] + odd ; 
            }
        }

        int difference = even - odd ;
        System.out.println(difference);
    }
}