import java.util.Scanner;

//Hollow rectangle program
public class Pattern2 {
    public static void main(String[] args) {
     int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the no. of row");
        n=sc.nextInt();
        System.out.println("please enter the no. of column");
        m=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=m;j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();

        }
    }
}
