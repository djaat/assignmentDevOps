import java.util.Scanner;
import java.lang.Math;
public class Solution {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)) {
			int a = 12, b = 10, c = 5, max = 0, min = 0;
			//System.out.println("enter a: ");
			//a = sc.nextInt();
			max = a;
			min = a;
			//System.out.println("enter b:");
			//b = sc.nextInt();
			min = Math.min(min,b);
			max = Math.max(max,b);
			//System.out.println("enter c:");
			//c = sc.nextInt();
			min = Math.min(min,c);
			max = Math.max(max,c);
			System.out.println("Values read!!");
			System.out.println("Sum: "+(min+max));
		}
	}
}
