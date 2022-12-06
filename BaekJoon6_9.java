package BaekJoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] str = new String[N];
		int count = N;
		for(int i=0; i<N; i++) {
			str[i] = sc.next();
		}
		
		for(int i=0; i<N; i++) {
			boolean[] arr = new boolean[26];
			arr[(int)str[i].charAt(0)-97] =true;
			
			for(int j=1; j<str[i].length(); j++) {
				char ch = str[i].charAt(j);
				if(ch == str[i].charAt(j-1)) {
					continue;
				}
				else if(arr[(int)ch-97]==true) {
					count--;
					break;
				}else {
					arr[(int)ch-97]=true;
				}
			}
		}
		System.out.println(count);
	}
}
