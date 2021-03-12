package no.hvl.dat102.sortering;

public class SorteringVedInnsetting {

	public static <T extends Comparable<T>> void sorteringVedInnsetting(T[] sort) {
		T key;
		int position;
		
		for(int i = 1; i < sort.length; i++) {
			
			key = sort[i];
			position = i;
			while(position > 0 && sort[position-1].compareTo(key) > 0){
				sort[position] = sort[position-1];
				position--;
			}
			sort[position] = key;
		}
	}
	
}
