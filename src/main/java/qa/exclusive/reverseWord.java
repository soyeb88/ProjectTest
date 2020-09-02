package qa.exclusive;

public class reverseWord {

	public static void main(String[] args) {
		String text = "We love NY";
		//Expects YN evoL eW
		
		System.out.println(text.length());
		
		for(int i=text.length(); i<0; i--) {
			System.out.print(text.charAt(i));
		}
	}

}
