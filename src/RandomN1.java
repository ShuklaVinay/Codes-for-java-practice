//Random number program to guess the correct answer

import java.util.Random;
import java.util.Scanner;

public class RandomN1 {
    public static void main(String[] args) {
        int num=5;
        int max =10;
        int n=3;
        Random rm=new Random();
        Scanner sc=new Scanner(System.in);
        //System.out.println("please enter no. how many times random no you want");
        //n=sc.nextInt();
        System.out.println("you have only 3 chance to guess the random no.");
        for(int i=1;i<=n;i++) {
            System.out.println("Your guessing number chance:"+" "+i +"chance");
            //System.out.println("enter limit for random no.");
            //max = sc.nextInt();
            System.out.println("Please guess the no between 1 to 10");
            int g=sc.nextInt();
            num = rm.nextInt(max)+1;
            System.out.println("the correct answer is :" + num);
            if(num==g)
            {
                System.out.println("Congratulations! you guess the right number."+" "+num);
                System.out.println("You won the Rs.100 cash price.");
                System.out.println("Please collect from Mr. Akshay");
            }
            else {
                System.out.println("Sorry! your answer is wrong.");
                System.out.println("Please try again.");
            }

        }

    }
}
