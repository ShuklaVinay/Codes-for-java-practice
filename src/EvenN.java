import java.util.Scanner;

public class EvenN {
    public static void numberEvn(int n)
    {
        if(n%2 ==0)
        {
            System.out.println("entered number is even");
        }
        else {
            System.out.println("entered number is odd");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no. for check even or odd");
        n=sc.nextInt();
        numberEvn(n);
    }
}
