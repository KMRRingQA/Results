package com.qa.main;

public class Q3_ResultsWithSingleFail {
	void showPercent(double physics, double chemistry, double Biology) {
		double percent = (physics + chemistry + Biology) / 4.5;
		System.out.println("You scored %" + percent);
		if (percent < 60) {
			System.out.println("You have failed the semester, as your overall score is below 60%.");
		} else if (physics < 90) {
			System.out.println(
					"Despite scoring above 60% overall, you have failed the semester because you failed Physics.");
		} else if (chemistry < 90) {
			System.out.println(
					"Despite scoring above 60% overall, You have failed the semester because you failed Chemistry.");
		} else if (Biology < 90) {
			System.out.println(
					"Despite scoring above 60% overall, You have failed the semester because you failed Biology.");
		}
		System.out.println("\n");
	}

	void showResults(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		System.out.println("Results: \n" + " Physics:\t" + physics + "\n Chemistry:\t" + chemistry + "\n Biology:\t"
				+ biology + "\n Total:\t\t" + total);
	}

}