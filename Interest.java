package com.epam.loggingdemo;

public class Interest {
	public Double simpleInterest(double principal_amount, int time, double rate){
		return (principal_amount*time*rate)/100;
	}
	public Double compoundInterest(double principal_amount, int time, double rate, int compound_times){
		return principal_amount*(Math.pow((1+rate/compound_times), compound_times*time));
	}

}
