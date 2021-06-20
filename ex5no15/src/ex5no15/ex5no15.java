package ex5no15;

public class ex5no15 {  //  211p
	public static void main(String[] args) {
		String source = "SOSHELP" ;
		String[] morse = {
				".-","-...","-.-","-..",".",
				"..-.","--.","....","..",".---",
				"-.-",".-..","--","-.","---",
				".--.","--.-",".-.","...","-.--",
				"..-","...-",".--","-..-","-.--",
				"--.."
		};  // String[]
		
		String result = "" ;
		
		for( int i = 0 ; i < source.length() ; i++) {
			result += morse[source.charAt(i) - 'A'];
		} // for
		
		System.out.println("source : "+source);
		System.out.println("result : "+result);
	}

}
