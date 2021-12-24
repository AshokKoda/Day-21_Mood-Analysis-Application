package com.bridgelabz;

public class MoodAnalyser {

	public String moodAnalysis(String msg) {

		if (msg.contains("sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}

	public static void main(String[] args) {
		
		MoodAnalyser moodAnalysis = new MoodAnalyser();
		String mood = moodAnalysis.moodAnalysis("Iam in any mood");
		System.out.println("My mood is: " + mood);

	}

}
