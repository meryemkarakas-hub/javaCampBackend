package inheritance;

public class CustomerManager {
	
/*
 public void add(IndividualCustomer customer) {
	System.out.println(customer.customerNumber+" kaydedildi");
}
public void add(CorporateCustomer customer) {
	System.out.println(customer.customerNumber+" kaydedildi");
}
*/
	public static void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi");
}
	//bulk insert

	public static void addMultiple(Customer[] customers) {
		for (Customer customer:customers) {
			add(customer);
	}
		
	}
	
}
//SOLID - Open Closed Principle
