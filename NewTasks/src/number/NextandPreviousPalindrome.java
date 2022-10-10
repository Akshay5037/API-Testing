package number;

import java.util.Scanner;

public class NextandPreviousPalindrome {
	public static void palindromeNumber(int n) {
		int r, sum = 0, temp, np;
		np = n;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(sum + " is palindrome number");
		} else {
			System.out.println(np + " is not palindrome number");
		}
	}

	public static void findNextPalindrome(int n) {
		int sum = 0, r = 0, temp, np;
		np = n;
		while (true) {
			n++;
			temp = n;
			sum = r = 0;

			while (temp > 0) {
				r = temp % 10;
				sum = (sum * 10) + r;
				temp = temp / 10;
			}
			if (sum == n) {
				System.out.println(sum + " is next palimdrome number of " + np);
				break;
			}
		}
	}

	public static void findPreviousPalindrome(int n) {
		int sum = 0, r = 0, temp, np;

		np = n;
		while (true) {
			n--;
			temp = n;
			sum = r = 0;
			while (temp > 0) {
				r = temp % 10;
				sum = (sum * 10) + r;
				temp = temp / 10;
			}
			if (sum == n) {
				System.out.println(sum + " is previous palimdrome number of " + np);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println(" negative number are not palindromic");
		} else {
			palindromeNumber(n);
			findNextPalindrome(n);
			findPreviousPalindrome(n);
		}
	}
}