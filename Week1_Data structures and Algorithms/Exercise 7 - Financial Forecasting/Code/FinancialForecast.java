package com.financialforcast;

public class FinancialForecast {
	
	    public static double forecastValue(double presentValue, double growthRate, int years) {
	        if (years == 0) {
	            return presentValue;
	        }
	        return forecastValue(presentValue * (1 + growthRate), growthRate, years - 1);
	    }

	    public static void main(String[] args) {
	        double presentValue = 10000;
	        double growthRate = 0.10;
	        int years = 5;

	        double futureValue = forecastValue(presentValue, growthRate, years);
	        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
	    }

}
