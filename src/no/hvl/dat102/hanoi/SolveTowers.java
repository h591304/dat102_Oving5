package no.hvl.dat102.hanoi;

import java.util.Scanner;
import java.time.*;

public class SolveTowers {
	
	public static void main(String[] args) {
		
		int antDisk1 = 26;
		TowersOfHanoi numberOfMoves26 = new TowersOfHanoi(antDisk1);
		Instant foerste = Instant.now();
		numberOfMoves26.solve();
		Instant siste = Instant.now();
		
		long tidBrukt = siste.getNano()-foerste.getNano();
		
		System.out.println("Antall disker = " + antDisk1);
		System.out.println("Tid før: " + foerste.getNano() + "\nTid etter: " + siste.getNano());
		System.out.println("Total tid brukt: " + tidBrukt + " nanosek!");
		System.out.println("");
		
		int antDisk2 = 30;
		TowersOfHanoi numberOfMoves30 = new TowersOfHanoi(antDisk2);
		Instant foerste1 = Instant.now();
		numberOfMoves30.solve();
		Instant siste1 = Instant.now();
		
		long tidBrukt1 = siste1.getNano()-foerste1.getNano();
		
		System.out.println("Antall disker = " + antDisk2);
		System.out.println("Tid før: " + foerste1.getNano() + "\nTid etter: " + siste1.getNano());
		System.out.println("Total tid brukt: " + tidBrukt1 + " nanosek!");
		System.out.println("");
		
		long tidsForskjell = tidBrukt1-tidBrukt;
		System.out.println("Tidsforskjell mellom 28 og 32 disker: " + tidsForskjell + " nanosek!");
		
	}

}
