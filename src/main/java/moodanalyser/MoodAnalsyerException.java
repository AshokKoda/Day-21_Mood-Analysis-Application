package moodanalyser;

public class MoodAnalsyerException extends Exception {

	public enum ExceptionType
	{
		ENTERED_NULL,
		ENTERED_EMPTY,
		NO_SUCH_CLASS,
		NO_SUCH_METHOD,
		NO_SUCH_FIELD;
	}
	ExceptionType type;
	
	public MoodAnalsyerException(ExceptionType type, String msg) {
		super(msg);
        this.type = type;
	}
}
