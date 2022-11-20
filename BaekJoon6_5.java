package BaekJoon;

import java.util.Scanner;

public class BaekJoon6_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase();
		
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			
			arr[str.charAt(i)-'A'] = arr[str.charAt(i)-'A']+1;
		}
		int max = 0;
		char answer = ' ';
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				answer = (char)(i+'A');
			}else if(max==arr[i]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}

}
