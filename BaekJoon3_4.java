package BaekJoon;

import java.util.Scanner;

public class BaekJoon3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum = sum + a*b;
			
		}
		if(sum==X) {
			System.out.println(sum);
			System.out.println("Yes");
		}else {
			System.out.println(sum);
			System.out.println("No");
		}
	}
}
