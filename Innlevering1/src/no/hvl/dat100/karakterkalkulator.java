package no.hvl.dat100;

import java.util.Scanner;

public class karakterkalkulator {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
				System.out.println("Input score");
				int s = 0;
				s = scoreInput();
				System.out.println(karakterConverter(s));
				
				
				
			} 
		
		

	}
	
	public static int scoreInput() {
		int score=0;
		int temp;
		boolean valid = false;

			while(!valid) {
			temp = in.nextInt();
			if (temp<100 && temp>0) {
				score = temp;
				valid=true;
			}
			else {System.out.println("Please enter a valid score");}
		
			}
		return score;
	}
	
	public static String karakterConverter(Integer c) {
		String karakter = null;
		if(c<=100 && c>=90) {karakter = "A";}
		else if (c<=89 && c>=80) {karakter = "B";}
		else if (c<=79 && c>=60) {karakter = "C";}
		else if (c<=59 && c>=50) {karakter = "D";}
		else if (c<=49 && c>=40) {karakter = "E";}
		else if (c<=39 && c>=0) {karakter = "F";}
		return karakter;
	}

}
