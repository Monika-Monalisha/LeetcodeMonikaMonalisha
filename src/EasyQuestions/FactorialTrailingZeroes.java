package EasyQuestions;

import java.util.Scanner;

public class FactorialTrailingZeroes {
	 public static int trailingZeroes(int n) {
		 int count=0;
		 while(n>0){
			 n=n/5;
			 count+=n; 
		 }
		return count;
	        
	    }
	
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		int r= trailingZeroes(n);
		System.out.println(r);
	}

}
