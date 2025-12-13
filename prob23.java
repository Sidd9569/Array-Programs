//WAP to find the largest three elements in the array.
import java.util.*;
public class prob23{
    public static void main(String [] args){
        int [] arr = {10,20,30,40,50,60};
        int n = arr.length;
        int first = 0;
        int second = 0;
        int third = 0;
        
        for(int i=0 ; i < n ; i++){
            if (arr[i] > first ){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] !=  first){
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third && arr[i]!= second && arr[i] !=  first){
                third = arr[i];
            }

        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}