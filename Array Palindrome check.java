import java.util.Scanner;
public class ArrayPalindromeChecker {
    public static boolean isPalindrome(int[] array) {
	int[] array1=new int[array.length];
	int x=0;
	for(int i=array.length-1;i>=0;i--)
		{
			array1[x]=array[i];
			x++;
		}
	for(int i=0;i<array.length;i++)
		{
			if(array[i] != array1[i])
			{
				return false;
			}
		}
	return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }
        if (isPalindrome(inputArray)) {
            System.out.println("The array is a palindrome.");
        } else {
