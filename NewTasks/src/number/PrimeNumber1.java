package number;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {

		int n, i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you number : ");

		n = sc.nextInt();

		i = 2;

		while (i < n) {
			if (n % i == 0) {
				System.out.println(n + " is not a prime");
				break;
			}
			i++;
			}
		if (i == n) {
			System.out.println(n + " is prime number");
		}
	}
}
