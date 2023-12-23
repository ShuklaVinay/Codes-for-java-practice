//Write a program to find out whether a given integer is present in an array or not.
public class Array1 {
    public static void main(String[] args) {
        int[] arr={12,34,15,65,67,20};
        int num=34;
        boolean isInArray=false;
        for (int j : arr)
        {
            if (j == num)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("number is in Array");
        }
        else
        {
            System.out.println("number not in array");
        }
    }
}
