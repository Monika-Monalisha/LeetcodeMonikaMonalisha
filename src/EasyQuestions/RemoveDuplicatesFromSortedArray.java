package EasyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
public static int removeDuplicates(int[] nums) {
	int count=1;
	if(nums==null) return count=0;
	for(int i=1;i<nums.length;i++){
		if(nums[i]!=nums[i-1]){
			nums[count]=nums[i];
			count++;
		}
	}
	System.out.println(Arrays.toString(nums)); 
	return count;      
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
		int result= removeDuplicates(nums);
		System.out.println(result);

	}

}
