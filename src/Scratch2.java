import game_in_table.GUI;

import java.util.Arrays;

public class Scratch2 {
    public static void main(String[] args) {
        /*
        things in question:
        how to copy 2D array? arr.clone() reliable ka ?
        how come it worked with manual copy?
         */
        int[][] grid = GUI.newGrid();
        grid[0][0] = 2;
//        int[][] temp = new int[4][4];
//        System.arraycopy(grid, 0, temp,0, 4);
        // or
//        int[][] temp = new int[4][4];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                temp[i][j] = grid[i][j];
//            }
//        }
        // or
//        int[][] temp = grid.clone();
        int[][] temp = new int[4][4];
        System.arraycopy(grid, 0, temp,0, 4); // I GET IT>>>> it copies the ref of the 1D arrays you dumbo
        System.out.println("grid: " + grid[0]);
        System.out.println("temp: " + temp[0]);
        printArray(temp);
        reverse2D(grid);
        System.out.println("grid: " + grid);
        grid[0][0] = 2;
        printArray(grid);
        System.out.println("temp: " + temp);
        printArray(temp);
    }
    static void reverse(int[] a, int n) {
        int i, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
    static void reverse2D(int[][] arr){
        for(int i=0; i<4; i++){
            reverse(arr[i], 4);
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
