package EasyQuestions;

import java.util.Scanner;

public class ReverseInteger {
	public static int reverse(int x) {
	      long num= 0;
	        while(x!=0){
	          int r=x%10;
	            num=num*10+r;
	            x=x/10;
	        }
	        if(num< Integer.MIN_VALUE || num>Integer.MAX_VALUE){
	            return 0;
	        }
	        else return (int)num;
	    }

	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		int r= reverse(n);
		System.out.println("reverse-"+r);
	}
}
