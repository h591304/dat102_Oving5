package no.hvl.dat102.DobbelKjedetListe;

import no.hvl.dat102.DobbelNode.DobbelNode;

public class DobbelKjedetListeS<T extends Comparable<T>> {

	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;
	
	//Oppgave 2a
	public DobbelKjedetListeS(T minVerdi, T maksVerdi) {
		
		DobbelNode<T> nyFoerste = new DobbelNode<T>(minVerdi);
		foerste = nyFoerste;
		
		DobbelNode<T> nySiste = new DobbelNode<T>();
		nySiste.setElement(maksVerdi);
		siste = nySiste;
		
		antall = 0;
	}
	
	//Oppgave 2b
	public boolean fins(T element) {
		
		boolean fins = false;
		DobbelNode<T> aktuellNode = foerste.getNeste();
		
		while((aktuellNode != null) && element.compareTo(aktuellNode.getElement()) > 0) {
			aktuellNode = aktuellNode.getNeste();
		}
		if(aktuellNode != null) {
			if(element.compareTo(aktuellNode.getElement()) == 0)	
				fins = true;
		}
		
//		while(fins && foerste != null) {
//			if(element.equals(foerste.getElement())) {
//				fins = true;
//				break;
//			}
//			else {
//				aktuellNode = foerste.getNeste();
//				 foerste = aktuellNode;
//			}
//		}
		return fins;
		
	}
	
	//Oppgave 2c
	public void leggTil(T element) {
		boolean lagtTil = false;
		DobbelNode<T> nyNode = new DobbelNode<T>(element);
		DobbelNode<T> aktuellNode = foerste.getNeste();
		
		if(aktuellNode == null) {
			aktuellNode = nyNode;
			antall++;
			lagtTil = true;
		}
		else {
			while(element.compareTo(aktuellNode.getElement()) > 0 && lagtTil) {
				aktuellNode = aktuellNode.getNeste();
			}
			nyNode.setNeste(aktuellNode);
			nyNode.setForrige(aktuellNode.getForrige());
			aktuellNode.getForrige().setNeste(nyNode);
			aktuellNode.setNeste(nyNode);
			antall++;
			lagtTil = true;
		}
		
//		while(lagtTil) {
//			if(foerste != null) {
//				aktuellNode = foerste.getNeste();
//			}
//			else {
//				antall++;
//				aktuellNode.setElement(element);
//				lagtTil = true;
//			}
//		}
	}
	
	//Oppgave 2d
	public T fjern(T element) {
		T resultat = null;
		boolean fjernet = false;
		DobbelNode<T> aktuellNode = foerste.getNeste();
		
		while(fjernet && aktuellNode.getElement() != null) {
			if(element.compareTo(aktuellNode.getElement()) == 0) {
				resultat = aktuellNode.getElement();
				aktuellNode.getForrige().setNeste(aktuellNode.getNeste());
				aktuellNode.getNeste().setForrige(aktuellNode.getForrige());
				antall--;
				fjernet = true;
				
			}
			else {
				aktuellNode = aktuellNode.getNeste();
			}
		}
		
		return resultat;
	}
	
	//Oppgave 2e
	public void visListe() {
		DobbelNode<T> aktuellNode = foerste;
		
		while(aktuellNode != null) {
			System.out.print(aktuellNode.getElement() + " ");
			aktuellNode = aktuellNode.getNeste();
		}
		System.out.println("");
		System.out.println("Første element: " + foerste.getElement() + "\nSiste element: " + siste.getElement());
	}
}
