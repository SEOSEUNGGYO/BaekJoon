package BaekJoon;

import java.util.Scanner;

public class BaekJoon6_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] R = new int[T];
		String[] S = new String[T];
		String[] str = new String[T];
		for(int i=0; i<T; i++) {
			R[i] = sc.nextInt();
			S[i] = sc.next();
		}
		//T==> 테스트 케이스
		//R[i] ==> 문자열 내의 각 문자 반복 횟수
		//S[i] = 문자열
		//str = 결과 문자열. str[0]에는 AAABBBCCC, str[1]에는 /////HHHHHTTTTTPPPPP
		
		//R[i]만큼 S[i]의 특정 문자열을 반복시키고 str에 저장하여야햠
		
		for(int i=0; i<T; i++) {
			str[i] = "";
			for(int k=0; k<S[i].length(); k++) {
				for(int j=0; j<R[i]; j++) {
					str[i] = str[i] + S[i].charAt(k);
				}
			}
			System.out.println(str[i]);
		}
	}

}
