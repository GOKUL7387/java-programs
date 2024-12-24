import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a="ramesh";
		String b="ramesh@123";
        boolean n=true;
		while(n)
		{
		    System.out.print("Enter username: ");
		    String x=scan.next();
			System.out.print("Enter password: ");
			String y=scan.next();

			if( (x.equals(a)) && (y.equals(b)) )
			{
				System.out.print("login Successfull");
				n=false;
			}
			else
			{
				System.out.println("username or password wrong");
			}
		}
	}
}
