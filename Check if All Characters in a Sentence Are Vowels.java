import java.util.*;
class main
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String x=scan.nextLine();
        String y="AEIOUaeiou";
        int n=x.length();
        int count=0;
        if (x.isEmpty()) 
        {
            System.out.println("no");
            return;
        }
        for(char c:x.toCharArray())
        {
            if(y.indexOf(c) != -1)
            {
                count++;
            }
        }
        if(count==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
