package EasyQuestions;

import java.util.Scanner;

public class ClimbingStairs {
	public static int climbStairs(int n) {
		 int n1=0,n2=1,n3=0;
	        for(int i=2;i<n+2;i++){
	            n3=n1+n2;
	            n1=n2;
	            n2=n3;   
	        }
	        return n3;
	}

	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		int x=climbStairs(n);
		System.out.println(x);
	}
	

}
