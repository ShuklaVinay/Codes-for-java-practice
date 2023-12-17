//multiplication of two matrix
public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{3,2,1},{6,5,4},{9,8,7}};
        int[][] c=new int[3][3];
        System.out.println("Multiplication of two matrix=");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<a.length;k++)
                {
                    c[i][j] +=a[i][k]+b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
