package EasyQuestions;

import java.util.Scanner;

public class PowerofThree {
	 public static boolean isPowerOfThree(int n) {
		 if (n >0 && (1162261467%n)==0)  // 3^19= 1162261467, maximum value in integer which is a perfect power of 3
			 return true; 
		 else
		return false;
	    }
	 public static void main(String[] args){
			Scanner scan= new Scanner(System.in);
			int n= Integer.parseInt(scan.nextLine());
			scan.close();
			boolean result= isPowerOfThree(n);
			System.out.println(result);
		}
}
