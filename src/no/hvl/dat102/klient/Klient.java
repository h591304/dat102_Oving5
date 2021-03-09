package no.hvl.dat102.klient;

import no.hvl.dat102.DobbelKjedetListe.*;

//Oppgave 2f

public class Klient {

/**
 * 
 * Lager et klientprogram for å teste metodene fra DobbeltKjedetListeS-klassen
 * - fins(T element) {...}
 * - leggTil(T element) {...}
 * - fjern(T element) {...}
 * - visListe() {...}
 * 
 * */
	
	public static void main(String[] args) {
			
	/*
	 * lagtTil(T element) {...}
	 * 
	 * Legger til et bestemt element til listen
	 * 
	 **/	
	
	int min = 0;
	int max = 7;
	
	int tallListe[] = {0, 1, 2, 4, 6};
	
	DobbelKjedetListeS<Integer> liste = new DobbelKjedetListeS<Integer>(min, max);
	
	for(int i = 0; i < tallListe.length; i++) {
		liste.leggTil(tallListe[i]);
	}
	
	//Opprinnelig liste
	System.out.print("Opprinnelig liste: ");
	liste.visListe();
	liste.listeInformasjon();
	System.out.println("\n");
		
	/*
	 * fins(T element) {...}
	 * 
	 * Sjekker om et bestemt element finnes i listen
	 * 
	 **/
	
	Integer element = 6;
	
	System.out.println("Finnes elementet " + element + " ?");
	boolean fins = liste.fins(element);
	if(!fins) {
		System.out.println("Elementet " + element + " fins ikke!");
	}
	else {
		System.out.println("Elementet " + element + " fins!");
	}
	System.out.println("\n");
	
	
//	for(int i = 0; i < tallListe.length; i++) {
//		if(liste.fins(tallListe[i])) {
//			System.out.println("Elementet: " + tallListe[i] + " fins i listen!");
//		}
//		else {
//			System.out.println("Elementet: " + tallListe[i] + " fins ikke i listen!");
//		}
//	}
	
		
	/*
	 * fjern(T element) {...}
	 * 
	 * fjerner et bestemt element fra listen
	 * 
	 **/	
	
	Integer el1 = 1;
	Integer el2 = 3;
	Integer el3 = 6;
	
	System.out.println("Fjerner element: " + el1);
	liste.fjern(el1);
	System.out.print("Oppdatert liste: ");
	liste.visListe();
	System.out.println("\n");
	
	System.out.println("Fjerner element: " + el2);
	liste.fjern(el2);
	System.out.print("Oppdatert liste: ");
	liste.visListe();
	System.out.println("\n");
	
	System.out.println("Fjerner element: " + el3);
	liste.fjern(el3);
	System.out.print("Oppdatert liste: ");
	liste.visListe();
		
	}

}
