package com.epam.gitdemo;

public class ConstructionCost {
	public double claculateConstructionCost( String material_standard,double area) {
		double estimated_cost = 0;
		if (material_standard.equals("standard")) {
			estimated_cost = area * 1200;
		} else if (material_standard.equals("above standard")) {
			estimated_cost = area * 1500;
		} else if (material_standard.equals("high standard")) {
			estimated_cost = area * 1800;
		} else if (material_standard.equals("high standard and fully automated")){
			estimated_cost = area * 2500;
		}
		else
			estimated_cost = -1;
		return estimated_cost;
	}
}
