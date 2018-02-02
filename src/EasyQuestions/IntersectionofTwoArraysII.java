package EasyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IntersectionofTwoArraysII {
	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> intersection = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i]))
				map.put(nums1[i], map.get(nums1[i]) + 1);
			else
				map.put(nums1[i], 1);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i])&& map.get(nums2[i])>0) {
				intersection.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int result[] = new int[intersection.size()];
		for (int j = 0; j < intersection.size(); j++) {
			result[j] = intersection.get(j);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = Integer.parseInt(scan.nextLine());
		int[] nums1 = new int[m];
		for (int i = 0; i < m; i++) {
			nums1[i] = Integer.parseInt(scan.nextLine());
		}
		int n = Integer.parseInt(scan.nextLine());
		int[] nums2 = new int[n];
		for (int i = 0; i < n; i++) {
			nums2[i] = Integer.parseInt(scan.nextLine());
		}
		scan.close();
		int result[] = intersect(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

}
