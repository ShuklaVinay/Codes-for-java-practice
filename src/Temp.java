interface Temp2 {
    void run();
}
interface Temp1{
    void speed();
}
class Temp3 implements Temp2,Temp1
{
  public   void run()
    {
        System.out.println("running");
    }


   public void speed()
    {
        System.out.println("speed fast");
    }

    public void horn()
    {
        System.out.println("horn beep");
    }
}
public class Temp
{
    public static void main(String[] args) {
        Temp3 t3=new Temp3();
        t3.run();
        t3.speed();
        t3.horn();
    }
}
