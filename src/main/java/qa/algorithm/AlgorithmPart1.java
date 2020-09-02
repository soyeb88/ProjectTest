package qa.algorithm;

public class AlgorithmPart1 {

	// Find max number
	public void max() {
		int[] arr = {2,4,1,7,9};
		
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

	// Find min number
	public void min() {
		int[] arr = {2,4,1,7,9};
		
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}

	// Find is Prime Number or Not
	public void isPrime() {
		int num = 31;
		boolean primeNum = true;

		if (num < 2) {
			System.out.print(num + "is not a prime number!");
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primeNum = false;
				break;
			}
		}

		if (primeNum) {
			System.out.print(num + " is a prime number!");
		} else {
			System.out.print(num + " is not a prime number!");
		}
	}

	public void isPalindrome() {
		String text = "ASAA";
		String reverse = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			reverse += text.charAt(i);
		}

		if (text.equals(reverse)) {
			System.out.print(text + " is a Palindrome");
		} else {
			System.out.print(text + " is not a Palindrome");
		}

	}
	
	
	public void FizzBuzz() {
		int[] x = { 1, 2, 4, 3, 6, 7, 15, 9, 12 };
		
		for (int i = 0; i < x.length; i++) {
			if ((x[i] % 3 == 0) && (x[i] % 5 == 0))
				System.out.println("FizzBuzz");
			else if (x[i] % 3 == 0)
				System.out.println("Fizz");
			else if (x[i] % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(x[i]);
		}

	}
	
	
	/* output
		1
		2
		4
		Fizz
		Fizz
		7
		FizzBuzz
		Fizz
		Fizz
	*/
	


}
