package no.hvl.dat102.sortering;

import java.util.Arrays;

public class Sortering {
	
	public static void main(String[] args) {
		Integer[] testTabInnsetting = {23, 19, 42, 1, 2};
		Integer[] testTabUtvalg = {28, 8, 72, 105, 7};
		Integer[] testTabBoble = {12, 32, 23, 46, 9};
		Integer[] testTabKvikk = {39, 54, 43, 98, 14};
		Integer[] testTabFlette = {43, 40, 76, 34, 45};
		
		sorteringVedInnsetting(testTabInnsetting);
		System.out.println("Sortering ved innsetting: " + Arrays.toString(testTabInnsetting));
		
		utvalgsSortering(testTabUtvalg);
		System.out.println("Sortering ved utvalg: " + Arrays.toString(testTabUtvalg));
		
		bobleSortering(testTabBoble);
		System.out.println("Boblesortering: " + Arrays.toString(testTabBoble));
		
		kvikkSortering(testTabKvikk);
		System.out.println("Kvikksortering: " + Arrays.toString(testTabKvikk));
		
		fletteSortering(testTabFlette);
		System.out.println("Flettesortering: " + Arrays.toString(testTabFlette));
	}
	
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
	
	public static <T extends Comparable<T>> void kvikkSortering(T[] sort) {
		kvikkSortering(sort, 0, sort.length-1);
	}
	
	private static <T extends Comparable<T>> void kvikkSortering(T[] sort, int min, int max) {
		if(min < max) {
			int partition = findPartition(sort, min, max);
			kvikkSortering(sort, min, partition -1);
			kvikkSortering(sort, partition + 1, max);
		}
	}
	
	private static <T extends Comparable<T>> int findPartition(T[] sort, int min, int max) {
		T element, temp;
		int left, right, mid;
		
		left = min;
		right = max;
		mid = (min + max)/2;
		
		element = sort[mid];
		byttElement(sort, mid, min);
		
		while(left < right) {
			while(left < right && sort[left].compareTo(element) <= 0) {
				left++;
			}
			while(sort[right].compareTo(element) > 0) {
				right--;
			}
			
			if(left < right) {
				byttElement(sort, left, right);
			}
		}
		byttElement(sort, min, right);
		return right;
	}
	
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
	
	private static <T extends Comparable<T>> void byttElement(T[] sort, int i, int j) {
		T key = sort[i];
		sort[i] = sort[j];
		sort[j] = key;
	}
	
	public static <T extends Comparable<T>> void kvikkSortNy(T[] data) {
		kvikkSortNy(data, 0, data.length -1);
		sorteringVedInnsetting(data);
	} 
	
	static final int MIN = 10;
	
	public static <T extends Comparable<T>> void kvikkSortNy(T[] data, int min, int maks) {
		int posPartisjon;
		
		if (maks -min + 1 > MIN) {	//antall elementer > MIN ? 
			posPartisjon = findPartition(data, min, maks);
			kvikkSortNy(data, min, posPartisjon -1);
			kvikkSortNy(data, posPartisjon + 1, maks);
		}
	}// metode
	
	public static <T extends Comparable<T>> void sorteringvedInnsettingNy() {
		
	}

}
