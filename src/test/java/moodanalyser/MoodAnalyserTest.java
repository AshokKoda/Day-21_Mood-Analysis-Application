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
}
