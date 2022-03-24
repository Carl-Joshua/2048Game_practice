# 2048Game_practice
This is a simple replication of the popular 2048 Game. Game utilizes the Java Swing library to display a table containing the matrix of values.

When GUI.java is executed, an empty board will be generated containing 2 initial value of 2 that is placed randomly. 
![screenshot1Of2048Gameplay](initGame.png)
The player can then input the arrow keys to shift every row or column to the direction inputted. If 2 adjacent equal value of number is shifted, the 2 numbers will be compacted to 1 valuye which contain the sum of the 2. Note that at each key pressed, there will be a new randomly inserted '2' onto the board. The game continues until either player reaches a value 2048 or until the board is all filled with unique values.
