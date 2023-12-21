//swap two value by using 3rd variable
import java.util.Scanner;

public class SwapTwoN2 {
    public static void swap(int a,int b)
    {
        int c;
        System.out.println("original value before swapping :");
        System.out.println("a="+" "+a+" "+"b="+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("Swapped  value by using 3rd variable :");
        System.out.println("a="+" "+a+" "+"b="+" "+b);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=sc.nextInt();
        System.out.println("enter the second number:");
        b=sc.nextInt();
        swap(a,b);

    }
}
