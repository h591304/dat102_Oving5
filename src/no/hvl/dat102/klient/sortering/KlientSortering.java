package no.hvl.dat102.klient.sortering;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import no.hvl.dat102.sortering.SorteringVedInnsetting;
import no.hvl.dat102.sortering.UtvalgsSortering;
import no.hvl.dat102.sortering.BobleSortering;
import no.hvl.dat102.sortering.KvikkSortering;
import no.hvl.dat102.sortering.FletteSortering;

public class KlientSortering {

	public static void main(String[] args) {
		Integer[] testTab = {9, 6, 4, 1, 2, 10, 0, 7, 8, 5};
		
		SorteringVedInnsetting.sorteringVedInnsetting(testTab);
		System.out.println("Sortering ved innsetting: \t" + Arrays.toString(testTab));
		
		UtvalgsSortering.utvalgsSortering(testTab);
		System.out.println("Sortering ved utvalg: \t\t" + Arrays.toString(testTab));
		
		BobleSortering.bobleSortering(testTab);
		System.out.println("Boblesortering: \t\t" + Arrays.toString(testTab));
		
		KvikkSortering.kvikkSortering(testTab);
		System.out.println("Kvikksortering: \t\t" + Arrays.toString(testTab));
		
		FletteSortering.fletteSortering(testTab);
		System.out.println("Flettesortering: \t\t" + Arrays.toString(testTab));

		//Oppgae 5a - tidsmåling
		System.out.println("\n");
		System.out.println("MÅLING AV UTFØRINGSTIDER: ");
		System.out.print("\n");
		Random tilfeldig = new Random();
		int n = 16000;
		int antall = 10;
		
		Integer[][] a = new Integer[antall][n];
		
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antall; i++) {
			for (int j = 0; j < n; j++){
				a[i][j] = tilfeldig.nextInt();
				}
			}
		
		long tidFoer, tidEtter;
		long tidBrukt, gjenTid;
		int mil = 1000000;
		
		//Måling for Sortering ved innsetting
		tidFoer = System.currentTimeMillis(); // tiden før sorteringen
		for (int i = 0; i < antall; i++){
			SorteringVedInnsetting.sorteringVedInnsetting((a[i])); // Måling for sortering ved innsetting
			}	// slutt tidsmåling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("Sortering ved Innsetting: ");
		System.out.println("Før: " + (tidFoer) + " Etter: " + (tidEtter));
		System.out.println("Antall målinger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " nanosekunder!\n");
		
		//Måling for UtvalgsSortering
		tidFoer = System.currentTimeMillis(); // tiden før sorteringen
		for (int i = 0; i < antall; i++){
			UtvalgsSortering.utvalgsSortering((a[i])); // Måling for utvalgssortering
			}	// slutt tidsmåling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("Utvalgssortering: ");
		System.out.println("Før: " + (tidFoer) + " Etter: " + (tidEtter));
		System.out.println("Antall målinger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " nanosekunder!\n");
		
		//Måling for BobleSortering
		tidFoer = System.currentTimeMillis(); // tiden før sorteringen
		for (int i = 0; i < antall; i++){
			BobleSortering.bobleSortering((a[i])); // Måling for boblesortering
			}	// slutt tidsmåling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("Boblesortering: ");
		System.out.println("Før: " + (tidFoer) + " Etter: " + (tidEtter));
		System.out.println("Antall målinger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " nanosekunder!\n");
		
		//Måling for KvikkSortering
		tidFoer = System.currentTimeMillis(); // tiden før sorteringen
		for (int i = 0; i < antall; i++){
			KvikkSortering.kvikkSortering((a[i])); // Måling for kvikksortering
			}	// slutt tidsmåling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("Kvikksortering: ");
		System.out.println("Før: " + (tidFoer) + " Etter: " + (tidEtter));
		System.out.println("Antall målinger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " nanosekunder!\n");
		
		// Måling for FletteSortering
		tidFoer = System.currentTimeMillis(); // tiden før sorteringen
		for (int i = 0; i < antall; i++){
			FletteSortering.fletteSortering((a[i])); // Måling for flettesortering
			}	// slutt tidsmåling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("Flettesortering: ");
		System.out.println("Før: " + (tidFoer) + " Etter: " + (tidEtter));
		System.out.println("Antall målinger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " nanosekunder!\n");
	}

}
