//perfect no program as per your entire limit like 500, 5000, 10000 etc.

import java.util.Scanner;

public class PerfectN1 {

    public static int perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum +=i;
            }
        }
        if(n==sum)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the limit for perfect no. ");
        n=sc.nextInt();
        System.out.println("perfect number is in given limit:");
        for(int i=1;i<=n;i++)
        {
            if(perfect(i)==1)
            {
                System.out.print(i+" ");
            }
        }
    }
}
