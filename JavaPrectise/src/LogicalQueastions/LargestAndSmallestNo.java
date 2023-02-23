package LogicalQueastions;
import java.util.Scanner;

public class LargestAndSmallestNo {
	public static void main(String[] args) {
		int a, b, c, d, largest, smallest, temp1, temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		System.out.println("Enter the fourth number:");
		d = sc.nextInt();
		temp1 = a > b ? a : b;
		temp2 = c > d ? c : d;
		largest = d > temp2 ? d : temp2;
		System.out.println("The largest number is: " + largest);
		temp1 = a < b ? a : b;
		temp2 = c < d ? c : d;
		smallest = d < temp2 ? d : temp2;
		System.out.println("The smallest number is: " + smallest);

	}
}