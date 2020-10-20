package com.mm.model;
import java.util.Arrays;

public class Customer
{
		int p_id;
		String pname;
		Complaints [] complaints;
		public Customer()
		{
			
		}

		public Customer(int p_id, String pname, Complaints[] complaints)
		{
			super();
			this.p_id = p_id;
			this.pname = pname;
			this.complaints = complaints;
		}

		
		public int getP_id()
		{
			return p_id;
		}

		public void setP_id(int p_id) 
		{
			this.p_id = p_id;
		}

		public String getPname() 
		{
			return pname;
		}

		public void setPname(String pname) 
		{
			this.pname = pname;
		}

		public Complaints[] getComplaints()
		{
			return complaints;
		}

		public void setC(Complaints[] complaints) 
		{
			this.complaints = complaints;
		}

		@Override
		public String toString() 
		{
			return "Customer [Customer Id=" + p_id + ", Customer Name="+ pname + ", Complaint List=" + Arrays.toString(complaints) + "]";
		}
		
	

}
