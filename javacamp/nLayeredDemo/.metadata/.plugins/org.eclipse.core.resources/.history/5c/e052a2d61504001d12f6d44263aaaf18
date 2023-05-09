package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
//loosly-tigthly coupled
public void add(Customer customer) {
	System.out.println("musteri eklendi "+customer.getFirstName());
	Utils.runLoggers(loggers, customer.getFirstName());
	/*Utils utils=new Utils();
	utils.runLoggers(loggers, customer.getFirstName());*/
	/*
	 for(Logger logger:loggers) {
		logger.log(customer.getFirstName());
	}
	*/
	//this.logger.log(customer.getFirstName());
	//DatabaseLogger databaseLogger=new DatabaseLogger();
	//logger.log(customer.getFirstName()+"veri tabanina loglandi");
}
public void delete(Customer customer) {
	System.out.println("musteri silindi "+customer.getFirstName());
	Utils.runLoggers(loggers, customer.getLastName());
	
	/*
	 for(Logger logger:loggers) {
		logger.log(customer.getFirstName());
	}
	*/
	//this.logger.log(customer.getFirstName());
	//DatabaseLogger databaseLogger=new DatabaseLogger();
	//logger.log(customer.getFirstName()+"veri tabanina loglandi");
}
}