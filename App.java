package com.epam.loggingdemo;
import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger LOGGER = LogManager.getLogger(App.class);
	public static void main(String args[]){
		Interest interest = new Interest();
		String filename = "ResultInterest.ser";
		Scanner read = new Scanner(System.in);
		LOGGER.info("Enter the principal amount");
		double principalAmount = read.nextDouble();
		LOGGER.info("Enter the duration in years:");
		int time = read.nextInt();
		LOGGER.info("Enter rate of interest:");
		double rate = read.nextDouble();
		LOGGER.info("Enter number of compounded times:");
		int compoundedtimes = read.nextInt();
		try{
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(interest);
			LOGGER.info("\nCompound interest:"+interest.compoundInterest(principalAmount, time, rate, compoundedtimes));
			LOGGER.info("Simple interest:"+interest.simpleInterest(principalAmount, time, rate));
			out.close();
			file.close();
			LOGGER.info("Object has been serialzed");
		}
		catch(IOException ex){
			LOGGER.info("IOException is caught");
		}
		}
}
