package test;

import java.util.Scanner;

public class Exam_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word[] = sc.next().split("");
		int check[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		for (int i = 0; i < word.length; i++) {
			switch (word[i]) {
			case "a":
				if(check[0] != -1) {
					break;
				}
				check[0] = i;
				break;
			case "b":
				if(check[1] != -1) {
					break;
				}
				check[1] = i;
				break;
			case "c":
				if(check[2] != -1) {
					break;
				}
				check[2] = i;
				break;
			case "d":
				if(check[3] != -1) {
					break;
				}
				check[3] = i;
				break;
			case "e":
				if(check[4] != -1) {
					break;
				}
				check[4] = i;
				break;
			case "f":
				if(check[5] != -1) {
					break;
				}
				check[5] = i;
				break;
			case "g":
				if(check[6] != -1) {
					break;
				}
				check[6] = i;
				break;
			case "h":
				if(check[7] != -1) {
					break;
				}
				check[7] = i;
				break;
			case "i":
				if(check[8] != -1) {
					break;
				}
				check[8] = i;
				break;
			case "j":
				if(check[9] != -1) {
					break;
				}
				check[9] = i;
				break;
			case "k":
				if(check[10] != -1) {
					break;
				}
				check[10] = i;
				break;
			case "l":
				if(check[11] != -1) {
					break;
				}
				check[11] = i;
				break;
			case "m":
				if(check[12] != -1) {
					break;
				}
				check[12] = i;
				break;
			case "n":
				if(check[13] != -1) {
					break;
				}
				check[13] = i;
				break;
			case "o":
				if(check[14] != -1) {
					break;
				}
				check[14] = i;
				break;
			case "p":
				if(check[15] != -1) {
					break;
				}
				check[15] = i;
				break;
			case "q":
				if(check[16] != -1) {
					break;
				}
				check[16] = i;
				break;
			case "r":
				if(check[17] != -1) {
					break;
				}
				check[17] = i;
				break;
			case "s":
				if(check[18] != -1) {
					break;
				}
				check[18] = i;
				break;
			case "t":
				if(check[19] != -1) {
					break;
				}
				check[19] = i;
				break;
			case "u":
				if(check[20] != -1) {
					break;
				}
				check[20] = i;
				break;
			case "v":
				if(check[21] != -1) {
					break;
				}
				check[21] = i;
				break;
			case "w":
				if(check[22] != -1) {
					break;
				}
				check[22] = i;
				break;
			case "x":
				if(check[23] != -1) {
					break;
				}
				check[23] = i;
				break;
			case "y":
				if(check[24] != -1) {
					break;
				}
				check[24] = i;
				break;
			case "z":
				if(check[25] != -1) {
					break;
				}
				check[25] = i;
				break;
			default:
				break;
			}
		}
		for (int j = 0; j < check.length; j++) {
			System.out.print(check[j] + " ");
		}
	}

}
