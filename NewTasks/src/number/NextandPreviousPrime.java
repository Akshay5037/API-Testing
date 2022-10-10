package number;

import java.util.Scanner;

public class NextandPreviousPrime {

	public static void primeNumber(int n) {
		int temp = 0;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	public static void findNextPrime(int n) {
		boolean isPrime = false;
		while (!isPrime) {
			isPrime = true;
			n++;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Next prime number is " + n);
			}
		}
	}

	public static void findPreviousPrime(int n) {
		boolean isPrime = false;
		while (!isPrime) {
			isPrime = true;
			n--;
			for (int i = n - 1; i >= 2; i--) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Previous prime number is " + n);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println(n + " is not a prime number");
		} else {
			primeNumber(n);
			findNextPrime(n);
			findPreviousPrime(n);
		}
	}
}
