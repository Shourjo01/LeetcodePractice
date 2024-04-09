package PracticeClasses;
import java.util.*;

public class LongestPalindromicString {
	
	static String result;
	int startIndex;
	int lastIndex;
	public void longestPalindrome(String s, int start, int end) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		LongestPalindromicString obj = new LongestPalindromicString();
		obj.longestPalindrome(str,0,1);
		System.out.println(result);
		}

}
