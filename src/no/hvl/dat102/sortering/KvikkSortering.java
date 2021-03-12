package no.hvl.dat102.sortering;

public class KvikkSortering {

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
	private static <T extends Comparable<T>> void byttElement(T[] sort, int i, int j) {
		T key = sort[i];
		sort[i] = sort[j];
		sort[j] = key;
	}
	
	public static <T extends Comparable<T>> void kvikkSortNy(T[] data) {
		kvikkSortNy2(data, 0, data.length -1);
		SorteringVedInnsetting.sorteringVedInnsetting(data);
		
	} 
	
	static final int MIN = 20;
	
	public static <T extends Comparable<T>> void kvikkSortNy2(T[] data, int min, int max) {
		int posPartisjon;
		
		if (max -min + 1 > MIN) {	//antall elementer > MIN ? 
			posPartisjon = findPartition(data, min, max);
			kvikkSortNy2(data, min, posPartisjon -1);
			kvikkSortNy2(data, posPartisjon + 1, max);
		}
	}// metode
}
