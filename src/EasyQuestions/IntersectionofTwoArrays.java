package EasyQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionofTwoArrays {
	
public static int[] intersection(int[] nums1, int[] nums2) {
	Set<Integer> set= new HashSet<>();
	Set<Integer> intersection= new HashSet<>();
	for(int i=0;i<nums1.length;i++ ){
		set.add(nums1[i]);
	}
	for(int i=0;i<nums2.length;i++){
		if(set.contains(nums2[i]))
			intersection.add(nums2[i]);	
	}
	int result[]= new int[intersection.size()];
	int i=0;
	for(Integer e:intersection){
		result[i]= e;
		i++;
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
		int result[]=intersection(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

}
