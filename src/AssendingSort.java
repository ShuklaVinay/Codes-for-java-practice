//Sorting Array Ascending order

public class AssendingSort {

    static int[] customSort(int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -7777, -99, 65};
        int[] newArr = customSort(a);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(a[i]);
        }

    }
}
