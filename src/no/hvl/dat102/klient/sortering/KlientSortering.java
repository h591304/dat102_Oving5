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
		
		Random tilfeldig = new Random();
		int n = 32000;
		int antall = 10;
		
		Integer[][] a = new Integer[antall][n];
		
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antall; i++) {
			for (int j = 0; j < n; j++){
				a[i][j] = tilfeldig.nextInt();
				}
			}
		
		Instant tidFoer = Instant.now(); // tiden før sorteringen
		
		// start tidsmåling av alle sorteringsvariantene
		for (int i = 0; i < antall; i++){
//			SorteringVedInnsetting.sorteringVedInnsetting((a[i]));
//			UtvalgsSortering.utvalgsSortering((a[i]));
//			BobleSortering.bobleSortering((a[i]));
//			FletteSortering.fletteSortering((a[i]));
			KvikkSortering.kvikkSortering((a[i])); // blir ein eindimensjonal tabell
			}        
		// slutt tidsmåling
		
		Instant tidEtter = Instant.now();
		long tidBrukt = tidEtter.getNano() - tidFoer.getNano();
		Duration tid = Duration.between(tidFoer, tidEtter).dividedBy(antall);
		
		double fn1 = java.lang.Math.pow(n, 2), Tn1 = fn1;
		double fn2 = n * java.lang.Math.log(n), Tn2 = fn2;
		
		System.out.println("Før: " + tidFoer.getNano() + " Etter: " + tidEtter.getNano());
		System.out.println("Antall målinger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + tid.getNano());
		System.out.println("Teoretiske tid(T(n)) = " + Tn1 + " eller " + Tn2);
		
	}

}
