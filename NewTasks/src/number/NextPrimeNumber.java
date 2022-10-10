package number;

import java.util.Scanner;

public class NextPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number : ");

		int n = sc.nextInt();
		int no = n + 1;

		for (int i = no; i < no * 2; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0 && i > 1) {
				System.out.println(i + " is next prime number");
				break;
			}
		}
	}

}
