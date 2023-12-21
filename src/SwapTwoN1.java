//Swap two number by using division & multiplication
import java.util.Scanner;
public class SwapTwoN1 {
    public static void swap(int a,int b)
    {

        System.out.println("original value before swapping :");
        System.out.println("a="+" "+a+" "+"b="+" "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Swapped  value by using division & multiplication :");
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

