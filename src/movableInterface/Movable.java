package movableInterface;

import exceptions.*;

/**
 * Specifies that a geometric form is movable in a 2D plain.
 */
public interface Movable {

	static final int PLAIN_X_MAX = 1000;
	static final int PLAIN_Y_MAX = 1000;
	static final int PLAIN_X_MIN = -1000;
	static final int PLAIN_Y_MIN = -1000;

	/**
	 * Moves the form up in the plain. The implementation should take care of
	 * how much will this movement be.
	 * @throws TooHigh 
	 * @throws LimitExceeded 
	 */
	void moveUp() throws TooHigh, LimitExceeded;

	/**
	 * Moves the form down in the plain. The implementation should take care of
	 * how much will this movement be.
	 * @throws TooLow 
	 * @throws LimitExceeded 
	 */
	void moveDown() throws TooLow, LimitExceeded;

	/**
	 * Moves the form left in the plain. The implementation should take care of
	 * how much will this movement be.
	 * @throws TooLeft 
	 * @throws LimitExceeded 
	 */
	void moveLeft() throws TooLeft, LimitExceeded;

	/**
	 * Moves the form right in the plain. The implementation should take care of
	 * how much will this movement be.
	 * @throws TooRight 
	 * @throws LimitExceeded 
	 */
	void moveRight() throws TooRight, LimitExceeded;

	/**
	 * Moves the form up in the plain with the specified number of points.
	 * 
	 * @param howMuch
	 *            the number of points to move up in the plain
	 * @throws TooHigh 
	 * @throws InvalidValue 
	 * @throws LimitExceeded 
	 */
	void moveUp(int howMuch) throws TooHigh, InvalidValue, LimitExceeded;

	/**
	 * Moves the form down in the plain with the specified number of points.
	 * 
	 * @param howMuch
	 *            the number of points to move down in the plain
	 * @throws TooLow 
	 * @throws InvalidValue 
	 * @throws LimitExceeded 
	 */
	void moveDown(int howMuch) throws TooLow, InvalidValue, LimitExceeded;

	/**
	 * Moves the form left in the plain with the specified number of points.
	 * 
	 * @param howMuch
	 *            the number of points to move left in the plain
	 * @throws TooLeft 
	 * @throws InvalidValue 
	 * @throws LimitExceeded 
	 */
	void moveLeft(int howMuch) throws TooLeft, InvalidValue, LimitExceeded;

	/**
	 * Moves the form right in the plain with the specified number of points.
	 * 
	 * @param howMuch
	 *            the number of points to move right in the plain
	 * @throws TooRight 
	 * @throws InvalidValue 
	 * @throws LimitExceeded 
	 */
	void moveRight(int howMuch) throws TooRight, InvalidValue, LimitExceeded;
}
