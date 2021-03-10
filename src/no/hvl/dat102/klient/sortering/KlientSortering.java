package no.hvl.dat102.klient.sortering;

import java.util.Arrays;
import no.hvl.dat102.sortering.SorteringVedInnsetting;
import no.hvl.dat102.sortering.UtvalgsSortering;
import no.hvl.dat102.sortering.BobleSortering;
import no.hvl.dat102.sortering.KvikkSortering;
import no.hvl.dat102.sortering.FletteSortering;

public class KlientSortering {

	public static void main(String[] args) {
		Integer[] testTab = {9, 6, 4, 1, 2, 10, 0, 7, 8, 5};
		
		SorteringVedInnsetting.sorteringVedInnsetting(testTab);
		System.out.println("Sortering ved innsetting: " + Arrays.toString(testTab));
		
		UtvalgsSortering.utvalgsSortering(testTab);
		System.out.println("Sortering ved utvalg: " + Arrays.toString(testTab));
		
		BobleSortering.bobleSortering(testTab);
		System.out.println("Boblesortering: " + Arrays.toString(testTab));
		
		KvikkSortering.kvikkSortering(testTab);
		System.out.println("Kvikksortering: " + Arrays.toString(testTab));
		
		FletteSortering.fletteSortering(testTab);
		System.out.println("Flettesortering: " + Arrays.toString(testTab));

	}

}
