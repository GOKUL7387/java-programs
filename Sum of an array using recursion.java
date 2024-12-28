import java.util.*;
public class recursion2
{
    public static int  sumarray(int n, int arr[])
    {
        if(n<0)
        {
            return 0;
        }
        return arr[n]+sumarray(n-1, arr);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int x=sumarray(n-1,arr);
        System.out.println("The sum of the array: "+x);
    }
}
