package EasyQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result =new ArrayList<List<Integer>>();
		List<Integer> prev= new ArrayList<>(); 
		if (numRows<=0)
			return result;
		for(int i=1; i<=numRows;i++){
			List<Integer> row=new ArrayList<>();
			for(int j=0;j<i;j++){
				if(j==0 || j==i-1)
					row.add(1);
				else
					row.add(prev.get(j-1)+prev.get(j));				
			}
			prev=row;
			result.add(row);
		}
		return result;
		  
    }
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		 List<List<Integer>> result=generate(n);
		System.out.println(result);
	}

}
