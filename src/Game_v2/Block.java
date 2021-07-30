package Game_v2;

import javax.swing.*;

public class Block {
    private int x_value, y_value;
    private int gridX, gridY;
    private int value;

    JFrame frame = new JFrame();
    JLabel label = new JLabel("0");

    public Block(int x, int y){
        this.x_value = x;
        this.y_value = y;
    }

    public void setX_value(int x_value) {
        this.x_value = x_value;
    }

    public void setY_value(int y_value) {
        this.y_value = y_value;
    }

    public void setGridX(int gridX) {
        this.gridX = gridX;
    }

    public void setGridY(int gridY) {
        this.gridY = gridY;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // method for showing GUI
    public void show(){
        frame.add(label);
        frame.setVisible(true);
    }
}
