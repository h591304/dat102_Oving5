package no.hvl.dat102.soeking;

import java.util.Scanner;

public class BinarySearch {
	
	static int FINNES_IKKE = -1;
	
	public static <T extends Comparable<T>> int binarySearch(T[] dataTab, int min, int max, T element) {
		
		if(min > max) {
			return FINNES_IKKE;
		}
		
		int mid = (min + max) / 2;
		int resultat = element.compareTo(dataTab[mid]);
		
		if(resultat == 0) {
			return resultat;
		}
		
		else if(resultat < 0) {
			resultat = binarySearch(dataTab, min, mid-1, element);
		}
		else {
			resultat = binarySearch(dataTab, mid+1, max, element);
		}
			return resultat;
	}
	
	public static void main(String[] args) {
		
		Integer[] sortertTab = {2, 4, 5, 7, 8, 10, 12, 15, 18, 21, 23, 27, 29, 31};
		System.out.println("Returner 0 dersom 8 finnes i den sorterte tabellen og -1 hvis ikke: ");
		
		Integer element = Integer.valueOf(8);

		Integer resultat = binarySearch(sortertTab, 0, sortertTab.length-1, element);
		if(resultat == 0) {
			System.out.println("Element: " + element + " finnes!");
		}
		else {
			System.out.println("Element: " + element + " finnes ikke!");
		}
		
		//Samme med brukerinput for å sjekke hvilket som helst heltall finnes eller ikke
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Skriv inn et heltall: ");
		Integer inputElement = scnr.nextInt();
		
		Integer brukerResultat = binarySearch(sortertTab, 0, sortertTab.length-1, inputElement);
		if(brukerResultat == 0) {
			System.out.println("Element: " + inputElement + " finnes!");
		}
		else {
			System.out.println("Element: " + inputElement + " finnes ikke!");
		}
		scnr.close();

	}

}
