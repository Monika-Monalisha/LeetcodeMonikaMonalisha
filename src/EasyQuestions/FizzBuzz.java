package EasyQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
public static List<String> fizzBuzz(int n) {
	List<String> list= new ArrayList<>(); 
	for(int i=1;i<=n;i++){
		if(i%3==0 && i%5==0)
			list.add("FizzBuzz");
		else if(i%5==0)
			list.add("Buzz");
		else if(i%3==0)
			list.add("Fizz");
		else
			list.add(String.valueOf(i));	
	}
     return list;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		scan.close();
		List<String> result = fizzBuzz(n);
		System.out.println(result);
	}

}
