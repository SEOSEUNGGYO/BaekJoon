package BaekJoon;

import java.util.Scanner;

public class BaekJoon5_2 {

	static int d(int a) {
		int result = a;
		while(a!=0) {
			result = result + a%10;
			a = a/10;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] check = new int[10001];
		
		for(int i=1; i<10001; i++) {
			int n = d(i+1);
			if(n<10001) {
				check[n] = 1;
			}
		}
		for(int i=1; i<10001; i++) {
			
			if(check[i]!=1) {
				System.out.println(i);
			}
		}
		
		

		
		
	}
}
