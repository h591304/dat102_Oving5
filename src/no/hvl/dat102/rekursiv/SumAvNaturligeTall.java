package no.hvl.dat102.rekursiv;

public class SumAvNaturligeTall {
	
	public static void main(String[] args) {
		
		System.out.println("S100 er: " + SumAvNaturligeTall.sum(100));
		SumAvNaturligeTall.tallFolge(10);
	}
	
	//Oppgave 1a
	public static int sum(int n) {
//		if(n == 1) {		//ikke rekursiv løsning
//			return 1;
//		}	
//		else {
//			int Sn = 1;
//			for(int i = 2; i <= n; i++) {
//				Sn += i;
//			}
//			return Sn;
//		}
		
		int Sn = 0;	//rekursiv løsning
		if(n == 1) {
			Sn = 1;
		}
		else {
			Sn = n + sum(n-1);
		}
		return Sn;
	}
	
	//Oppgave 1b
	public static int tallFolge(int n) {
		int an;
//		int a0 = 2;
//		int a1 = 5;
//		
//		//ikke rekursiv metode
//		for(int i = 0; i < n; i++) {	
//			if(i == 0) {
//				an = 2;
//			}
//			else if(i == 1) {
//				an = 5;
//				System.out.print(" + ");
//			}
//			else if(i > 1) {
//				an = (5*(a1)) - (6*(a0)) + 2;
//				System.out.print(" + ");
//			}
//			else if(i < 0) {
//				throw new java.lang.Error("Kun naturlige tall!!!");
//			}
//			a0 = a1;
//			a1 = an;
//			return an;
//		}
		
		//rekursiv metode
		if(n == 0) {	//basis mengde
			an = 2;
		}
		else if(n == 1) {	//basis mengde
			an = 5;
		}
		else {
			an = 5*tallFolge(n-1) - 6*tallFolge(n-2) + 2; 
		}
		return an;
	}
}
