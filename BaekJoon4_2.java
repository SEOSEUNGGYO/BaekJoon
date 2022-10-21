package BaekJoon;

import java.util.Scanner;

public class BaekJoon4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] num = new int[10]; 
		int count = 10;
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
			num[i] = num[i]%42;
			
		}
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<10; j++) {
				if(num[i]==num[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
