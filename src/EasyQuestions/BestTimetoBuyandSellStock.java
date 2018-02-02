package EasyQuestions;

import java.util.Scanner;

public class BestTimetoBuyandSellStock {
public static int maxProfit(int[] prices) {
	int max=0;
	int min=prices[0];
	for(int i=0; i<prices.length;i++){
		if(min<prices[i]){
			int curr=prices[i]-min;
			if(curr>max)
				max=curr;
		}
		else
			min=prices[i];
	}
	return max;
        
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
		int result= maxProfit(nums);
		System.out.println(result);
	}

}
