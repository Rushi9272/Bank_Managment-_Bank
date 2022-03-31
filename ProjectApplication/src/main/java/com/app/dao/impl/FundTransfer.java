package com.app.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FundTransfer {
	public static void fundTransfer() throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in =new BufferedReader(reader);
		Scanner sn = new Scanner(System.in);
		String ch="";

		//void ShowMenu(){
		do {
			int choice;
			 System.out.println("=============================================");
			 System.out.println("Press 1 for :- Open New Account");
			 System.out.println("Press 2 for :- Login Existing Account");
			 System.out.println("Press 3 for :- Fund Transfer");
			 System.out.println("=============================================");
	
			
			 
			
				System.out.println("===========================================");
				System.out.println("Enter Your Choice :");
				System.out.println("===========================================");
				
				 choice=sn.nextInt();
				 System.out.println("\n");
				 switch (choice) {
				case 1:
					System.out.println("Enter Your First Name: ");
					String clientFirstName=sn.next();
					System.out.println("Enter Your Last  Name: ");
					String clientLastName =sn.next();
					System.out.println("Enter Your Address: ");
					String address=sn.next();
					System.out.println("Enter Your Phone Number: ");
					long phoneNumber=sn.nextLong();
					System.out.println("Enter Your PAN Card Number: ");
					String panNumber=sn.next();
					System.out.println("Your Account Open Succesfully");
					
					break;
					
				case 2:
					System.out.println("Enter Your Name:");
					String accountHolderName=sn.next();
					System.out.println("Enter Your Account Number:");
					int accountNumber=sn.nextInt();
					System.out.println("Enter Your PIN :");
					int pin=sn.nextInt();
					break;
					
				case 3:
					FundTransfer obj = new FundTransfer();
					break;

					
				default:
					System.out.println("Please Enter Valid Choice :");
					break;
				 }
					System.out.println("record inserted");
				System.out.println("Do you want to continue...(y)");
					
				ch=sn.next();
					}while(ch.equalsIgnoreCase("y"));
		System.out.println("Thank you");
	}
}
	
