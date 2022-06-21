package com.identifydataType;

public class IdentifyDataType {

	IdentifyDataType(int i){
		System.out.println("Integer Data Type");
	}
	
	IdentifyDataType(Long l){
		System.out.println("long Data Type");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentifyDataType id=new IdentifyDataType(10);
		IdentifyDataType id1=new IdentifyDataType(100L);

	}

}
