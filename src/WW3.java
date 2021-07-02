import exceptions.*;
import extendedInterface.*;
/*
 * This is the program, if i missed something
 * please let me know, i'll redo it and 
 * resend. Thanks, keep in touch.
 * */
public class WW3 {
	@SuppressWarnings("unused")
	public static void main(String args[]) throws LimitExceeded, TooHigh, TooLow, TooLeft, TooRight, InvalidValue {
		MovablePoint P = null, P1 = null;
		MovableCircle C = null, C1 = null;
		try {
			//Point test.
			P = new MovablePoint(0, 0, 10, 10); Print("Starting point at: " + P.toString());
			//P1 = new MovablePoint(1001, 1001, 1, 1); //Exceptions case
			P.moveDown(); P.moveDown(15); //P.moveDown(500); P.moveDown(-1); //Exceptions case 
			P.moveUp(); P.moveUp(25); //P.moveUp(500); P.moveUp(-1); //Exceptions case
			P.moveLeft(); P.moveLeft(30); //P.moveLeft(500); P.moveLeft(-1); //Exceptions case
			P.moveRight(); P.moveRight(50); //P.moveRight(500); P.moveRight(-1); //Exceptions case
			
			Print("Point moved to: " + P.toString1());
			
			
			
			//Circle test
			C = new MovableCircle(0, 0, 5, 5, 5); Print("\nStarting circle at: " + C.toString());
			//C1 = new MovableCircle(501, 501, 2, 2, 500); //Exceptions case
			C.moveDown(); C.moveDown(15); //C.moveDown(500); C.moveDown(-1); //Exceptions case
			C.moveUp(); C.moveUp(10); //C.moveUp(500); C.moveUp(-1); //Exceptions case
			C.moveLeft(); C.moveLeft(25); //C.moveLeft(500); C.moveLeft(-1); //Exceptions case
			C.moveRight(); C.moveRight(5); //C.moveRight(500); C.moveRight(-1); //Exceptions case
			C.setRadius(50); //C.setRadius(5000); C.setRadius(-1); //Exceptions case
			
			Print("Circle moved to: " + C.toString1());
		}catch (LimitExceeded e) { 
			Print(e.getMessage());//catch exceptions
		}catch (TooLow e) { 
			Print(e.getMessage());//catch exceptions
		}catch (TooHigh e) {
			Print(e.getMessage());//catch exceptions
		}catch (TooLeft e) {
			Print(e.getMessage());//catch exceptions
		}catch (TooRight e) {
			Print(e.getMessage());//catch exceptions
		}catch (InvalidValue e) {
			Print(e.getMessage());//catch exceptions
		}
	}

	public static void Print(String x) {
		System.out.print(x + "\n");
	}
}
