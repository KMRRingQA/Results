package com.qa.main;

public class Q2_ResultsWithFail {
	void showPercent(double physics, double chemistry, double Biology) {
		double percent = (physics + chemistry + Biology) / 4.5;
		System.out.println("You scored %" + percent);
		if (percent < 60) {
			System.out.println("You have failed the semester.");
		}
		System.out.println("\n");
	}

	void showResults(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		System.out.println("Results: \n" + " Physics:\t" + physics + "\n Chemistry:\t" + chemistry + "\n Biology:\t"
				+ biology + "\n Total:\t\t" + total);
	}
}