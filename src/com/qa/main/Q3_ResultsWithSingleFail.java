package com.qa.main;

public class Q3_ResultsWithSingleFail {
	void showResults(int Physics, int Chemistry, int Biology) {
		int Total = Physics + Chemistry + Biology;
		System.out.println("Results: \n" + " Physics:\t" + Physics + "\n Chemistry:\t" + Chemistry  + "\n Biology:\t" + Biology + "\n Total:\t\t" + Total);
	}
	void showPercent(double Physics, double Chemistry, double Biology) {
		double Percent = (Physics + Chemistry + Biology) / 4.5;
		System.out.println("You scored %" + Percent);
		if (Percent<60) {
			System.out.println("You have failed the semester, as your overall score is below 60%.");
		}
		else if (Physics < 90) {
			System.out.println("Despite scoring above 60% overall, you have failed the semester because you failed Physics.");
		}
		else if (Chemistry < 90) {
			System.out.println("Despite scoring above 60% overall, You have failed the semester because you failed Chemistry.");
		}
		else if (Biology < 90) {
			System.out.println("Despite scoring above 60% overall, You have failed the semester because you failed Biology.");
		}
		System.out.println("\n");
	}
	
}