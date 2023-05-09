package kodlamaio.northwind.api.controllers;
import java.time.LocalDate;
import java.util.List;

//import javax.persistence.criteria.Order;
import kodlamaio.northwind.entities.concretes.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.OrderService;
import kodlamaio.northwind.core.utilities.results.DataResult;


@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
	
	private OrderService orderService;
	
	
	@Autowired
	public OrdersController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@GetMapping("/getOrderByOrderId")
	public DataResult<Order> getOrderByOrderId(@RequestParam short orderId){
		return this.orderService.getOrderByOrderId(orderId);
	}
	
	@GetMapping("/getOrderByCustomerId")
	public DataResult<List<Order>> getOrderByCustomerId(@RequestParam String customerId){
		return this.orderService.getOrderByCustomerId(customerId);
	}
	
	@GetMapping("/getOrderByShipCountry")
	public DataResult<List<Order>> getOrderByShipCountry(@RequestParam String shipCountry){
		return this.orderService.getOrderByShipCountry(shipCountry);
	}
	
	@GetMapping("/getOrderByFreightGreaterThan")
	public DataResult<List<Order>> getOrderByFreightGreaterThan(@RequestParam float freight){
		return this.orderService.getOrderByFreightGreaterThan(freight);
	}
	
	@GetMapping("/getOrderByOrderIdLessThan")
	public DataResult<List<Order>> getOrderByOrderIdLessThan(@RequestParam short orderId){
		return this.orderService.getOrderByOrderIdLessThan(orderId);
	}
	
	
	@GetMapping("/getOrderByDiscountedFreight")
	public DataResult<List<Order>> getOrderByDiscountedFreight(@RequestParam float freight){
		return this.orderService.getOrderByDiscountedFreight(freight);
	}
	
	@GetMapping("/ship-country/{shipCountry}/oriented-country/{orientedCountry}")
	public DataResult<List<Order>> getOrderByShipCountry(@PathVariable String shipCountry,@PathVariable String orientedCountry){
		return this.orderService.getOrderByShipCountry(shipCountry,orientedCountry);
	}
	
	@GetMapping("/ship-via/{shipVia}")
	public DataResult<List<Order>> getOrderByShipVia(@PathVariable short shipVia){
		return this.orderService.getOrderByShipVia(shipVia);
	}
	
	/*@GetMapping("/ship-via/{shipVia}/shipped-date/{shippedDate}")
	public DataResult<List<Order>> getOrderByShipVia(@PathVariable short shipVia,@PathVariable LocalDate shippedDate){
		return this.orderService.getOrderByShipVia(shipVia,shippedDate);
	}*/
}

	
	
