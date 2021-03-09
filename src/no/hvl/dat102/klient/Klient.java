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
	
	int tallListe[] = {0, 1, 2, 3, 4};
	
	DobbelKjedetListeS<Integer> liste = new DobbelKjedetListeS<Integer>(0, 4);
	
	for(int i = 0; i < tallListe.length; i++) {
		liste.leggTil(tallListe[i]);
	}
	
//	//Opprinnelig liste
//	
//	System.out.print("Opprinnelig liste: ");
//	liste.visListe();
		
	/*
	 * fins(T element) {...}
	 * 
	 * Sjekker om et bestemt element finnes i listen
	 * 
	 **/
	
	Integer element = 0;
	
	System.out.println("Finnes elementet " + element + "?");
	boolean fins = liste.fins(element);
	if(!fins) {
		System.out.println("Elementet " + element + " fins ikke!");
	}
	else {
		System.out.println("Elementet " + element + " fins!");
	}
	
	
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
	Integer el2 = 2;
	Integer el3 = 3;
	Integer el4 = 4;
	Integer el5 = 5;
	
	System.out.println("Fjerner element: " + el1);
	liste.fjern(el1);
	liste.visListe();
	System.out.print("\n\n\n");
	
	System.out.println("Fjerner element: " + el2);
	liste.fjern(el2);
	liste.visListe();
	System.out.print("\n\n\n");
	
	System.out.println("Fjerner element: " + el3);
	liste.fjern(el3);
	liste.visListe();
	System.out.print("\n\n\n");
	
	System.out.println("Fjerner element: " + el4);
	liste.fjern(el4);
	liste.visListe();
	System.out.print("\n\n\n");
	
	System.out.println("Fjerner element: " + el5);
	liste.fjern(el5);
	liste.visListe();
	System.out.print("\n\n\n");
	
	
	/*
	 * visListe() {...}
	 * 
	 * viser alle elementer i listen
	 * 
	 **/
	
	liste.visListe();
	
	
		
	}

}
