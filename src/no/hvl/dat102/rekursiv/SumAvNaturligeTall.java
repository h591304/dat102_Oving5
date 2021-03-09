package no.hvl.dat102.rekursiv;

public class SumAvNaturligeTall {
	
	public static void main(String[] args) {
		
		System.out.println("S100 er: " + SumAvNaturligeTall.sum(100));
		SumAvNaturligeTall.tallFolge(10);
	}
	
	//Oppgave 1a
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}	
		else {
			int Sn = 1;
			for(int i = 2; i <= n; i++) {
				Sn += i;
			}
			return Sn;
		}
	}
	
	//Oppgave 1b
	public static void tallFolge(int n) {
		int an = 5*(n-1) - 6*(n-2) + 2;
		int anMin1 = 5;
		int anMin2 = 2;
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				an = 2;
			}
			else if(i == 1) {
				an = 5;
				System.out.print(" + ");
			}
			else if(i > 1) {
				an = (5*(anMin1)) - (6*(anMin2)) + 2;
				System.out.print(" + ");
			}
			else if(i < 0) {
				throw new java.lang.Error("Kun naturlige tall!!!");
			}
			anMin2 = anMin1;
			anMin1 = an;
			System.out.print(an);
		}
	}
}
