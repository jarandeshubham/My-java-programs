package com.inheritanceHerirarchical;

public class Test {

	public static void main(String[] args) {
		
		IciciBank icici=new IciciBank();
		icici.getIciciDetails();
		
		System.out.println();
		
		SbiBank sbiBank=new SbiBank();
		sbiBank.getSbiDetails();
		
		System.out.println();
		
		HdfcBank hdfcBank=new HdfcBank();
		hdfcBank.getHdfcDetails();

	}

}
