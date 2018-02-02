package EasyQuestions;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int x) {
		if(x<0)
			return false;
        int sum=0, r=0,temp=0;
        temp=x;
        while(x>0){
           r=x%10;
            sum=sum*10+r;
            x/=10;//x=x/10
        }
        if(sum==temp) return true;
        else return false;
    }
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		boolean result=isPalindrome(n);
		System.out.println(result);
	}
}
