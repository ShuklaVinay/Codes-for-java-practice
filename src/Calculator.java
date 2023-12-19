//Calculator program using switch statement

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a, b, c;
        int operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("1-addition\n2-substation\n3-multiplication\n4-divide\n5-modulo\n");
        System.out.println("please choose any one  number for action performed");
        operator=sc.nextInt();
        System.out.println("Please enter first & second value for arithmetic operation");
        //System.out.println("Please enter the no of term for arithmetic operation");
        //int n= sc.nextInt();
       a=sc.nextInt();
       b=sc.nextInt();
        switch(operator)
        {
            case 1:
                c =a+b;
                System.out.println("Addition of two number=" + " " + c);
                break;
            case 2:
                if(a>b) {
                    c = a - b;
                    System.out.println("Substation of two no.=" + " " + c);
                }else {
                    c=b-a;
                    System.out.println("Substation of two no.=" + " " + c);
                }
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication of two number=" + " " + c);

                break;
            case 4:
                c=a/b;
                System.out.println("Division of two number=" + " " + c);
                break;
            case 5:
                c=a%b;
                System.out.println("Modulo of two number=" + " " + c);
                break;
            default:
                System.out.println("you are not chosen any operation");
        }

    }
}
