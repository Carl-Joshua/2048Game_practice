package game_in_table;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI {
    JFrame frame = new JFrame("2048");
    JPanel panel = new JPanel(new GridLayout(4,4));
    private static JLabel[] labels = new JLabel[16];
    private int[][] grid = newGrid();
    KeyListener keyLogger = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP -> {
                    // change to smth like Game.pressed_up()
                    int[][] temp = grid.clone();
                    pressed_up();
                    if(!isEqual(grid, temp)){
                        insertRandom2();
                        updateLabels();
                    }
                }
                case KeyEvent.VK_DOWN -> {
                    int[][] temp = grid.clone();
                    pressed_down();
                    if(!isEqual(grid, temp)){
                        insertRandom2();
                        updateLabels();
                    }
                }
                case KeyEvent.VK_RIGHT -> {
//                    System.out.println("this is grid");
//                    printArray(grid);
                    int[][] temp = new int[4][4];
                    copyArray2D(grid, temp);
//                    System.out.println("this is temp" + temp);
//                    printArray(temp);
                    pressed_right();
//                    reverse(temp);
//                    System.out.println("temp" + temp);
//                    printArray(temp);
                    if(!isEqual(grid, temp)){
                        insertRandom2();
                        updateLabels();
                    }
//                    System.out.println("temp after");
//                    printArray(temp);
//                    System.out.println("after");
//                    printArray(grid);
                }
                case KeyEvent.VK_LEFT -> {
                    int[][] temp = grid.clone();
                    pressed_left();
                    if(!isEqual(grid, temp)){
                        insertRandom2();
                        updateLabels();
                    }
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    public GUI(){
        panel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        initGrid();
        initPanel();
        updateLabels();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(keyLogger);
        printArray(grid);
    }
    public static int[][] newGrid(){
        return new int[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
    }
    private void initGrid(){
        // inserts random 2 into grid
        int r_row1, r_row2, r_col1, r_col2;
        do{
            r_row1 = (int)(Math.random() * 4);
            r_col1 = (int)(Math.random() * 4);
            r_row2 = (int)(Math.random() * 4);
            r_col2 = (int)(Math.random() * 4);
        }while(r_row1 == r_row2 && r_col1 == r_col2);
        grid[r_row1][r_col1] = 2;
        grid[r_row2][r_col2] = 2;
    }
    private void initPanel(){
        for(int i=0; i<16; i++){
            labels[i] = new JLabel();
        }
        int count = 0;
        for(JLabel i : labels){
            panel.add(i);
        }
    }
    private void updateLabels(){
        int count = 0;
        for(int[] i : grid){
            for(int j : i){
                labels[count].setText(Integer.toString(j));
                count++;
            }
        }
    }
    private void slide(){
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
    private void combine(){
        for(int i=0; i < 4; i++){
            for(int j=0; j < 3; j++){
                if(grid[i][j] == grid[i][j+1]){
                    grid[i][j] *= 2;
                    grid[i][j+1] = 0;
                }
            }
        }
    }
    private void pressed_left(){
        slide();
        combine();
        slide();
    }
    private void pressed_right(){
        reverse();
        slide();
        combine();
        slide();
        reverse();
    }
    private void pressed_up(){
        rotate();
        slide();
        combine();
        slide();
        rotate();
        rotate();
        rotate();
    }
    private void pressed_down(){
        rotate();
        reverse();
        slide();
        combine();
        slide();
        reverse();
        rotate();
        rotate();
        rotate();
    }
    private void insertRandom2(){
        int a = 1, b = 1;
        do{
            a = (int)(Math.random() * 4);
            b = (int)(Math.random() * 4);
        }while(grid[a][b] != 0);
        grid[a][b] = 2;
    }
    static void rvs(int[] a, int n) {
        int i, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
    void reverse(){
        for(int i=0; i<4; i++){
            rvs(grid[i], 4);
        }
    }
    static void reverse(int[][] temp){
        for(int i=0; i<4; i++){
            rvs(temp[i], 4);
        }
    }
    void rotate(){
        int[][] temp = new int[4][4];
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                temp[i][j] = grid[j][i];
            }
        }
        grid = temp;
    }
    static void copyArray2D(int[][] from, int[][] to){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                to[i][j] = from[i][j];
            }
        }
    }
    static boolean isEqual(int[][] a, int[][] b){ // returns true if same
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                if(a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static void printArray(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    boolean END(){
        for(int[] i : grid){
            for(int j : i){
                if(j == 0){
                    return false;
                }
            }
        }
        return true;
    }
}

