import java.util.Scanner;

//inverted pyramid with number pattern
public class Pattern7 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no. of row");
        n=sc.nextInt();
        for (int i=n;i>=1;i--) {
         for (int j=1;j<=i;j++)
         {
             System.out.print(j+" ");
         }
            System.out.println();
        }
        }
    }

