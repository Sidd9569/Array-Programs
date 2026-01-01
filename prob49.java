// Q14 : Given an m x n integer matrix matrix, if an element is
// 0, set its entire row and column to 0's. (method 1 using an extra array).

public class prob49 {
    public static void main(String [] args){

        int [][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        int m = arr.length;
        int n = arr[0].length;

        int [][] helper = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                helper[i][j] = arr[i][j];
            }
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(helper[i][j] == 0){
                    // for columns
                    for(int b = 0 ; b < n; b++){
                        arr[i][b] = 0;
                    }

                    // for rows
                    for(int a = 0 ; a < n ; a++){
                        arr[a][j]= 0;
                    }
                }
            }
        }

        for( int [] ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
