//Write a Java program to find the maximum element in a Java array
public class Array5 {
    public static void main(String[] args) {
        int[] arr={45,65,78,2,90,65,33,49};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("min value is in array="+" "+min);
    }
}
