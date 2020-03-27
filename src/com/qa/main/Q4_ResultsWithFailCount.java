package com.qa.main;

public class Q4_ResultsWithFailCount {
	void showPercent(double physics, double chemistry, double biology) {
		double percent = (physics + chemistry + biology) / 4.5;
		System.out.println("You scored %" + percent);
		int failCount = 0;
		if (percent < 60) {
			System.out.println("You have failed the semester, as your overall score is below 60%.");
		}
		if (physics < 90) {
			failCount++;
		}
		if (chemistry < 90) {
			failCount++;
		}
		if (biology < 90) {
			failCount++;
		}
		if (failCount > 0) {
			System.out.println(
					"You have failed the semester, as you have failed in " + failCount + " of your examinations.");
		}

	}

	void showResults(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		System.out.println("Results: \n" + " Physics:\t" + physics + "\n Chemistry:\t" + chemistry + "\n Biology:\t"
				+ biology + "\n Total:\t\t" + total);
	}

}