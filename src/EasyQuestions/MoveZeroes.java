package EasyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
public static void moveZeroes(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[temp] = nums[i];
				temp++;
			}
		}
		while(temp<nums.length){
			nums[temp]=0;
			temp++;
		}
		System.out.println(Arrays.toString(nums));
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
		moveZeroes(nums);
		
	}

}
