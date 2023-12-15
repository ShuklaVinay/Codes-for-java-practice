import java.util.Scanner;

//Half pyramid
public class Pattern3 {
    public static void main(String[] args) {
        int n;
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("please inter no. of rows");
        n=sc.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
