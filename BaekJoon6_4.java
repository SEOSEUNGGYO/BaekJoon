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
		//T==> �׽�Ʈ ���̽�
		//R[i] ==> ���ڿ� ���� �� ���� �ݺ� Ƚ��
		//S[i] = ���ڿ�
		//str = ��� ���ڿ�. str[0]���� AAABBBCCC, str[1]���� /////HHHHHTTTTTPPPPP
		
		//R[i]��ŭ S[i]�� Ư�� ���ڿ��� �ݺ���Ű�� str�� �����Ͽ����t
		
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
