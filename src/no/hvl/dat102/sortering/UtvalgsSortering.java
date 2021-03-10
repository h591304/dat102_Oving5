package no.hvl.dat102.sortering;

public class UtvalgsSortering {

	public static <T extends Comparable<T>> void utvalgsSortering(T[] sort) {
		T key;
		int i, min;
		
		for(i = 0; i < sort.length; i++) {
			min = i;
			for(int scan = i + 1; scan < sort.length; scan++) {
				if(sort[scan].compareTo(sort[min]) < 0) {
					min = scan;
				}
			}
			//Bytter elementene i listen for sortering
			byttElement(sort, min, i);
		}
	}
	private static <T extends Comparable<T>> void byttElement(T[] sort, int i, int j) {
		T key = sort[i];
		sort[i] = sort[j];
		sort[j] = key;
	}
}
