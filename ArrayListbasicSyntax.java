import java.util.*;
public class ArrayListbasicSyntax{
    public static void main(String[] args){

        //declaration  and allocation of memory 

        ArrayList<Integer> arr = new ArrayList<Integer>();//empty Arraylist
        System.out.println(arr);// output as a string

        // to add up element in an arraylist
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr);

        //to get output of list as arraylist

        for (int i = 0 ; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}