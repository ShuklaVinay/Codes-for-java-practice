import java.util.Scanner;

public class ArmstrongN {
    public static void main(String[] args) {
        int n,r,c,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no to check armstrong no or not :");
        n=sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;

        }
        if(c==sum)
        {
            System.out.println("entered no. is Armstrong no."+" "+c);
        }
        else {
            System.out.println("entered no. is not a Armstrong no."+" "+c);
        }
    }
}
