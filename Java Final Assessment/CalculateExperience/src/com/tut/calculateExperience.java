package com.tut;
import java.time.*;

public class calculateExperience {

		public static void main(String args[]) {
			
			LocalDate joiningdate = LocalDate.of(2021, Month.OCTOBER, 10);
	        LocalDate today = LocalDate.now();
	        
	        Period age = Period.between(joiningdate, today);
	        int years = age.getYears();
	        int months = age.getMonths();
	        int days=age.getDays();
	        
	        System.out.println("number of years: " + years);
	        System.out.println("number of months: " + months);	
	        System.out.println("number of days: " + days);	
	        
		}
	}

