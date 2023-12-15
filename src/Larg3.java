import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//largest between 3 numbers by using Collections.max() method
public class Larg3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no.");
        a=sc.nextInt();
        System.out.println("enter second no.");
        b=sc.nextInt();
        System.out.println("enter third no.");
        c=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(a);
        al.add(b);
        al.add(c);
        int result= Collections.max(al);
        System.out.println("Largest no. "+" "+result);
    }
}
