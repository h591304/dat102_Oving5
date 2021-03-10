package no.hvl.dat102.sortering;

public class BobleSortering {

	public static <T extends Comparable<T>> void bobleSortering(T[] sort) {
		T key;
		int i, j;
		
		for(i = sort.length; i >= 0; i--) {
			for(j = 0; j < i-1; j++) {
				if(sort[j].compareTo(sort[j+1]) > 0) {
					
					//Bytter elementene i listen for sortering
					byttElement(sort, j, j+1);
				}
			}
		}
	}
	
	private static <T extends Comparable<T>> void byttElement(T[] sort, int i, int j) {
		T key = sort[i];
		sort[i] = sort[j];
		sort[j] = key;
	}
}
