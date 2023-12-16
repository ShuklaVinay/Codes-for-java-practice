import java.util.Scanner;

/*
 *
 ***
 *****
 *******

 */
public class Pattern10 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the value of n.");
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<i*2;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
