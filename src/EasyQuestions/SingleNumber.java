package EasyQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])){
				int value=map.get(nums[i]);
				value++;
				map.put(nums[i],value);
//			System.out.println(nums[i]+" "+map.get(nums[i]));
			}
			else
				map.put(nums[i],1);
//			System.out.println(nums[i]+" "+map.get(nums[i]));
		}
		for(Integer key:map.keySet()){
			Integer val= map.get(key);
			if(val==1) return (int)key;
		}
		return 0;
}
	
	// another method without using any extra spaces and using bit wise operator xor(^)
//	public int singleNumber(int[] nums) {
//	    int ans =0;
//	    
//	    int len = nums.length;
//	    for(int i=0;i!=len;i++)
//	        ans ^= nums[i];
//	    
//	    return ans;
//	    
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(scan.nextLine());
		}
		scan.close();
		int r= singleNumber(nums);
		System.out.println(r);
	}

}
