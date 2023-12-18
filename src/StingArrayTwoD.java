//String type input entered by user in 2D array

import java.util.Scanner;

public class StingArrayTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of row & column:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        String[][] names=new String[r][c];
        System.out.println("please enter string value in 2D array");
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                names[i][j]=sc.next();
            }
        }
        System.out.println("String values entered by user show in matrix form:");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }
    }
}
