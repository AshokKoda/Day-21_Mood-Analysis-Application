package moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	MoodAnalyser moodAnalyser;
	String message = "I am in happy mood";
	String result;
	
	@Test
    public void respondAsSadMood() throws MoodAnalsyerException
    {
        moodAnalyser = new MoodAnalyser("I am in sad Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",result);
    }
	
	@Test
    public void respondAsHappyMood() throws MoodAnalsyerException
    {
        moodAnalyser = new MoodAnalyser("I am in Any Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
	
	@Test
    public void givenNullMood_shouldReturnHappy() throws MoodAnalsyerException
    {
        moodAnalyser = new MoodAnalyser(null);
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
	
	@Test
    public void nullMood_ShouldThrowCustomException()
    {
        try
        {
            moodAnalyser = new MoodAnalyser();
            result = moodAnalyser.analyseMood(null);
        }
        catch (MoodAnalsyerException e)
        {
            Assert.assertEquals(MoodAnalsyerException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
	
	@Test
    public void nullMood_ShouldThrowCustomExceptionWithExceptionType()
    {
        try
        {
            moodAnalyser = new MoodAnalyser();
            result = moodAnalyser.analyseMood(" ");
        }
        catch (MoodAnalsyerException e)
        {
            Assert.assertEquals(MoodAnalsyerException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}
