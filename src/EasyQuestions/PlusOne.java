package EasyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
public static int[] plusOne(int[] digits) {
	 for(int i=digits.length-1;i>=0;i--){
		 if(digits[i]!=9){
			 digits[i]++;
			 return digits; 
		 }
		 digits[i]=0;
	 }
	 int [] result = new int[digits.length+1];
	 result[0]=1;
	return result;
        
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(scan.nextLine());
		}
		scan.close();
		int [] result= plusOne(nums);
		System.out.println(Arrays.toString(result));
	}

}
