import java.util.Scanner;

//inverted half pyramid
public class Pattern4 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter no. of row");
        n=sc.nextInt();
        for (i=n;i>=1;i--)
        {
            for (j=1;j<=i;j++)

            {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
