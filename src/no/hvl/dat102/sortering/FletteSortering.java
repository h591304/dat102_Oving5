package no.hvl.dat102.sortering;

public class FletteSortering {

	public static <T extends Comparable<T>> void fletteSortering(T[] sort) {
		fletteSortering(sort, 0, sort.length-1);
		
	}
	private static <T extends Comparable<T>> void fletteSortering(T[] sort, int min, int max) {
		int mid;
		
		if(min < max) {
			mid = (min+max)/2;
			fletteSortering(sort, min, mid);
			fletteSortering(sort, mid + 1, max);
			flette(sort, min, mid, max);
		}
	}
	
	private static <T extends Comparable<T>> void flette(T[] sort, int first, int mid, int last) {
		int first1, first2, last1, last2;
		int i;
		T[] key;
		
		key = (T[])(new Comparable[sort.length]);
		first1 = first; 
		first2 = mid+1;
		last1 = mid;
		last2 = last;
		i = first1;
		
		while(first1 <= last1 && first2 <= last2) {
			if(sort[first1].compareTo(sort[first2]) < 0) {
				key[i] = sort[first1];
				first1++;
			}
			else {
				key[i] = sort[first2];
				first2++; 
			}
			i++;
		}
		while(first1 <= last1) {
			key[i] = sort[first1];
			first1++;
			i++;
		}
		while(first2 <= last2) {
			key[i] = sort[first2];
			first2++;
			i++;
		}
		for(i = first; i <= last; i++) {
			sort[i] = key[i];
		}
	}
}
