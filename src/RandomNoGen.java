//Random number generator program
import java.util.Scanner;
import java.util.Random;
public class RandomNoGen {
    public static void main(String[] args) {
        int ans,guess;
        final int max=10;
            Scanner sc = new Scanner(System.in);
            Random rm = new Random();
            ans = rm.nextInt(max) + 1;
            System.out.println("Please guess the number between 1 to 10 :");
            guess = sc.nextInt();

            if (ans == guess) {
                System.out.println("Congratulations! you guess the correct number"+ ans +"& win 100 cash money." );

            } else {
                System.out.println("Sorry! Your number choice is wrong.");
                System.out.println("Correct answer is:" + ans);
            }





    }
}
