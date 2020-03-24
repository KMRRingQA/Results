package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Q1_Results results = new Q1_Results();
		results.showResults(30,150,100);
		results.showPercent(30,150,100);
		
		Q2_ResultsWithFail results2 = new Q2_ResultsWithFail();
		results2.showResults(30,100,100);
		results2.showPercent(30,100,100);
		
		Q3_ResultsWithSingleFail results3 = new Q3_ResultsWithSingleFail();
		results3.showResults(50,100,100);
		results3.showPercent(50,140,140);
		
		Q4_ResultsWithFailCount results4 = new Q4_ResultsWithFailCount();
		results4.showResults(50,50,140);
		results4.showPercent(50,50,140);

	}

}
