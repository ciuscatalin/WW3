package extendedInterface;

import exceptions.*;
import movableInterface.Movable;

public class MovablePoint implements Movable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) throws LimitExceeded, InvalidValue{
		if (x < PLAIN_X_MIN || x > PLAIN_X_MAX || y < PLAIN_Y_MIN || y > PLAIN_Y_MAX)
			throw new LimitExceeded("The point is out of the plan.");
		else if(xSpeed < 1 || ySpeed < 1)
			throw new InvalidValue("Values must be positiv.");
		else {
			this.x = x;
			this.y = y;
			this.xSpeed = xSpeed;
			this.ySpeed = ySpeed;
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) throws LimitExceeded {
		if(x > PLAIN_X_MAX || x < PLAIN_X_MIN)
			throw new LimitExceeded("The point is out of the plan.");
		else
			this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) throws LimitExceeded {
		if(y > PLAIN_Y_MAX || y < PLAIN_Y_MIN)
			throw new LimitExceeded("The point is out of the plan.");
		else
			this.y = y;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) throws InvalidValue {
		if(xSpeed < 1)
			throw new InvalidValue("Values must be positiv.");
		else
			this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) throws InvalidValue {
		if(ySpeed < 1)
			throw new InvalidValue("Values must be positiv.");
		else
			this.ySpeed = ySpeed;
	}
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	public String toString1() {
		return "Position X: " + x + " // Y: " + y;
	}
	public void moveUp() throws TooHigh {
		if ((this.y + ySpeed)> PLAIN_Y_MAX) 
			throw new TooHigh("The point above top.");
		else
			this.y = this.y + this.ySpeed;
	}
	public void moveDown() throws TooLow {
		if ((this.y - ySpeed)< PLAIN_Y_MIN) 
			throw new TooLow("The point below bottom.");
		else
			this.y = this.y - this.ySpeed;
	}
	public void moveLeft() throws TooLeft {
		if ((this.x - this.xSpeed) < PLAIN_X_MIN) 
			throw new TooLeft("The point exceed on the left.");
		else
			this.x = this.x - this.xSpeed;
	}
	public void moveRight() throws TooRight {
		if ((this.x + this.xSpeed)> PLAIN_X_MAX) 
			throw new TooRight("The point exceed on the right.");
		else
			this.x= this.x + this.xSpeed;
	}
	public void moveUp(int howMuch) throws TooHigh, InvalidValue {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((this.y + howMuch )> PLAIN_Y_MAX) 
			throw new TooHigh("The point above top.");
		else
			this.y = this.y + howMuch;
	}
	public void moveDown(int howMuch) throws TooLow, InvalidValue {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((this.y - howMuch)< PLAIN_Y_MIN) 
			throw new TooLow("The point below bottom.");
		else
			this.y = this.y - howMuch;
	}
	public void moveLeft(int howMuch) throws TooLeft, InvalidValue {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((this.x - howMuch) < PLAIN_X_MIN) 
			throw new TooLeft("The point exceed on the left.");
		else
			this.x = this.x - howMuch;
	}
	public void moveRight(int howMuch) throws TooRight, InvalidValue {
		if(howMuch < 0)
			throw new InvalidValue("Values must be positiv.");
		else if ((this.x + howMuch)> PLAIN_X_MAX) 
			throw new TooRight("The point exceed on the right.");
		else
			this.x = this.x + howMuch;
	}
}
	
