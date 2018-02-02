package EasyQuestions;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
public static int titleToNumber(String s) {
	int result=0;
	for(int i=0;i<s.length();i++){
		result=result*26+((s.charAt(i)-'A')+1);
	}
	return result;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		int result=titleToNumber(s);
		System.out.println(result);
	}

}
