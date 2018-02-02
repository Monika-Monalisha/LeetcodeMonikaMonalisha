package EasyQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static boolean isHappy(int n) {
		Set<Integer> result = new HashSet<>();
		int sum = 0;
		if (n == 1)
			return true;
		while (result.add(n)) {
			sum = 0;
			while (n > 0) {
				sum += (n % 10) * (n % 10);
				n /= 10;
			}
			if (sum == 1)
				return true;
			else
				n = sum;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		scan.close();
		boolean result = isHappy(n);
		System.out.println(result);
	}

}

//int digitSquareSum(int n) {
//    int sum = 0, tmp;
//    while (n) {
//        tmp = n % 10;
//        sum += tmp * tmp;
//        n /= 10;
//    }
//    return sum;
//}
//
//bool isHappy(int n) {
//    int slow, fast;
//    slow = fast = n;
//    do {
//        slow = digitSquareSum(slow);
//        fast = digitSquareSum(fast);
//        fast = digitSquareSum(fast);
//    } while(slow != fast);
//    if (slow == 1) return 1;
//    else return 0;
//}
