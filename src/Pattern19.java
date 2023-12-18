//Diamond pattern program
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern19 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter value of n for print pattern");
        int n=Integer.parseInt(br.readLine());
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=n;i>=1;i--)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
