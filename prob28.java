// Given an array of integers, change the value of all odd indexed elements to its second multiple and 
//increment all even indexed values by 10

import java.util.*;
public class prob28{
    public static void main(String [] args){
        int [] arr ={10,20,30,40,50,60};
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            if( i % 2 == 0 ){
                arr[i] = arr[i] + 10;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}