//Swap two number by using bitwise operator(XOR)
import java.util.Scanner;
public class SwapTwoNo {
    public static void swap(int a,int b)
    {

        System.out.println("original value before swapping :");
        System.out.println("a="+" "+a+" "+"b="+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Swapped  value by using bitwise operator(XOR ^) :");
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
