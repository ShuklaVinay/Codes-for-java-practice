import java.util.Scanner;

//inverted half pyramid rotated by 180 degree
public class pattern5 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter no. of rows:");
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
