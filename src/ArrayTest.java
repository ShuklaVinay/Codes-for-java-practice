import java.util.Scanner;
//Array program size & array element entered by user
public class ArrayTest {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        size=sc.nextInt();
        int[] number=new int[size];
        //for input
        System.out.println("enter the array element");
        for(int i=0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
        System.out.println("entered array elements are=");
        for(int i=0;i< number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
