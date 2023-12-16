import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. for reverse");
        n=sc.nextInt();
        System.out.print("reverse of entered no is:"+" ");
        while(n>0)
        {
            r=n%10;
           System.out.print(r);
            c=r;
            n=n/10;
        }

    }
}
