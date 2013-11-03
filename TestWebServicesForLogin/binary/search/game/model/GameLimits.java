package binary.search.game.model;

public enum GameLimits {
	// minimum and maximum range of numbers
	RANGE (0, 1001),
	// minimum and maximum count of guesses
	NUM_GUESS (0, 10);
	
	private final int lowerLimit;
	private final int upperLimit;
	
	GameLimits( int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}
	public int lowerLimit() { return lowerLimit; }
	public int upperLimit() { return upperLimit; }
	
}
