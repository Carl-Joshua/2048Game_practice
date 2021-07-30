//package game_in_table;
//
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//public class Start {
//    private int[][] grid = newGrid();
//
//    Start(){
//        initGrid();
//        display(grid);
//    }
//
//    public static int[][] newGrid(){
//        return new int[][] {
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0}
//        };
//    }
//    public int[][] initGrid(){
//        // inserts random 2 into grid
//        int r_row1, r_row2, r_col1, r_col2;
//        do{
//            r_row1 = (int)(Math.random() * 4);
//            r_col1 = (int)(Math.random() * 4);
//            r_row2 = (int)(Math.random() * 4);
//            r_col2 = (int)(Math.random() * 4);
//        }while(r_row1 == r_row2 && r_col1 == r_col2);
//        grid[r_row1][r_col1] = 2;
//        grid[r_row2][r_col2] = 2;
//        return grid;
//    }
//    public static void display(int[][] in){
//        for(int[] elem : in){
//            for(int e : elem){
//                System.out.print(e + " ");
//            }
//            System.out.println();
//        }
//    }
//    public class KeyInput extends KeyAdapter {
//        Game game;
//        public KeyInput(Game game){
//            this.game = game;
//        }
//        public void keyPressed(KeyEvent e){
//            game.keyPressed(e);
//        }
////        public void keyReleased(KeyEvent e) {
////            game.keyReleased(e);
////        }
//    }
//    public static void clearScreen() {
//        System. out. print("\033[H\033[2J");
//        System. out. flush();
//    }
//}
