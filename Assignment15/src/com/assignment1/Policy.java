package com.assignment1;

import java.util.Scanner;

public class Policy {

	private int policyId;
	private String policyName;
	private String policyType;
	private int premiumAmount;

	@Override
	public String toString() {
		return "MethodArgument [policy id=" + policyId + ", policy name=" + policyName + ", Policy type=" + policyType + ", Premium amount=" + premiumAmount+"]";
	}
	public Policy getPolicyDetail(int id, String pname, String ptype, int pamount)
	{
		Policy policy=new Policy();
		
		policy.policyId=id;
		policy.policyName=pname;
		policy.policyType=ptype;
		policy.premiumAmount=pamount;
		
		return policy;
	}
	
	public static void main(String[] args) {
		Policy po=new Policy();	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter policy id:");
		int pid=scanner.nextInt();
		System.out.println("eneter policy name:");
		String pname=scanner.next();
		System.out.println("enter policy type:");
		String ptype=scanner.next();
		System.out.println("enter premium amount");
		int pamount=scanner.nextInt();
		
		
		Policy p=po.getPolicyDetail(pid,pname,ptype,pamount);
		
		System.out.println(p);
		
		
		
		
	}
	
	
}
