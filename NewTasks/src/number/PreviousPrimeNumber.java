package number;

import java.util.Scanner;

public class PreviousPrimeNumber {

	public static void main(String[] args) {

		int n; 

		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = n - 1; i >= 0; i--) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0 && i > 1) {
				System.out.println(i + " is previous prime number");
				break;
			}
		}
	}

}
