package EasyQuestions;

import java.util.Scanner;

public class MergeSortedArrays {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index1 = m - 1, index2 = n - 1, curr = m + n - 1;
		while (index1 >= 0 && index2 >= 0) {
			if (nums1[index1] > nums2[index2]) {
				nums1[curr] = nums1[index1];
				curr--;
				index1--;
				}
			else{
				nums1[curr]=nums2[index2];
				curr--;
				index2--;
			}
		}
		if(index1<0){
			while(index2>=0){
				nums1[curr]=nums2[index2];
				curr--;
				index2--;
			}
			
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] nums2 = new int[n];
		for (int i = 0; i < n; i++) {
			nums2[i] = Integer.parseInt(scan.nextLine());
		}
		int m = Integer.parseInt(scan.nextLine());
		int[] nums1 = new int[m + n];
		for (int i = 0; i < m; i++) {
			nums1[i] = Integer.parseInt(scan.nextLine());
		}
		scan.close();
		merge(nums1, m, nums2, n);
	}

}
