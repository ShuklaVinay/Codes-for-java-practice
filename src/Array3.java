//Write a Java program to reverse an array.
public class Array3 {
    public static void main(String[] args) {
        int[] arr={10,15,17,20,24,50,60};
        int temp;
        for(int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("array is in reverse order :");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
