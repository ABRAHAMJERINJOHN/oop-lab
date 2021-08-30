import java.util.*;
class java_4_AddMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;

        System.out.println("Enter the number of rows and columns of matrices:");
        m=sc.nextInt();
        n=sc.nextInt();

        int[][] first=new int[m][n];
        int[][] second=new int[m][n];
        int[][] sum=new int[m][n];

        System.out.println("Enter the elements of 1st matrix : ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                first[i][j]=sc.nextInt();

        System.out.println("Enter the elements of 2nd matrix : ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                second[i][j]=sc.nextInt();

        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                sum[i][j]=first[i][j]+second[i][j];
        

        System.out.println("Elements of 1st Matrix : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(first[i][j]+"\t");
            System.out.println();
        }

        System.out.println("Elements of 2nd Matrix : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(second[i][j]+"\t");
            System.out.println();
        }

        System.out.println("Sum of Two Matrices : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(sum[i][j]+"\t");
            System.out.println();
        }

    }
}