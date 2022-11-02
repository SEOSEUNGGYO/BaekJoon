package BaekJoon;

import java.util.Scanner;

public class BaekJoon4_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		double[] avg = new double[testCase];
		int sum=0;
		double count = 0;
		int[] score = null;
		for(int i=0; i<testCase; i++) {
			int num = sc.nextInt();
			score = new int[num];
			sum = 0;
			
			
			for(int j=0; j<num; j++) {
				
				score[j] = sc.nextInt();
				sum = sum + score[j];
				
				
			}
			avg[i] = sum/num;
			//System.out.println(avg[i]);
			count = 0;
			for(int k=0; k<num; k++) {
				if(score[k]>avg[i]) {
					count++;
				}
			}
			//double result = 0;
			//result = Math.round((double)count/(double)num*100*1000)/1000.0;
			System.out.printf("%.3f%%\n",(count/num)*100);
		}
		
		
	}
}
