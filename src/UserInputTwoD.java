
//taking input by user in 2D array & show on the screen in tabular form(matrix form)
import java.util.Scanner;
public class UserInputTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size in 2D array in form of rows & columns");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] num = new int[row][column];
        System.out.println("enter value in 2D array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        //for output
        System.out.println("value entered by user in tabular form(matrix form):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}