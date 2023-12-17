import java.util.Scanner;
//Linear Search Program: search value of x in entered array element
public class ArraySearchX
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter size of an array:");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println("Please enter elements of an array:");
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("Please enter value of x  for search in entered array elements");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==x)
            {
                System.out.println("x found at index no .:"+" "+i);
            }
        }
    }
}
