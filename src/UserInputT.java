import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputT {
    public static void main(String[] args)throws IOException {
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any string");
        s= br.readLine();
        System.out.println("entered string is :"+s);
    }

}
