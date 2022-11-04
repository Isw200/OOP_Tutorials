package Q1;

import java.util.*;
class Board {
    int ar[][];
    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
        // fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i=0; i < n; i++)
            for (int j=0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }
    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r)  // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public int findMaxInRow(int row){
        int max = 0;
        for (int i = 0; i < ar[row-1].length; i++){
            if (ar[row-1][i] > max)
                max = ar[row-1][i];
        }
        return max;
    }

    public int findMaxInColumn(int column){
        int max = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i][column-1] > max){
                max = ar[i][column-1];
            }
        }
        return max;
    }

    public int findMaxInDiagonal(){
        int max = 0;
        int x = ar.length;
        int y = 0;
        for (int iter = 0; iter < ar.length; iter++){
            int iter2 = y;
            //upper diagonal
            for (int i = 0; i < x; i++){
                if (ar[i][iter2] > max){
                    max = ar[i][iter2];
                }
                //lower diagonal
                if (y != 0){
                    if (ar[iter2][i] > max){
                        max = ar[iter2][i];
                    }
                }
                iter2++;
            }
            x--;
            y++;
        }
        return max;
    }
}

public class TwoDimensionalTest {
    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();
        System.out.println();
        System.out.println("Max in Row: "+board1.findMaxInRow(2));
        System.out.println("................");
        System.out.println("Max in column: "+board1.findMaxInColumn(1));
        System.out.println("................");
        System.out.println("Max in diagonal: "+board1.findMaxInDiagonal());
    }
}
