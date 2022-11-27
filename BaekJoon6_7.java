package BaekJoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		StringBuffer sb1 = new StringBuffer(A);
		StringBuffer sb2 = new StringBuffer(B);
		String revA = sb1.reverse().toString();
		String revB = sb2.reverse().toString();
		
		System.out.println(revA);
		System.out.println(revB);
		
		if(Integer.parseInt(revA)>Integer.parseInt(revB)) {
			System.out.println(revA);
		}else {
			System.out.println(revB);
		}
		
	}
}
