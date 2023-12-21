//to check the smallest & largest value in an array
import java.util.Scanner;
public class ArrayMaxMinV {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        size=sc.nextInt();
        int[] num=new int[size];

        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;    //-2147483648

        int min=Integer.MAX_VALUE;  // 2147483647
        for (int i=0;i<num.length;i++)
        {
            if(num[i]< min)   //2147483647
            {
                min=num[i];
            }
            if(num[i]>max)  //2147483648
            {
                max=num[i];
            }
        }
        System.out.println("Largest no. is in an array ;"+" "+max);
        System.out.println("Smallest no. is in an array:"+" "+min);

    }
}
