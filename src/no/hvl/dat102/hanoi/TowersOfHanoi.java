package no.hvl.dat102.hanoi;

public class TowersOfHanoi {
	
	private int totalDisks;
	private int numberOfMoves;
	
	public TowersOfHanoi(int disks) {
		
		totalDisks = disks;
		numberOfMoves = 0;
	}
	
	/**
	 * 
	 * Calls upon moveTower() to solve the puzzle.
	 * Moves the disks from tower 1 to tower 3 using tower 2 as a temporary tower.
	 * 
	 * */
	
	public void solve() {
		moveTower(totalDisks, 1, 3, 2);
		System.out.println("Antall steg: " + numberOfMoves);
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param numDisk	number of disks to move
	 * @param start		the starting tower
	 * @param end 		the ending tower
	 * @param temp		the temporary tower
	 * 
	 * */
	
	private void moveTower(int numDisks, int start, int end, int temp) {
		
		if(numDisks == 1) {
			//moveOneDisk(start, end);
			numberOfMoves++;
		}
		else {
			moveTower(numDisks-1, start, temp, end);
			//moveOneDisk(start, end);
			moveTower(numDisks-1, temp, end, start);
			numberOfMoves++;
		}
	}
	
	/**
	 * 
	 * Prints each move from the initial start tower to the initial end tower
	 * 
	 * */
	
	private void moveOneDisk(int start, int end) {
		System.out.println("Move one disk from " + start + " to " + end);
	}
	
	public int getNumberOfMoves() {
		return numberOfMoves;
	}
	
}
