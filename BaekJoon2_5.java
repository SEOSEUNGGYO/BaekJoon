package BaekJoon;

import java.util.Scanner;

public class BaekJoon2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute-45 < 0) {
			if(hour==0) {
				hour = hour-1+24;
				minute = minute-45+60;
				System.out.print(hour+" ");
				System.out.println(minute+" ");
			}else if(hour!=0) {
				hour = hour-1;
				minute = minute-45+60;
				System.out.print(hour+" ");
				System.out.println(minute+" ");
			}
		}else {
			minute = minute-45;
			System.out.print(hour+" ");
			System.out.println(minute+" ");
		}
		
		
	}
}
