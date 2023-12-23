//Write a Java program to find whether an array is sorted or not.
public class Array6 {
    public static void main(String[] args) {
        int[] arr={23,4,65,7,12,60,45,23};
        boolean isSorted=true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
               // break;
            }
        }
        if (isSorted)
        {
            System.out.println("Array is sorted.");
        }
        else {
            System.out.println("Array is not sorted.");
        }
    }
}
