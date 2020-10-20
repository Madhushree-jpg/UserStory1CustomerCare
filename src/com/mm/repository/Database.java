package com.mm.repository;

import java.util.ArrayList;
import java.util.List;

import com.mm.model.Complaints;
import com.mm.model.Customer;

public class Database {
	
		public static Customer [] customerDB;
		Complaints complaints;
		public List<String> complaintList;
		
		

		
		  public Database()
		  {
			  Complaints [] complaints1= {new Complaints(1,1,"t1","s1"),new Complaints(1,2,"t2","s1"),new Complaints(1,3,"t3","s3")}; 
			  Complaints [] complaints2=	{new Complaints(2,1,"t1","s1"),new Complaints(2,2,"t2","s1"),new Complaints(3,3,"t3","s3")}; 
			  Complaints [] complaints3= {new Complaints(3,1,"t1","s1"),new Complaints(3,2,"t2","s1")};
		  
		  
			  customerDB=new Customer[3]; 
			  customerDB[0]=new Customer(1,"Riya",complaints1);
			  customerDB[1]=new Customer(2,"Priya",complaints2); 
			  customerDB[2]=new Customer(3,"Diya",complaints3); 
			  

				complaintList=new ArrayList<String>();
				complaintList.add("1.Refund not done\n");
				complaintList.add("2.Damaged Product\n");
				complaintList.add("3.Late Delivery\n");
				complaintList.add("4.Missing Item\n");
				complaintList.add("5.Return Issue\n");
				complaintList.add("6.Others\n");
				
				

		  }
		public void chooseComplaint()
			{
				System.out.println(complaintList);
			}
	


}
