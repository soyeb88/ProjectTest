package practice;



public class pract1{
	
	public static void main(String[] args) {
		
		String word = "hello";
		char insChar = 'o';
		char begChar = 'e';
		char endChar = 'l';

		StringBuffer sb = new StringBuffer(word);
		
		for(int i=0; i<word.length(); i++) {			
			
			if(begChar ==word.charAt(i) && endChar == word.charAt(i+1)) {
				sb.insert(i+1, insChar);
			}
		}
		
		System.out.println(sb);
		
		
	}
	
}