package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {

	MoodAnalyser moodAnalyser = new MoodAnalyser();
	
	@Test
	public void testMoodAnalyserPass() throws Exception {
		String mood = moodAnalyser.moodAnalysis("I am in any mood");
		Assert.assertEquals("Happy", mood);
	}

}
