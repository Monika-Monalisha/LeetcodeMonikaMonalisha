package EasyQuestions;

import java.util.Scanner;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		 String pre="";
	        if(strs.length>0) {
	         pre=strs[0];
	        for(int i=1; i<strs.length;i++){
	            String curr= strs[i];
	            System.out.println(i);
	            int j=0;
	            for(;j<pre.length() && j<curr.length();j++){
	                if(pre.charAt(j)!= curr.charAt(j))
//	                	System.out.println(j);
	                    break;
	            }
	            pre= strs[i].substring(0,j);
	        }
	              
	        }
	        return pre;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] strs = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = scan.nextLine();
		}
		scan.close();
		String result=longestCommonPrefix(strs); 
		System.out.println(result);
	}

}
