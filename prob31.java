//if an array arr contains n elements, then check if the given array is a palindrome or not .
public class prob31{
    public static void main(String [] args){

        int [] arr ={10,20,30,20,20};
        int n = arr.length;

        int i = 0 ; 
        int j = n-1;
        boolean palindrome = true;
        
        while(i<=j){
            if(arr[i] == arr[j]){
                palindrome = true;
                i++;
                j--;
            }
            else{
                palindrome = false;
                break;
            }
        }
        if (palindrome == true ){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
} 

