package PracticeClasses;

import java.util.*;

public class GenerateParentheses {
	
	List<String> str = new ArrayList<>();
	
	public void createParen(int n, int i, String phrase) {
		if(i>n) {
			str.add(phrase);
			return;
		}
		createParen(n,i+1,phrase+"(");
		createParen(n,i+1,phrase+")");
	}
	
	public void printList() {
		System.out.println(str);
		System.out.println(str.size());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		GenerateParentheses obj = new GenerateParentheses();
		obj.createParen(n*2, 0, "");
		
		obj.printList();

	}

}
