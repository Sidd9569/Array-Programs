import java.util.*;

public class prob1{
    public static void main(String []args){
        /*Q1 : Given an array of marks of students, if the mark of any
        student is less than 35 print its roll number. [roll number
        here refers to the index of the array.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the marks of students");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Students with marks less than 35 are:");
        for(int i = 0; i < n; i++){
            if(arr[i] < 35){
                System.out.println("Roll number: " + i + ",");
            }
        }

        sc.close();


        


    }
}