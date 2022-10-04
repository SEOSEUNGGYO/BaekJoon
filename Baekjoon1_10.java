package BaekJoon;

import java.util.Scanner;



//두 수를 입력받고 합을 출력하는 문제
public class Baekjoon1_10 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
				
		
		king = king - sc.nextInt();
		queen = queen - sc.nextInt();
		rook = rook - sc.nextInt();
		bishop = bishop - sc.nextInt();
		knight = knight - sc.nextInt();
		pawn = pawn - sc.nextInt();
		
		
		System.out.print(king+" ");
		System.out.print(queen+" ");
		System.out.print(rook+" ");
		System.out.print(bishop+" ");
		System.out.print(knight+" ");
		System.out.print(pawn+" ");
		
		
	}

}
