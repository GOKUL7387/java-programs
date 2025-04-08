import java.util.Scanner;
public class permutation {

    public static void permute(String str, String abc) 
    {
        if (str.length() == 0) 
        {
            System.out.println(abc);
        }
        else 
        {
            for (int i = 0; i < str.length(); i++) 
            {
                String newStr = str.substring(0, i) + str.substring(i + 1);
                String newAbc = abc + str.charAt(i);
                permute(newStr, newAbc);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String in = sc.nextLine();
        System.out.println("The Posiible Combinations: ");
        permute(in, "");
    }
}
