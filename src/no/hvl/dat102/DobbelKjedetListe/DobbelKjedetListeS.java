package no.hvl.dat102.DobbelKjedetListe;

import no.hvl.dat102.DobbelNode.DobbelNode;

public class DobbelKjedetListeS<T extends Comparable<T>> {

	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;
	
	//Oppgave 2a
	public DobbelKjedetListeS(T minVerdi, T maksVerdi) {
		
//		DobbelNode<T> nyFoerste = new DobbelNode<T>(minVerdi);
//		foerste = nyFoerste;
//		
//		DobbelNode<T> nySiste = new DobbelNode<T>();
//		nySiste.setElement(maksVerdi);
//		siste = nySiste;
//		
//		antall = 0;
		
		foerste = new DobbelNode<T>(minVerdi);
		siste = new DobbelNode<T>(maksVerdi);
		
		foerste.setNeste(siste);
		siste.setForrige(foerste);
		
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
		DobbelNode<T> nyNode = new DobbelNode<T>(element);
		DobbelNode<T> aktuellNode = foerste.getNeste();
		
//		if(aktuellNode == null) {
//			aktuellNode = nyNode;
//			antall++;
//			lagtTil = true;
//		}
//		else {
		while(element.compareTo(aktuellNode.getElement()) > 0) {
			aktuellNode = aktuellNode.getNeste();
		}
		nyNode.setNeste(aktuellNode);
		nyNode.setForrige(aktuellNode.getForrige());
		aktuellNode.getForrige().setNeste(nyNode);
		aktuellNode.setForrige(nyNode);
		antall++;
//		}
//		
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
		
		if(antall > 0) {
		
			DobbelNode<T> aktuellNode = foerste.getNeste();
			while(!fjernet && aktuellNode.getNeste() != null) {
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
		}
		return resultat;
	}
	
	//Oppgave 2e
	public void visListe() {
		DobbelNode<T> aktuellNode = foerste;
		
		System.out.print("{ ");
		while(aktuellNode != null) {
			System.out.print(aktuellNode.getElement() + " ");
			aktuellNode = aktuellNode.getNeste();
		}
		System.out.println(" }");
	}
	
	public void listeInformasjon() {
		DobbelNode<T> aktuellNode = foerste;
		int antElement = 0;
		
		while(aktuellNode != null) {
			aktuellNode = aktuellNode.getNeste();
			antElement++;
		}
		System.out.println("");
		System.out.println("Antall elementer i listen: " + antElement);
		System.out.println("Første element: " + foerste.getElement());
		System.out.println("Siste element: " + siste.getElement());
	}
}
