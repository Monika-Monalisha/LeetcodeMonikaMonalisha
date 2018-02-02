package EasyQuestions;

import java.util.Scanner;

public class ValidAnagram {
public static boolean isAnagram(String s, String t) {
	/* here we are assuming that the string contains only alphabets that is A-Z,a-z
	 * Otherwise the total character number is 128 */
	 int index[]= new int [26];
		if(s.length()!=t.length()) return false;
		for(int i=0;i<s.length();i++){
			index[s.charAt(i)-'a']++;
	        index[t.charAt(i)-'a']--;
		}
		for(int j: index){
			if(j!=0)
				return false;
		}
		return true;            
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s = scan.nextLine();
		String t= scan.nextLine();
		scan.close();
		boolean result=isAnagram(s,t);
		System.out.println(result);
		

	}

}
