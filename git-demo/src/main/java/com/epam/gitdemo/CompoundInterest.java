package com.epam.gitdemo;

public class CompoundInterest {
	public double calculateCompoundInterest(int principal,int time,int rate_of_interest,int number_of_times) {
		double interest = 0;
		interest = principal * Math.pow((1 + (rate_of_interest / number_of_times)), (number_of_times*time));
		return Math.round(interest * 100.0) / 100.0;
	}
}
