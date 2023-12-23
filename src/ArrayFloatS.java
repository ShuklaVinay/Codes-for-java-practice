//Create an array of 5 floats and calculate their sum
public class ArrayFloatS {
    public static void main(String[] args) {
        float[] arr={23.5f,45.43f,56.54f,45.23f,12.4f};
        float sum=0;
        for (float e:arr)
        {
            sum=sum+e;
        }
        System.out.println(sum);
    }
}
