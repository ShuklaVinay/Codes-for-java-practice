//Array Program- enter size of an array & enter element as String value

import java.util.Scanner;

public class ArrayStringV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of an array");
        int size=sc.nextInt();
        String[] names=new String[size];
        System.out.println("Please enter string for array element");
        for (int i=0;i<size;i++)
        {
            names[i]=sc.next();
        }
        //for output
        System.out.println("Entered string value is:");
        for(int i=0;i< names.length;i++)
        {
            System.out.println("Name "+(i+1)+" : "+names[i]);
        }
    }
}
