package EasyQuestions;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
	/*Using HashMap*/
//public static boolean containsDuplicate(int[] nums) {
//	Map <Integer, Integer> maps =new HashMap<Integer, Integer>();
//	for(int i=0; i<nums.length;i++){
//		if(maps.containsKey(nums[i]))
//		return true;
//		else
//			maps.put(nums[i],1);
//	}
//	return false;
//    }
	
	
/* hashset can be used*/
public static boolean containsDuplicate(int[] nums) {
	Set<Integer> set =new HashSet<Integer>();
	for(int i=0; i<nums.length;i++){
		if(set.contains(nums[i]))
		return true;
		else
			set.add(nums[i]);
	}
	return false;
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
		boolean r= containsDuplicate(nums);
		System.out.println(r);

	}

}
