package BaekJoon;

import java.util.Scanner;

public class BaekJoon2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int takenMin = sc.nextInt();
		
		
		if(minute+takenMin>=60 && minute+takenMin<120) {
			hour=hour+1;
			minute=minute+takenMin-60;
		}else if(minute+takenMin>=120) {
			hour=hour+2;
			minute=minute+takenMin-120;
		}
		if(hour>=24) {
			hour=hour-24;
		}
		
		System.out.println(hour+" "+minute);
		
		/*
	 	int hour;
		int min;
		int plus_min;
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		min = sc.nextInt();
		plus_min = sc.nextInt();

		min = min + plus_min;
		if(min>=60) {
			hour = hour + (min/60);
			min = min % 60;
		}
    	if(hour>=24) {
			hour = hour - 24;
		}
		System.out.println(hour+" "+min);
		*/
		
		
	}
}
