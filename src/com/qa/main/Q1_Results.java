package com.qa.main;

public class Q1_Results {
	void showResults(int Physics, int Chemistry, int Biology) {
		int Total = Physics + Chemistry + Biology;
		System.out.println("Results: \n" + " Physics:\t" + Physics + "\n Chemistry:\t" + Chemistry  + "\n Biology:\t" + Biology + "\n Total:\t\t" + Total);
	}
	void showPercent(double Physics, double Chemistry, double Biology) {
		double Percent = (Physics + Chemistry + Biology) / 4.5;
		System.out.println("You scored %" + Percent +"\n");
	}
}