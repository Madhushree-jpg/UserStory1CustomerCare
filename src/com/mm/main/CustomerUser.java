package com.mm.main;
import java.util.Scanner;

import com.mm.repository.Database;
import com.mm.service.CustomerService;

	public class CustomerUser
	{
		public static void main(String[] args)
		{
			int menu;
			CustomerService service=new CustomerService();

			do {
			System.out.println("Hello Customer!!");
			System.out.println("press 1 for launching a new complaint \n"
					+"press 2 for searching the customer's name by Customer Id \n"
					+ "press 3 for checking all complaints lodged by the same customer\n"
					+"press 4 for exit\n");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the the option of menu: ");
			menu=sc.nextInt();
			System.out.println("your chosen option is: "+menu);
			
			while(menu<1||menu>4)
			{
				System.out.println("please select a valid option");
				System.out.println("press 1 for launching a new complaint \n"
						+"press 2 for searching the customer's name by Customer Id \n"
						+ "press 3 for checking all complaints lodged by the same customer\n");
				menu=sc.nextInt();
				System.out.println("you have entered" +menu);
			}
			switch(menu)
			{
				case 1:
				
					System.out.println("you want to launch a new complaint");
					System.out.println("Choose an option from the list below");
					Database db=new Database();
					db.chooseComplaint();
					service.launchComplaint();
					break;
				
				case 2:
				
					System.out.println("you want to search the customer's name by customer id");
					service.showNames();
					break;
				
				case 3:
				
					System.out.println("you want to check all your complaints");
					service.showAllComplaints();
					break;
					
				case 4:
					System.out.println("You want to exit..Thank you for visiting!!");
					return;
				
				default:
					System.exit(menu);
					return;
				
				}
				
			}
			while(true);
		}

}
