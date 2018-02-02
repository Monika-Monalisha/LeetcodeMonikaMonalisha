package EasyQuestions;

import java.util.Scanner;

public class Numberof1Bits {
public static int hammingWeight(int n) {
	int count=0;
		while(n>0){
			int r=n%2;
			if(r==1)
				count++;
			n=n/2;
		}
		return count;  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		int result=hammingWeight(n);
		System.out.println(result);

	}

}

// using inbuilt functions
//public int hammingWeight(int n) {
//    String integer = Integer.toBinaryString(n);
//integer = integer.replaceAll("0","");
//return integer.length();
//    
//}
// using bit manipulation
