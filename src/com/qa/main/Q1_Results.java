package com.qa.main;

public class Q1_Results {
	void showPercent(double physics, double chemistry, double biology) {
		double percent = (physics + chemistry + biology) / 4.5;
		System.out.println("You scored %" + percent + "\n");
	}

	void showResults(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		System.out.println("Results: \n" + " Physics:\t" + physics + "\n Chemistry:\t" + chemistry + "\n Biology:\t"
				+ biology + "\n Total:\t\t" + total);
	}
}