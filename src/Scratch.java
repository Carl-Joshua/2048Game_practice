import java.util.Arrays;

public class Scratch {
    public static int[][] grid = {
            {2, 2, 0, 4},
            {2, 2, 0, 4},
            {2, 2, 0, 4},
            {2, 2, 0, 4}
    };
    public static void main(String[] args) {

        slide();
        printArray(grid);
        combine();
        slide();

        for(int[] i : grid){
            for(int j : i)
                System.out.print(j);
            System.out.println();
        }
    }
    public static void slide(){
        int[][] temp = new int[4][4];

        int count = 0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                if(grid[i][j] != 0){
                    temp[i][count] = grid[i][j];
                    count++;
                }
            }
            count = 0;
        }
        grid = temp;
    }
    public static void combine(){
        for(int i=0; i < 4; i++){
            for(int j=0; j < 3; j++){
                if(grid[i][j] == grid[i][j+1]){
                    grid[i][j] *= 2;
                    grid[i][j+1] = 0;
                }
            }
        }
    }
    static void rvs(int a[], int n) {
        int i, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
    static void reverse(){
        for(int i=0; i<4; i++){
            rvs(grid[i], 4);
        }
    }
    static void printArray(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
