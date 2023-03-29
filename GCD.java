package lab10;

import java.util.Scanner;

public class GCD {
	public static int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter m");
		int m = scan.nextInt();
		System.out.println("Enter n");
		int n = scan.nextInt();
		scan.close();
		
		System.out.println(gcd(m, n));
	}
	private static int gcd(int m, int n) {
		
		if (m % n == 0 && (n + counter) % n == 0) {
			return n;
		} else {
			counter++;
			return gcd(m, n-1);
		}
	}

}
