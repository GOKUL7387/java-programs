import java.util.*;
class array {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String[] s = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] arr = new int[7];
        int[] arr1 = new int[7];

        System.out.println("Enter the sales: ");
        for (int i = 0; i < 7; i++) 
        {
            arr[i] = scan.nextInt();
        }

        System.arraycopy(arr, 0, arr1, 0, 7);
        Arrays.sort(arr);
        int x=0,y=0;
        for (int i = 0; i < 7; i++) 
        {
            if (arr1[i] == arr[0])
            {
                x=i;
            }
            if (arr1[i] == arr[6]) 
            {
                y=i;
            }
        }
        System.out.println("The Highest sale at: "+s[y]);
        System.out.println("The sale is: " +arr[6]);
        System.out.println("The Lowest sale at: "+s[x]);
        System.out.println("The sale is: " +arr[0]);
        System.out.println("Weekend sales are: " + (arr1[5] + arr1[6])); 
    }
}
