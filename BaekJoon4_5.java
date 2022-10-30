package BaekJoon;

import java.util.Scanner;

public class BaekJoon4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] num = new int[31];
		for(int i=0; i<28; i++) {
			int var = sc.nextInt();
			num[var] = 1;
		}
		for(int i=0; i<30; i++) {
			if(num[i+1]!=1) {
				System.out.println(i+1);
			}
		}
		
	}
}
