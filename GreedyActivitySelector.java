import java.lang.*;
import java.util.*;
public  class StartandEnd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start=new int[n];
        System.out.println("Enter Starting Array: ");
        for(int i=0;i<n;i++)
        {
            start[i]=sc.nextInt();
        }

        int[] end=new int[n];
        System.out.println("Enter Ending Array: ");
        for(int i=0;i<n;i++)
        {
            end[i]=sc.nextInt();
        }

        Arrays.sort(end);
        int endPoint = -1;
        for(int i=0;i<n;i++)
        {
            if(start[i]>=endPoint)
            {
                System.out.println("start: "+start[i]+" End: "+end[i]);
                endPoint = end[i];
            }
        }
    }
}
