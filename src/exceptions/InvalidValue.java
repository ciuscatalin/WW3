package exceptions;

@SuppressWarnings("serial")
public class InvalidValue extends GeneralException {
	public InvalidValue(String string) {
		super(string);
	}
}
