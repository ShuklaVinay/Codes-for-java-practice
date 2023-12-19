//to check entered no is perfect or not
import java.util.Scanner;
public class PerfectN {
    public static void main(String[] args) {

        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.to check no. is perfect no. or not:");
        n=sc.nextInt();
        for (int i=1;i<n;i++)
        {
            if (n%i==0)
            {
                sum=sum+i;
            }
            //System.out.println(sum);
        }
        if(n==sum)
        {
            System.out.println("entered no. is perfect no."+" " + sum);
        }
        else {
            System.out.println("entered no. is not a perfect no."+ " "+ sum);
        }
    }
}