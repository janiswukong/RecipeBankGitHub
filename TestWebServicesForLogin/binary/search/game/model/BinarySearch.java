package binary.search.game.model;

import binary.search.game.exceptions.ExcessGuessesException;

public class BinarySearch {
	
	private int guess;
	private int count;
	private int lowBound;
	private int highBound;

	public BinarySearch() {
		count = GameLimits.NUM_GUESS.lowerLimit();
		lowBound = GameLimits.RANGE.lowerLimit();
		highBound = GameLimits.RANGE.upperLimit();
	}

	public int nextGuess() throws ExcessGuessesException {
		incrementCount();
		setGuess((lowBound + highBound) / 2);
		return guess;
	}

	public int tooLow() throws ExcessGuessesException {
		lowBound = getGuess();
		return nextGuess();
	}

	public int tooHigh() throws ExcessGuessesException {
		highBound = getGuess();
		return nextGuess();
	}

	public int getGuess() {
		return guess;
	}

	private void setGuess(int guess) {
		this.guess = guess;
	}

	private void incrementCount() throws ExcessGuessesException {
		count++;
		if ( count > GameLimits.NUM_GUESS.upperLimit() ){
			throw new ExcessGuessesException();
		}
	}

	public int getCount() {
		return count;
	}
}
