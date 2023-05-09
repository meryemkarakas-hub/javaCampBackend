package kodlamaio.northwind.dataAccess.abstracts;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.entities.concretes.Order;

public interface OrderDao extends JpaRepository<Order,Integer>{
	
		Order getOrderByOrderId(short orderId);
		List<Order> getOrderByCustomerId(String customerId);
		List<Order> getOrderByShipCountry(String shipCountry);
		List<Order> getOrderByFreightGreaterThan(float freight);
		List<Order> getOrderByOrderIdLessThan(short orderId);
		//List<Order> getOrderByShipCountry(String shipCountry);
		List<Order> getOrderByShipVia(short shipVia);
		//List<Order> getOrderByShipVia(short shipVia,LocalDate shippedDate);
		
		//@Query(value="SELECT o FROM orders o where o.order_id < orderId",nativeQuery=true)
		//@Query("Select o From Order o where o.orderId < orderId)
		
		
		//List<Order> getOrderByDiscountedFreight(float freight);
		//@Query(value="SELECT o.freight FROM orders o where o.freight > freight",nativeQuery=true)
		
		
		
		
		
		

	}
	  
	  