//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
public class Array2 {
    public static void main(String[] args) {
        int[] marks={50,60,56,87,90,75};
        int sum=0;
        for(int e:marks)
        {
            sum=sum+e;
        }
        float avg=(float)sum/marks.length;
        System.out.println(avg);
    }
}
