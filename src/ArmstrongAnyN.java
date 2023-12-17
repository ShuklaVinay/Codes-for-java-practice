import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongAnyN {
    public static void main(String[] args) {
        int n,r;
        double sum=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter any number to check Armstrong or not;");
        n=sc.nextInt();
        c=n;
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(n>0)
        {
            r=n%10;
            al.add(r);
            n=n/10;
        }
        double base=al.size();
        for(int i=0;i<base;i++)
        {
            int val=al.get(i);
            double val1=(double)val;
            double sm=Math.pow(val1,base);
            sum=sum+sm;
        }
        if (c==sum)
        {
            System.out.println("entered no. is Armstrong");
        }
        else
        {
            System.out.println("entered no. is not Armstrong");
        }
    }
}
