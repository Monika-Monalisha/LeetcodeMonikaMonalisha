package EasyQuestions;

import java.util.Scanner;

public class SquareRoot {
	 public static int mySqrt(int x) {
		 int sqroot=0;
		 if(x==0|| x==1) return x;
		int i=1,temp=1;
		while(temp<=x){
			if (temp==x) sqroot=i;
				i++;
				temp=i*i;	
		}
		sqroot=i-1;
		return sqroot;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		scan.close();
		int x=mySqrt(n);
		System.out.println(x);

	}

}
