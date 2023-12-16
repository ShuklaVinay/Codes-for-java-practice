import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int n,sum=0,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no to check no. is palindrome or not");
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if (c==sum)
        {
            System.out.println("entered no. Palindrome no."+" "+c);
        }
        else
        {
            System.out.println("entered no. not a palindrome no."+" "+c);
        }
    }
}
