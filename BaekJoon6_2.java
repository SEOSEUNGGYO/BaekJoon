package BaekJoon;

import java.util.Scanner;

public class BaekJoon6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		String str = sc.next();
		
		for(int i=0; i<N; i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
		
	}

}
