//Linear search in 2D array value entered by user

import java.util.Scanner;

public class SearchValueInTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of 2D array");
        int ro=sc.nextInt();
        int col=sc.nextInt();
        int[][] num=new int[ro][col];
        System.out.println("enter the value in 2D array");
        for(int i=0;i<ro;i++)
        {
            for(int j=0;j<col;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("inter the value  fo x for search in 2D array:");
        int x=sc.nextInt();
        for(int i=0;i<ro;i++)
        {
            for(int j=0;j<col;j++)
            {
                if (num[i][j]==x)
                {
                    System.out.println("x found at the location :"+" "+i+" "+j);
                }
            }
        }
    }
}
