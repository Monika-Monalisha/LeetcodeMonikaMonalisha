package EasyQuestions;

import java.util.Scanner;

public class FirstUniqueCharacterinaString {
	public static int firstUniqChar(String s) {
        int index[]= new int [26];
        for(int i=0;i<s.length();i++){
         index[s.charAt(i)-'a']++; 
        }
        for(int j=0;j<s.length();j++){
        	if (index[s.charAt(j)-'a']==1)
              return j;  
        } 
       return -1; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int result=firstUniqChar(s);
		System.out.println(result);
	}

}
