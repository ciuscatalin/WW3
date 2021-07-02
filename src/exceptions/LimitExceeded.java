package exceptions;

@SuppressWarnings("serial")
public class LimitExceeded extends GeneralException{
	public LimitExceeded(String string) {
		super(string);
	}
}
