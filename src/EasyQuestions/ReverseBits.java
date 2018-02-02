package EasyQuestions;

import java.util.Scanner;

public class ReverseBits {
public static int reverseBits(int n) {
	return Integer.reverse(n);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		int result=reverseBits(n);
		System.out.println(result);

	}

}
