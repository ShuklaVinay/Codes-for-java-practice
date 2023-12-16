import java.util.Scanner;

//pyramid pattern program
public class Pattern11 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to print: ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

