package no.hvl.dat100;
import java.util.Scanner;

public class vekslepenger {

	public static void main(String[] args) {
		int price;
		int change;
		int counter=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input pris");
		price = in.nextInt();
		
		System.out.println("Input currency amount");
		change = in.nextInt();
		
		int rest = change-=price;
		
		while(rest>10) {
			counter++;
			rest-=10;
		}
		
		System.out.println("Your change is: "+counter+" tiere og: "+rest+" enere");
		

	

	}


}
