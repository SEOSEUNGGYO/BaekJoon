package BaekJoon;

import java.util.Scanner;

public class BaekJoon4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] var = new String[num];
		
		
		for(int i=0; i<num; i++) {
			var[i] = sc.next();
			
			int count = 0;
			int sum = 0;
			for(int j=0; j<var[i].length(); j++) {
				if(var[i].charAt(j)=='O') {
					count = count + 1;
				}else {
					count = 0;
				}
				sum = sum + count;
			}
			System.out.println(sum);
		}
		
		
	}
}
