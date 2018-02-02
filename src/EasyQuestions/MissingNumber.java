package EasyQuestions;

import java.util.Scanner;

public class MissingNumber {
public static int missingNumber(int[] nums) {
	int sum=0;
	for(int i=0;i<nums.length;i++){
			sum+=nums[i]-i;
	}
	return nums.length-sum; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(scan.nextLine());
		}
		scan.close();
		int result= missingNumber(nums);
		System.out.println(result);
	}

}
