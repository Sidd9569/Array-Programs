// Q14 : Given an m x n integer matrix matrix, if an element is
// 0, set its entire row and column to 0's. (method 3 using an extra space using boolean variable).
public class prob493 {
    public static void main(String[] args) {
        
        int [][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        int m = arr.length;
        int n = arr[0].length;

        boolean zeroRow = false;
        boolean zeroCol = false;

        for(int i = 0 ; i < m ; i++){
            if(arr[i][0] == 0){
                zeroCol = true;
                break;
            }
        }

        for(int j = 0 ; j < n ; j++){
            if(arr[0][j] == 0){
                zeroRow = true;
                break;
            }
        }

        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }

        for(int i = 1 ; i < m ; i++){
            if(arr[i][0] == 0){
                for(int j = 1 ; j < n; j++){
                    arr[i][j] = 0 ; 
                }
            }
        }

        for(int j = 1 ; j < n ; j++){
            if(arr[0][j] == 0){
                for(int i= 1 ; i < m; i++){
                    arr[i][j] = 0 ; 
                }
            }
        }

        if(zeroRow == true){
            for(int j = 0 ; j > n ; j++){
                arr[0][j] = 0;
            }
        }

        if(zeroCol == true){
            for(int i = 0 ; i > m ; i++){
                arr[i][0] = 0;
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
