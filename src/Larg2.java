import java.util.Scanner;
//find largest no by using if else & method
public class Larg2 {
    public static int largestNum(int a,int b,int c){
        if (a>b && a>c)
        {
            return a;
        }
        else if (b>c && b>a) {
            return b;
        }
        else {
            return c;
        }
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
        System.out.println("largest no is = "+" "+result);
    }
}
