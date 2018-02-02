package EasyQuestions;

import java.util.Scanner;

public class RomantoInteger {
	public static int romanToInt(String s) {
		int arr[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'M')
				arr[i] = 1000;
			else if (s.charAt(i) == 'D')
				arr[i] = 500;
			else if (s.charAt(i) == 'C')
				arr[i] = 100;
			else if (s.charAt(i) == 'L')
				arr[i] = 50;
			else if (s.charAt(i) == 'X')
				arr[i] = 10;
			else if (s.charAt(i) == 'V')
				arr[i] = 5;
			else if (s.charAt(i) == 'I')
				arr[i] = 1;
		}
		int result=0;
		for(int j=0; j<arr.length-1;j++){
			if(arr[j]<arr[j+1])
				result-=arr[j];
			else
				result+=arr[j];
		}
		result+=arr[arr.length-1];
		return result;

	}
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int x=romanToInt(s);
		System.out.println(x);
	}
	

}
