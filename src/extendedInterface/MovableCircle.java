package extendedInterface;

import exceptions.*;
import movableInterface.Movable;

public class MovableCircle implements Movable{
	private int radius;
	private MovablePoint point;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) throws LimitExceeded, InvalidValue{
		if((x - radius) < PLAIN_X_MIN || (x + radius) > PLAIN_X_MAX || (y - radius) < PLAIN_Y_MIN || (y + radius) > PLAIN_Y_MAX)
			throw new LimitExceeded("The cercle out of plan.");
		else if(radius < 1)
			throw new InvalidValue("Values must be positiv.");
		else {
			this.radius = radius;
			this.point = new MovablePoint(x, y, xSpeed,ySpeed);
		}
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws InvalidValue, LimitExceeded {
		if (radius < 1)
			throw new InvalidValue("Values must be positiv.");
		else if((point.getX() - radius) < PLAIN_X_MIN || (point.getX() + radius) > PLAIN_X_MAX || (point.getY() - radius) < PLAIN_Y_MIN || (point.getY() + radius) > PLAIN_Y_MAX)
			throw new LimitExceeded("The circle is out of the plan.");
		else
			this.radius = radius;
	}

	@Override
	public String toString() {
		return "MovableCircle with radius: " + radius + " and a " + this.point.toString();
	}
	
	public String toString1() {
		return "Position of point " + point.toString1() + " with radius: " + radius;
	}
	
	public void moveUp() throws TooHigh, LimitExceeded {
		if ((point.getY() + point.getySpeed() + radius) > PLAIN_Y_MAX) //check if the new Y is ABOVE Y_MAX
			throw new TooHigh("The radius above top.");
		else
			point.setY(point.getY() + point.getySpeed());
	}
	public void moveDown() throws TooLow, LimitExceeded {
		if ((point.getY() - point.getySpeed() - radius) < PLAIN_Y_MIN) //check if the new Y is below Y_MIN
			throw new TooLow("The radius below bottom.");
		else
			point.setY(point.getY() - point.getySpeed());
	}
	public void moveLeft() throws TooLeft, LimitExceeded {
		if ((point.getX() - point.getxSpeed() - radius) < PLAIN_X_MIN) //check if the new X is below X_MIN
			throw new TooLeft("The radius exceed on the left.");
		else
			point.setX(point.getX() - point.getxSpeed());
	}
	public void moveRight() throws TooRight, LimitExceeded {
		if ((point.getX() + point.getxSpeed() + radius) > PLAIN_X_MAX) //check if the new X is above X_MAX
			throw new TooRight("The radius exceed on the right.");
		else
			point.setX(point.getX() + point.getxSpeed());
	}
	public void moveUp(int howMuch) throws TooHigh, InvalidValue, LimitExceeded {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((point.getY() + howMuch + radius) > PLAIN_Y_MAX) //check if the new Y is above Y_MAX
			throw new TooHigh("The radius above top.");
		else
			point.setY(point.getY() + howMuch);
	}
	public void moveDown(int howMuch) throws TooLow, InvalidValue, LimitExceeded {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((point.getY() - howMuch - radius) < PLAIN_Y_MIN) //check if the new Y is below Y_MIN
			throw new TooLow("The radius below bottom.");
		else
			point.setY(point.getY() - howMuch);
	}
	public void moveLeft(int howMuch) throws TooLeft, InvalidValue, LimitExceeded {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((point.getX() - howMuch - radius) < PLAIN_X_MIN) //check if the new X is below X_MIN
			throw new TooLeft("The radius exceed on the left.");
		else
			point.setX(point.getX() - howMuch);
	}
	public void moveRight(int howMuch) throws TooRight, InvalidValue, LimitExceeded {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((point.getX() + howMuch + radius)> PLAIN_X_MAX) //check if the new X is above X_MAX
			throw new TooRight("The radius exceed on the right.");
		else
			point.setX(point.getX() + howMuch);
	}
}
