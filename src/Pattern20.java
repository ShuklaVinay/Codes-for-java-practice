//inverted no. pyramid pattern program
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern20 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of n for print pattern");
        int n=Integer.parseInt(br.readLine());
        for (int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
