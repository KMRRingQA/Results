package com.qa.main;

public class Q4_ResultsWithFailCount {
	void showResults(int Physics, int Chemistry, int Biology) {
		int Total = Physics + Chemistry + Biology;
		System.out.println("Results: \n" + " Physics:\t" + Physics + "\n Chemistry:\t" + Chemistry  + "\n Biology:\t" + Biology + "\n Total:\t\t" + Total);
	}
	void showPercent(double Physics, double Chemistry, double Biology) {
		double Percent = (Physics + Chemistry + Biology) / 4.5;
		System.out.println("You scored %" + Percent);
		int failCount = 0;
		if (Percent<60) {
			System.out.println("You have failed the semester, as your overall score is below 60%.");
		}
		if (Physics < 90) {
			failCount++;
		}
		if (Chemistry < 90) {
			failCount++;
		}
		if (Biology < 90) {
			failCount++;
		}
		if (failCount > 0) {
			System.out.println("You have failed the semester, as you have failed in " + failCount + " of your examinations.");
		}

	}
	
}