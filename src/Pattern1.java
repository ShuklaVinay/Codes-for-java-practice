import java.util.Scanner;

//solid rectangle program
public class Pattern1 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no. of row:");
        n=sc.nextInt();
        System.out.println("please enter no. of column");
        m=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
