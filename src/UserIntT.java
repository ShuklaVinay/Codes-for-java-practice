import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class UserIntT
{
    static void sum(int a,int b)
    {
        int c=a+b;
        System.out.println("sum of two integer value="+" "+c);
    }
    static void sum(float d,float e)
    {
        float h=d+e;
        System.out.println("sum of two float value="+" "+h);
    }
    static void sum(double f,double g)
    {
        double i=f+g;
        System.out.println("sum of two double value="+" "+i);
    }

    public static void main(String[] args) throws IOException
    {
        int a,b;
        float d,e;
        double f,g;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter two integer  value");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        sum(a,b);
        System.out.println("enter two float value");
        d=Float.parseFloat(br.readLine());
        e=Float.parseFloat(br.readLine());
        sum(d,e);
        System.out.println("enter two double value");
        f=Double.parseDouble(br.readLine());
        g=Double.parseDouble(br.readLine());
        //sum(a,b);
        //sum(d,e);
        sum(f,g);
    }
}
