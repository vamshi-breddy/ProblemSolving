package com.builderPattern;

public class BuilderPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ClaimsCalculator cc = new ClaimsCalculator.ClaimsBuilder("CLA-123", "vamshi", "sunday", "200").address("Hyd").age("25").build();
      
     ClaimsCalculator cc1 = new ClaimsCalculator.ClaimsBuilder("CLA-224", "reddy", "monday", "250").address("Ban").age("27").location("Telangana")
    		 .limits("NO_LIMITS").build();
     
     System.out.println(cc);
     System.out.println();
     System.out.println(cc1);
     
	}

}
