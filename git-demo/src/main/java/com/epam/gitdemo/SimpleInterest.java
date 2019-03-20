package com.epam.gitdemo;

public class SimpleInterest {
	public double calculateSimpleInterest(int principal,int time,int rate_of_interest) {
		return ((principal *time*rate_of_interest)/100);
	}
}
