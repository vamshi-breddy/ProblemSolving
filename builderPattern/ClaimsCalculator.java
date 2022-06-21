package com.builderPattern;

//Builder pattern builds a complex object using simple objects and using a step by step approach
//this type of pattern comes under creational pattern because it provides best possible way to create object


public class ClaimsCalculator {
	
	private final String claimId; //required field
	private final String custId;  //required field
	private final String submitDate; //required field
	private final String amount; //required field
	private final String age; //non required field
	private final String address;  //non required field reference object
	private final String limits; //non required field reference object
	private final String location; //non required field reference object
	
	private ClaimsCalculator(ClaimsBuilder builder) {
	     this.claimId=builder.claimId;
	     this.custId=builder.custId;
	     this.submitDate=builder.submitDate;
	     this.amount=builder.amount;
	     this.age=builder.age;
	     this.address=builder.address;
	     this.limits=builder.limits;
	     this.location=builder.location;
	     
	}
	
	public String getClaimId() {
		return claimId;
	}
	public String getCustId() {
		return custId;
	}
	public String getSubmitDate() {
		return submitDate;
	}
	public String getAmount() {
		return amount;
	}
	public String getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getLimits() {
		return limits;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "ClaimsCalculator [claimId=" + claimId + ", custId=" + custId + ", submitDate=" + submitDate
				+ ", amount=" + amount + ", age=" + age + ", address=" + address + ", limits=" + limits + ", location="
				+ location + "]";
	}
	
	public static class ClaimsBuilder{
		
		private  String claimId; 
		private  String custId;  
		private  String submitDate; 
		private  String amount; 
		private  String age; 
		private  String address;  
		private  String limits; 
		private  String location;
		
		public ClaimsBuilder(String claimId,String custId,String submitDate, String amount) {
			this.claimId=claimId;
			this.custId=custId;
			this.submitDate=submitDate;
			this.amount=amount;
		}
		
		public ClaimsBuilder age(String age) {
			this.age=age;
			return this;
		}
		
		public ClaimsBuilder address(String address) {
			this.address=address;
			return this;
		}
		
		public ClaimsBuilder limits(String limits) {
			this.limits=limits;
			return this;
		}
		
		public ClaimsBuilder location(String location) {
			this.location=location;
			return this;
		}
		
		public ClaimsCalculator build() {
			ClaimsCalculator cl = new ClaimsCalculator(this);
			return cl;
		}
		
	}


}


