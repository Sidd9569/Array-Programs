import java.util.*;

public class ArrayListbasicSyntax2{
    public static void main(String[] args){
        
        ArrayList<Integer> brr = new ArrayList<Integer>(6);// here we are giving Integer capacity to an arraylist

        //if any index would be missing in an arraylist the exception occur which is index out of bound 

        brr.add(0,5);
        brr.add(1,10);
        brr.add(2,20);
        brr.add(3,30);
        brr.add(4,40);
        brr.add(5,50);

        System.out.println();

        for (int i = 0 ; i < brr.size(); i++){
            System.out.print(brr.get(i) + " ");// 5 10 20 30 40 50
        }
    }
}