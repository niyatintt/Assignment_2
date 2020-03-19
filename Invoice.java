package assignment2;

import java.util.Scanner;

public class Invoice {
	
	
Scanner sc=new Scanner(System.in);
	String partNumber;
	String partDescription;
	int quantity;
	double priceitem;
	double invoiceamount;
	
	public Invoice(){}
//	public Invoice(String partNumber,String partDescription,int quantity,double priceitem) 
//	{
////		this.partNumber=partNumber;
////		this.partDescription=partDescription;
////		this.quantity=quantity;
////		this.priceitem=priceitem;
////		
//	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
		
	}

	public double getPriceitem() {
		return priceitem;
	}

	public void setPriceitem(double priceitem) {
		this.priceitem = priceitem;
	}
	
	public double getInvoice() {
		Invoice inv=new Invoice();
		
		System.out.println("please enter quantity");
//		quantity=sc.nextInt();
		setQuantity(sc.nextInt());
		System.out.println("the quatity you enter is " + inv.getQuantity());

		System.out.println("please enter priceitem");
//		quantity=sc.nextInt();
		setPriceitem(sc.nextDouble());
		System.out.println("the quatity you enter is " + inv.getPriceitem());
		
		if(quantity<0) {
			invoiceamount=0;
			System.out.println("the amount of invoice is"+invoiceamount);
			
		}else if(priceitem<0)
		{
			invoiceamount=0;
			System.out.println("the amount of invoice is"+invoiceamount);
		}
		
		else {
			invoiceamount=quantity*priceitem;
			System.out.println("the amount of invoice is"+invoiceamount);
		}
		
		//invoiceamount=quantity*priceitem;
		
		return invoiceamount;
	}
}
