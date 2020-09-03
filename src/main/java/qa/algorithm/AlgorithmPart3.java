package qa.algorithm;

import java.io.IOException;
import java.util.Scanner;

public class AlgorithmPart3 {
	
		
	
	public void FindALetter() {
		String word = "Hello World!";
		char find = 'l';
		int t = 0;
		
		for(int i=0; i<word.length();i++) {
			if(word.charAt(i) == find) {
				
				System.out.print(find + " at " + i + " position. \n");
				t++;
			}
			
		}
		System.out.println("The letter '"+ find + "' exists " + t + " times.");
	}
	
	public void FindDuplicateWord() {
		String sentence = "Hello Hello go go tommy to to !";
		
		String[] array = sentence.split("\\s");
		
		for(int i=0; i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equals(array[j])) {
					System.out.println(array[i]);
				}
			}
			
		}
	}
	
	public void longestWord() {
		String sentence = "Hello Helloween go go tommies to to !";
		
		String[] array = sentence.split("\\s");
		String longest_word = "";
		int word_length = 0;
		int index=0;
		
		for(int i=0; i<array.length; i++) {
			
			
			int current_word_length = array[i].length();
			
			if(current_word_length > word_length) {
				word_length = current_word_length;
				index = i;
			}

		}
		System.out.println(array[index]);
	}
	
	
	public void insertCharacter() {
		String word = "Hello";
		Character c1 = 'a';
		Character e1 = 'l';
		Character e2 = 'o';
		
		StringBuffer sb = new StringBuffer(word);
		
		for(int i=0; i<word.length(); i++) {
			if( word.charAt(i) == e1 && word.charAt(i+1) == e2 ) {
				sb.insert(i+1, c1);
			}
		}
		System.out.print(sb);		
		
	}
	
	public void findCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		
		char find = 'O';  
		
		try {
			find = (char) System.in.read();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) == find) {
				System.out.println("Character: "+find+"found at location " + i);
			}
		}
	}
	
	
	public void reverseString() {
		String word = "Apple";
		String revWord = "";
		char[] Array = word.toCharArray();
		for(int i = Array.length-1; i>=0; i--) {
			revWord = revWord + Array[i];
		}
		
		System.out.print(revWord);
		
	}
	
}
