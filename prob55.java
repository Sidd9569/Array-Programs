// Q6. Write a function which accepts a 2D array of integers and its size as arguments and displays the
// elements of middle row and the elements of middle column.
// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
// 1 2 3 4 5
// 3 4 5 6 7
// 7 6 5 4 3
// 8 7 6 5 4
// 1 2 37 8 0
public class prob55 {
    public static void main(String[] args) {
        
        int [][] arr ={{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,37,8,0}};

        int m = arr.length;
        int n = arr[0].length;



        int mid  =  n/2;

        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n; j++){

                if(i == mid){
                    System.out.print(arr[i][j] + " ");
                }

                else if(j == mid){
                    System.out.print("         " + arr[i][j]);
                    break;
                }
            }
            System.out.println();
        }




    }
}
