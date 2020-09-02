package qa.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmPart2 {

	public void oddEven1() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number to check even or odd");
		int n = in.nextInt();
		if (n % 2 == 0) {
			System.out.println(+n + " is even number");
		} else {
			System.out.println(+n + " is odd number");
		}
		in.close();

	}
	
	public void ReverseArray() {
		int[] x = { 1, 2, 3, 4, 10, 6, 7, 8, 5 };
		int temp;
		for (int i = 0; i < x.length / 2; i++) {
			temp = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = temp;
		} // end of for
		System.out.println(Arrays.toString(x));
	}// end of main
	
	public void ReverseString() {
		String text = "Hello";
		String reverse = "";
		
		for(int i=text.length() - 1; i>=0; i--) {
			reverse += text.charAt(i);
		}
		
		System.out.print(reverse);
	}
	
	public void sum10() {
		int[] array = {2, 4, 5, 9, 8, 2};
		
		for(int i=0; i<array.length; i++) {
			int n1 =array[i];
			
			for(int j=i+1; j<array.length; j++) {
				int n2= array[j];
				if(n1 + n2>=10) {
					System.out.println(n1 + " " + n2+ " is " + (n1+n2));
				}
			}
		}		
	}
	
	public void Fibonacci() {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.println(n1 + "\n" + n2);
		
		for(int i=2; i<=15; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2= n3;
			System.out.println(n3);
		}
	}
	

}
