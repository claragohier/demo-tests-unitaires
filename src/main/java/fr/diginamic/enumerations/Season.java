package fr.diginamic.enumerations;

/**
 * Represent a season and 4 instances of seasons.
 * 
 * @author RichardBONNAMY
 *
 */
public enum Season {

	SPRING("Spring", 1), SUMMER("Summer", 2), AUTUMN("Autumn", 3), WINTER("Winter", 4);

	/** label */
	private String label;
	/** number */
	private int number;

	/**
	 * Constructor
	 * 
	 * @param label label
	 * @param number number
	 */
	private Season(String label, int number) {
		this.label = label;
		this.number = number;
	}

	/**
	 * Allows to search Season with her label
	 * 
	 * @param label label
	 * @return {@link Season}
	 */
	public static Season valueOfLabel(String label) {
		Season[] seasons = Season.values();
		for (Season season : seasons) {
			if (season.getLabel().equals(label)) {
				return season;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return number + ". " + label;
	}

	/**
	 * Getter
	 * 
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Getter
	 * 
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
}