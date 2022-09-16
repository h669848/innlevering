package no.hvl.dat100;

import java.util.Scanner;

public class Trinnskatt {
	static long income = 0;
	static float trinn1 = 164100;
	static float trinn2 = 230951;
	static float trinn3 = 580651;
	static float trinn4 = 934051;
	static float sats1 = (float) 000.93;
	static float sats2 = (float) 00.241;
	static float sats3 = (float) 00.1152;
	static float sats4 = (float) 00.1452;
	
	
	public static void main(String[] args) {
		income = getIncome();
		System.out.println(trinnSkatt(findTrinn(income), income));
		
	}
	public static int findTrinn(long p) {
		int trinn=0;
		if(p<trinn1) {trinn = 0;}
		else if(p>=trinn1 && p<trinn2) {trinn = 1;}
		else if(p>=trinn2 && p<trinn3) {trinn = 2;}
		else if(p>=trinn3 && p<trinn4) {trinn = 3;}
		else if(p>=trinn4) {trinn = 4;}
		return trinn;
	}
	
	public static long getIncome() {
		Scanner sc = new Scanner(System.in);
		long income = 0;
		boolean finished = false;
		while(!finished) {
			income=sc.nextLong();
			if(income>0) {
				finished=true;
			}
		}
		return income;
	}
	
	public static float trinnSkatt(int t, float i) {
		float trinnSkatt = 0;
		if(t==0) {System.out.println("ingen trinnskatt");}
		else if(t==1) {trinnSkatt = i*sats1;}
		else if(t==2) {trinnSkatt = i*sats2;}
		else if(t==3) {trinnSkatt = i*sats3;}
		else if(t==4) {trinnSkatt = i*sats4;}
		return trinnSkatt;
	}
}
