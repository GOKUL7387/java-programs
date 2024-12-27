import java.util.*;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int m=scan.nextInt();
        System.out.println("Enter no.of columns: ");
        int n=scan.nextInt();
        int[][] arr=new int[m][n];
        int top=0;
        int right=m-1;
        int bottom=n-1;
        int left=0;

        //input:

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("The elements after spirally traversed: ");
        int d=1;
        while(top<=bottom && left<=right)
        {
            if(d==1)
            {
                for(int i=left;i<=right;i++)
                {
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            
            else if(d==2)
            {
                for(int i=top;i<=bottom;i++)
                {
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }

            else if(d==3)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }

            else if(d==4)
            {
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            d++;
            if(d==5)
            {
                d=1;
            }
        }
    }
}
