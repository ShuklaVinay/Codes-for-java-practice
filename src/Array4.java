//Write a Java program to find the maximum element in an array.
public class Array4 {
    public static void main(String[] args) {
        int[] arr={50,45,900,444,678,89045,87,34};
        int max=Integer.MIN_VALUE;
        for(int e:arr)
        {
            if(e>max)
            {
                max=e;
            }

        }
        System.out.println("max value is in Array ="+" "+max);
    }
}
