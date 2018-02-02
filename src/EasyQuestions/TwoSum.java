package EasyQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (temp.containsKey(diff)) {
				result[0] = temp.get(diff);
				result[1] = i;
//				return result;
			}
			temp.put(nums[i], i);
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(scan.nextLine());
		}
		int target = Integer.parseInt(scan.nextLine());
		scan.close();
		int[] x = new int[2];
		x = twoSum(nums, target);
		System.out.println("[" + x[0] + "," + x[1] + "]");
	}

}
