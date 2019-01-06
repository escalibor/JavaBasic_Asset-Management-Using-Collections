package com.cg.asset.ui;

import java.util.Scanner;

import com.cg.asset.bean.BondBean;
import com.cg.asset.bean.CashBean;
import com.cg.asset.bean.EquityBean;
import com.cg.asset.exception.AssetException;
import com.cg.asset.service.AssetService;

public class ClientUI {

	static AssetService serv = new AssetService();
	static Scanner in = new Scanner(System.in);
	static CashBean cashAmt = new CashBean();
	
	public static void main(String args[]) throws AssetException {
		
		serv.defaultDetails();
		
		while(true) {
		showMainMenu();
		
		
		
		int choice = in.nextInt();
		
		switch(choice) {
		
			case 1: 
				
				System.out.println("Displaying all assets and its worth");
				serv.viewAssetDetails();
				break;
				
				
			case 2: 
				
				System.out.println("Select the asset that you want to view");
				
				showAssets();
				int choice2 = in.nextInt();
				chooseOption(choice2);
				break;
				
			case 3:
				
				System.out.println("Select the asset where you want to add");
				showAssets();
				int choice3 = in.nextInt();
				chooseOptionAdd(choice3);
				break;
				
				
			case 4:
				
				System.out.println("Select the asset that you want to remove");
				showAssets();
				int choice4 = in.nextInt();
				chooseOptionDelete(choice4);
				break;
				
			}
				
		}
		
		
		
	}
public static void chooseOptionDelete(int num) throws AssetException{
	
	switch(num) {
	
	case 1: System.out.println("Choose the id to delete from equity");
			int value = in.nextInt();
			serv.removeEquityDetails(value);
			break;
			
	case 2: System.out.println("Choose the id to delete from bond");
			int value1 = in.nextInt();
			serv.removeBondDetails(value1);
			break;
			
	case 3: System.out.println("Chose to delete Cash field");
			serv.removeCashDetails();
			break;
	
	
	}
	
}

public static void chooseOptionAdd(int num) throws AssetException{
		
		switch(num) {
		
		case 1: System.out.println("You chose Equity");
		
				int id;
				String name;
				int unitPrice=0;
				int noOfUnits=0;
				int total = 0;
				
				System.out.println("Enter id");
				id = in.nextInt();
				System.out.println("Enter name");
				name = in.next();
				System.out.println("Enter unit price");
				unitPrice = in.nextInt();
				System.out.println("Enter no of units");
				noOfUnits = in.nextInt();
				total = unitPrice * noOfUnits;
				
				EquityBean temp = new EquityBean(id,name,unitPrice,noOfUnits,total);
				
				try {
					serv.isValidEquity(temp);
				}
				catch(AssetException e) {
					System.err.println(e.getMessage() + " Please try Again.....");
				}
				
				serv.addEquitydetails(temp);	
										
				break;
		
		case 2: System.out.println("You chose Bond");
				
				int id1;
				String name1;
				int amount = 0;
				int interestRate = 0;
				int tenure = 0;
				int total1 = 0;
				
				System.out.println("Enter id");
				id1 = in.nextInt();
				System.out.println("Enter name");
				name1 = in.next();
				System.out.println("Enter amount");
				amount = in.nextInt();
				System.out.println("Enter interest rate");
				interestRate = in.nextInt();
				System.out.println("Enter tenure");
				tenure = in.nextInt();
				total1 = amount + ((amount*interestRate*tenure)/100);
				
				BondBean temp1 = new BondBean(id1,name1,amount,interestRate,tenure,total1); 
				
				
				try {
					serv.isValidBond(temp1);
				}
				catch(AssetException e) {
					System.err.println(e.getMessage() + " Please try Again.....");
				}
				
				serv.addBondDetails(temp1);
		
				break;
		
		case 3: System.out.println("You chose Cash");
				
				int cash;
				System.out.println("Enter amount");
				cash = in.nextInt();
				
				serv.addCashDetails(cash);
				
				break;
		
		}
		
		
	}

	
public static void chooseOption(int num) throws AssetException{
	
	switch(num) {
	
	case 1: System.out.println("You chose Equity");
			serv.viewEquityDetails();
			break;
	
	case 2: System.out.println("You chose Bond");
			serv.viewBondDetails();
			break;
	
	case 3: System.out.println("You chose Cash");
			serv.viewCashDetails();
			
			break;
	
	}
	
	
}
	
public static void showAssets() {
		
		System.out.println("1. Equity");
		System.out.println("2. Bond");
		System.out.println("3. Cash");
		
	}


public static void showMainMenu() {
	
		System.out.println("1. Display all assets with amount");
		System.out.println("2. Display the selected asset");
		System.out.println("3. Add an asset");
		System.out.println("4. Remove the asset");
	}


}



