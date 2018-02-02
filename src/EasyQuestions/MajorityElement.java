package EasyQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
	//Solution with O(n) time and O(n) space 
public static int majorityElement(int[] nums) {
	HashMap<Integer,Integer> map= new HashMap<>();
	for(int i=0;i<nums.length;i++){
		if(map.containsKey(nums[i]))
			map.put(nums[i], map.get(nums[i])+1);
		else
			map.put(nums[i], 1);
	}

	for(Integer key:map.keySet()){
		if(map.get(key)>nums.length/2)
			return (int)key;
	}
	return 0;     
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
		int result= majorityElement(nums);
		System.out.println(result);
	}

}
// Another method with O(n)time and O(1) space
//public int majorityElement(int[] num) {
//
//  int major=num[0], count = 1;
//  for(int i=1; i<num.length;i++){
//      if(count==0){
//          count++;
//          major=num[i];
//      }else if(major==num[i]){
//          count++;
//      }else count--;
//      
//  }
//  return major;
//}
