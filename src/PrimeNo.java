import java.util.Scanner;
//to check the no is prime or not
public class PrimeNo {
    public static void primeN(int n)
    {
        int c,count=0;
        c=n;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("entered no is prime");
        }
        else {
            System.out.println("entered no is not prime");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for check prime or not");
        n=sc.nextInt();
        primeN(n);
    }
}
