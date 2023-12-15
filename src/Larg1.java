import java.util.Scanner;

//to find largest no between 3 no. by using ternary operator & method
public class Larg1 {
public static int largestNum(int a,int b,int c)
    {
        return c>(a>b ? a:b) ? c:(a>b?a:b);
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no.");
        a=sc.nextInt();
        System.out.println("enter second no.");
        b=sc.nextInt();
        System.out.println("enter third no.");
        c=sc.nextInt();
        int result=largestNum(a,b,c);
        System.out.println("largest no. is ="+" "+result);
    }
}
