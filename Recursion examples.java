import java.util.*;
public class recursion1
{
    public static long  sum(long  n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }

    public static long power(long a, long b)
    {
        if(a==0)
        {
            return 0;
        }
        if(b==0)
        {
            return 1;
        }
        return a*power(a, b-1);
    }

    public static long  digits(long  c)
    {
        long count=0;
        if(c==0)
        {
            return 0;
        }
        count++;
        c=c/10;
        return count+digits(c);
    }

    public static long  fibonacii(long  d)
    {
        if(d==0 || d==1)
        {
            return d;
        }
        return fibonacii(d-1)+fibonacii(d-2);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print ("Enter the number for sum:: ");
        long  n=scan.nextLong ();
        long  x=sum(n);
        System.out.println("The sum is: "+x);
        System.out.print("Enter the number to power: ");
        long  a=scan.nextLong ();
        System.out.print ("Enter no.of times to power: ");
        long  b=scan.nextLong ();
        long y=power(a,b);
        System.out.println("Result: "+y);
        System.out.print ("Enter the number to find total digits: ");
        long  c=scan.nextLong ();
        long z=digits(c);
        System.out.println("The total digits are: "+z);
        System.out.print ("Enter fibonacii number: ");
        long d=scan.nextLong();
        long m=fibonacii(d);
        System.out.print ("The fibonacii series of "+d+" is: "+m);
    }
}
