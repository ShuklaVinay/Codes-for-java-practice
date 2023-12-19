//Random number program to guess the correct answer
import java.util.Random;
import java.util.Scanner;

public class RandomN1 {
    public static void main(String[] args) {
        int max =10;
        int n=3,g;
        int cnt=3;
        Random rm=new Random();
        Scanner sc=new Scanner(System.in);
        //System.out.println("please enter no. how many times random no you want");
        //n=sc.nextInt();
        System.out.println("you have only 3 chance to guess the random no.");
        System.out.println("Please guess the no between 1 to 10");
        int num = rm.nextInt(max)+1;
        //System.out.println(num);
        g=sc.nextInt();

     //   System.out.println("the correct answer is :" + num);

        for(int i=1;i<=n;i++) {
            System.out.println("Your guessing number chance:"+" "+i);
            //System.out.println("enter limit for random no.");
            //max = sc.nextInt();

           if(num==g)
            {
                System.out.println("Congratulations! you guess the right number."+" "+num);
                System.out.println("You won the Rs.100 cash price.");
                System.out.println("Please collect from Mr. Akshay");
                break;
            }
            else {
                System.out.println("Sorry! your answer is wrong.");
                System.out.println("Please try again.");
                g = sc.nextInt();
            }
            cnt--;

        }

        //System.out.println(cnt);
        if(cnt==0)
        {
            System.out.println("Attempt Exhausted");
        }

        }

    }

