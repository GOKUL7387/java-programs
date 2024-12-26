import java.util.*;


public class pattern_function
{
    public static void option() 
    {
        Scanner scan = new Scanner(System.in);
        while (true) 
        {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Triangle Pattern");
            System.out.println("2. Square Pattern");
            System.out.println("3. Character Right Angle Pattern");
            System.out.println("4. Reverse Right Angle Pattern");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int x = scan.nextInt();
            switch (x) 
            {
                case 1:
                    System.out.print("Enter size: ");
                    int a = scan.nextInt();
                    trianglePattern(a);
                    break;
                case 2:
                    System.out.print("Enter size: ");
                    int b = scan.nextInt();
                    squarePattern(b);
                    break;
                case 3:
                    System.out.print("Enter size: ");
                    int c = scan.nextInt();
                    characterPattern(c);
                    break;
                case 4:
                    System.out.print("Enter size: ");
                    int d = scan.nextInt();
                    reversePattern(d);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    return; // Exit the loop and program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Triangle pattern method
    public static void trianglePattern(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Square pattern method
    public static void squarePattern(int b) {
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == b || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Character pattern method
    public static void characterPattern(int c) {
        for (int i = 1; i <= c; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Reverse pattern method
    public static void reversePattern(int d) {
        for (int i = d; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        option();
    }
}
