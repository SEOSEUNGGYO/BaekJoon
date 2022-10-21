package BaekJoon;

import java.util.Scanner;

public class BaekJoon4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] num = new int[9]; 
		
		for(int i=0; i<9; i++) {
			num[i] = sc.nextInt();
		}
		int max = num[0];
		int val = 0;
		for(int i=1; i<9; i++) {
			if(max<num[i]) {
				val = i;
				max = num[i];
			}
		}
		
		
		System.out.println(max);
		System.out.println(val+1);
	}

}
