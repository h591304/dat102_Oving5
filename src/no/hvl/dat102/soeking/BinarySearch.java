package no.hvl.dat102.soeking;

import java.util.Scanner;

public class BinarySearch {
	
	/**
	 * Her brukes binærsøking for å søke etter elementet 8 i tabellen øverst i main-metoden
	 * 
	 * Ved bruk av binærsøking i sorterte tabeller kan man finne hvilke som helst elementer i tobellen
	 * mer effektivt enn lineærsøking ved å finne midtpunktet, ((min-index)+(max-index))/2, så fortsette
	 * å eliminere store deler av søkingsområde til man finner elementet.
	 * */
	
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
		
		Integer[] sortertTab = {2, 4, 5, 7, 8, 10, 12, 15, 18, 21, 23, 27, 29, 30, 31};
		System.out.println("Returner 0 dersom 8 finnes i den sorterte tabellen og -1 hvis ikke: ");
		
		//Sjekker at element 8 finnes i tabellen
		Integer elFinnes = Integer.valueOf(8);

		Integer resultat1 = binarySearch(sortertTab, 0, sortertTab.length-1, elFinnes);
		if(resultat1 == 0) {
			System.out.println("Element: " + elFinnes + " finnes!");
		}
		else {
			System.out.println("Element: " + elFinnes + " finnes ikke!");
		}
		System.out.println("\n");
		
		//Sjekker at element 16 ikke finnes i tabellen
		Integer elFinnesIkke = Integer.valueOf(16);

		Integer resultat2 = binarySearch(sortertTab, 0, sortertTab.length-1, elFinnesIkke);
		if(resultat2 == 0) {
			System.out.println("Element: " + elFinnesIkke + " finnes!");
		}
		else {
			System.out.println("Element: " + elFinnesIkke + " finnes ikke!");
		}
		System.out.println("\n");
		
		//Sjekker at dersom min er større en maks, blir -1 returnert ->
		Integer feilResultat = binarySearch(sortertTab, sortertTab.length-1, 0, 8);
		System.out.println("Denne skal returnere -1: ");
		System.out.println(feilResultat);
		System.out.println("\n");
		
		//Sjekker med hvilken som helst brukerinput(int) for å sjekke hvilke heltall
		//som finnes i tabellen finnes eller ikke
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
