import java.util.Scanner;
//half pyramid with number
public class Pattern6 {
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
        System.out.println("please enter no. of row");
         n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(j);
             }
             System.out.println();
         }

    }
}
