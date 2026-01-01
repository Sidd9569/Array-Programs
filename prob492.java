// Q14 : Given an m x n integer matrix matrix, if an element is
// 0, set its entire row and column to 0's. (method 2 using 2 extra boolean to make the rest as 0 if it becomes true).
public class prob492 {
    public static void main(String[] args) {

        int [][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        int m = arr.length;
        int n = arr[0].length;

        boolean [] row = new boolean[m];
        boolean [] col = new boolean[n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0 ; i < m ; i++){
            if(row[i] == true ){
                for(int j = 0 ; j < n ; j++){
                    arr[i][j] = 0 ;
                }
            }
        }

        for(int j = 0 ; j < n ; j++){
            if(col[j] == true){
                for(int i = 0; i < m ; i++){
                    arr[i][j] = 0;
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
