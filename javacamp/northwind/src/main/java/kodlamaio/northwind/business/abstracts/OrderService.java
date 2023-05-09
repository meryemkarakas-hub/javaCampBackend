package kodlamaio.northwind.business.abstracts;

import java.time.LocalDate;
import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Order;

public interface OrderService {

	DataResult<Order> getOrderByOrderId(short orderId);

	DataResult<List<Order>> getOrderByCustomerId(String customerId);

	DataResult<List<Order>> getOrderByShipCountry(String shipCountry);

	DataResult<List<Order>> getOrderByFreightGreaterThan(float freight);

	DataResult<List<Order>> getOrderByOrderIdLessThan(short orderId);
	
	DataResult<List<Order>> getOrderByDiscountedFreight(float freight);

	DataResult<List<Order>> getOrderByShipCountry(String shipCountry,String orientedCountry);

	DataResult<List<Order>> getOrderByShipVia(short shipVia);

	//DataResult<List<Order>> getOrderByShipVia(short shipVia, LocalDate shippedDate);

	

	

	

	




	

}
