package com.assignment13;

import java.util.Scanner;

public class AccountImpl implements Account {

	@Override
	public void getSavingAccount() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println("enter balance");
		float bal=scanner.nextInt();
		
		AccountImpl accountImpl=new AccountImpl();
		accountImpl.getUserDetails(name,bal);
		
	}

	@Override
	public void getUserDetails(String name, float balance) {
		
		System.out.println("account holder name:"+name);
		
		System.out.println("account balance:"+balance);
		
	}

}
