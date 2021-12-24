package moodanalyser;

public class MoodAnalyser {

	private String message;
	private String returnMessage;

	public MoodAnalyser() // Default Constructor
	{

	}

	public MoodAnalyser(String message) // Parameterized Constructor
	{
		this.message = message;
	}

	public String analyseMood(String message) throws MoodAnalsyerException {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() throws MoodAnalsyerException {
		try {
			if(message.length() == 0) {
				throw new MoodAnalsyerException(MoodAnalsyerException.ExceptionType.ENTERED_EMPTY,"Please enter right mood");
			}
			
			returnMessage = (message.contains("sad")) ? "SAD":"HAPPY";
			
		}catch (NullPointerException e) {
			return "HAPPY";
		}
		return returnMessage;
	}

}
