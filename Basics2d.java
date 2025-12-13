import java.util.*;
// Basics of 2d array
 public class Basics2d{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // Simple declaration or initialisation 
        int [][] arr = new int[3][4];
        int[][] brr = {{1,2} , {3,4} , {5,6} , {7,8}};
        int [][] crr = new int[3][4];

        // to find length of rows & columns 

        int m = arr.length ; // for rows
        int n = arr[0].length ; // for columns

        System.out.println(m);
        System.out.println(n);

        // input value 

        for(int i = 0 ; i < 3 ; i++ ){
            for(int j = 0 ; j < 4 ; j++){
                crr[i][j] = sc.nextInt();
            }
        }

        // insert values
        arr[0][1]=20;
        arr[2][2] = 40;

        // printing technique

        System.out.println(arr[2][2]);

        // traversal printing of 2d array

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4; j++){
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }

        // Output through for each loop

        for (int [] arr1 : crr){ // these is main part of array
            for(int arr2 : arr1){
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           



       



    }
 }