package lab10;

import java.util.Scanner;

public class y5n {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter exponent n");
		int n = scan.nextInt();
		scan.close();
		
		System.out.println(expFive(n));
		}
		private static int expFive(int n) {
			if(n == 0) {
				return 1;
			}
			return 5*expFive(n-1);
			
	}

}
