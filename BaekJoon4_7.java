
package BaekJoon;

import java.util.Scanner;

public class BaekJoon4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int var = sc.nextInt();
		float max = 0;
		float sum = 0;
		float[] num = new float[var];
		for(int i=0; i<var; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0; i<var; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}		
		
		for(int i=0; i<var; i++) {
			
			sum = sum + (num[i]/max)*100;
			
		}
		System.out.println(sum/var);
		
	}
}