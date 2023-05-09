package inheritance;

public class Main {

	public static void main(String[] args) {
	/*
	Customer customer= new Customer()
    customer.id=1;
	customer.firstName="Meryem";
	customer.lastName="Karakaş";
	customer.nationalIdentity="49546385486";
	customer.customerNumer="120";
	*/
	IndividualCustomer meryem= new IndividualCustomer();
	meryem.customerNumber="12345";
	
	CorporateCustomer hepsiBurada=new CorporateCustomer();
	hepsiBurada.customerNumber="56789";
	
	SendikaCustomer abc= new SendikaCustomer();
	abc.customerNumber="10112";
	
	CustomerManager customerManager= new CustomerManager();
	/*
	customerManager.add(hepsiBurada);
	customerManager.add(meryem);
	customerManager.add(abc);
	*/
	Customer[] customers= {meryem,hepsiBurada,abc};
	CustomerManager.addMultiple(customers);
	}

}
