import java.util.Random;

public class ContestOrganizer {

	public static void main(String[] args) {
		ContestOrganizer co = new ContestOrganizer();
		co.createContestants();
		co.sortAllRows();
		co.printScores();
	}

	/** the number of rows of contestant */
	public static final int NUM_ROWS = 10;

	/** the number of columns of contestant */
	public static final int CONTESTANTS_PER_ROW = 10;

	/** the two-dimensional array of contestant */
	private Contestant[][] contestants;

	/**
	 * Sorts arr in increasing order by score Postcondition: - arr sorted in
	 * increasing order by score. - Location of each contestant correctly updated
	 * such that column number matches contestant's position in arr.
	 * 
	 * @param arr
	 *            the array to be sorted.
	 */
	public void sort(Contestant[] arr) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].getScore() > arr[i + 1].getScore()) {
					int x = arr[i].getScore();
					arr[i].setScore(arr[i + 1].getScore());
					arr[i + 1].setScore(x);
					swap = true;
				}
			}
		}
	}

	public void createContestants() {
		Contestant[][] newContestants = new Contestant[10][10];
		int contestantNumber = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Contestant temp = new Contestant(i, j);
				temp.setScore(new Random().nextInt(200));
				// temp.setName("Person " + contestantNumber++);
				newContestants[i][j] = temp;
			}
		}
		this.contestants = newContestants;
	}

	/**
	 * Sorts each row of contestants into increasing order by score. Postcondition:
	 * Contestant with highest score in row[k] is in the rightmost column of row[k],
	 * 0 <= k < NUM_ROWS
	 */
	public void sortAllRows() {
		for (Contestant[] contestants2 : contestants) {
			sort(contestants2);

		}
	}

	public void printScores() {
		for (int i = 0; i < contestants.length; i++) {
			for (int j = 0; j < contestants[i].length; j++) {
				System.out.println(contestants[i][j].getName() + ": " + contestants[i][j].getScore());
			}
			System.out.println("\n\n");
		}

	}

	/**
	 * Returns name of contestant with highest score Precondition: - Contestants
	 * have not been sorted by score. - Top score is unique - Only one contestant
	 * has the highest score.
	 * 
	 * @return name of contestant with highest score.
	 */
	public String findWinnerName() {
		/* code goes here */

		return "";
	}
}
