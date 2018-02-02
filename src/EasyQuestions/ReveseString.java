package EasyQuestions;

import java.util.Scanner;

public class ReveseString {
	public static String reverseString(String s){
		char[] array= new char[s.length()];
		array=s.toCharArray();
		int start=0, end=s.length()-1;
		while(start<end){
			char temp=array[end];
			array[end]=array[start];
			array[start]=temp;
			start++;
			end--;
		}
		return new String(array);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s = scan.next();
		scan.close();
		String result=reverseString(s);
		System.out.println(result);
		

	}

}
