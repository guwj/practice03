package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		
		//String을 Char배열로 변환
		char[] c = str.toCharArray();
		int length = c.length;
		char[] reverse = new char[length];
		
		//거꾸로 전환
		for(int i = 0 ; i < length ; i++){
			reverse[i] = c[length - i - 1];
		}
		
		return reverse;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		System.out.println(array);
	}
}
