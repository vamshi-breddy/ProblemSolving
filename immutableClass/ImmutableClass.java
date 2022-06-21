package com.immutableClass;

final class ImmutableClass {

	private int i;
	
	ImmutableClass(int i){
		this.i=i;
	}
	public ImmutableClass modify(int i) {
		if(this.i==i) {
			return this;
		}
		else {
			return new ImmutableClass(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ImmutableClass c1=new ImmutableClass(10);
       ImmutableClass c2=c1.modify(100);
       System.out.println(c1==c2);
       ImmutableClass c3=new ImmutableClass(20);
       ImmutableClass c4=c3.modify(20);
       System.out.println(c3==c4);
	}
}
