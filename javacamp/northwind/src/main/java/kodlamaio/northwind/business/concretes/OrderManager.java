package kodlamaio.northwind.business.concretes;
import java.time.LocalDate;
import java.util.List;

//import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.OrderService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.ErrorDataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.OrderDao;
import kodlamaio.northwind.entities.concretes.Order;


@Service
public class OrderManager implements OrderService{

	private OrderDao orderDao;
	
	@Autowired
	public OrderManager(OrderDao orderDao) {
		super();
		this.orderDao = orderDao;
	}
	
	
	@Override
	public DataResult<Order> getOrderByOrderId(short orderId) {
		return new SuccessDataResult<Order>
		(this.orderDao.getOrderByOrderId(orderId), "Sipariş id'sine göre siparişler başarıyla getirildi.");
	}

	@Override
	public DataResult<List<Order>> getOrderByCustomerId(String customerId) {
		return new SuccessDataResult<List<Order>>
		(this.orderDao.getOrderByCustomerId(customerId), "Müşteri id'sine göre siparişler başarıyla getirildi.");
	}

	@Override
	public DataResult<List<Order>> getOrderByShipCountry(String shipCountry) {
		return new SuccessDataResult<List<Order>>
		(this.orderDao.getOrderByShipCountry(shipCountry), "Gönderilen ülkeye göre siparişler başarıyla getirildi.");
	}


	@Override
	public DataResult<List<Order>> getOrderByFreightGreaterThan(float freight) {
		return new SuccessDataResult<List<Order>>
		(this.orderDao.getOrderByFreightGreaterThan(freight), "Taşıma ücreti girilen taşıma ücretinden büyük olan siparişler getirildi.");
	}
	
	@Override
	public DataResult<List<Order>> getOrderByOrderIdLessThan(short orderId) {
		return new SuccessDataResult<List<Order>>
		(this.orderDao.getOrderByOrderIdLessThan(orderId), "Sipariş id'si girilen id değerinden küçük olan siparişler getirildi.");
	}



	@Override
	public DataResult<List<Order>> getOrderByDiscountedFreight(float freight) {
		List<Order> myFreightList=orderDao.getOrderByFreightGreaterThan(freight);
		for (Order order : myFreightList) {
			float myFreigth = order.getFreight();
			float newFreigth = myFreigth - myFreigth * 0.05f;
			order.setFreight(newFreigth);
			this.orderDao.save(order);
		}
		return new SuccessDataResult<List<Order>>(myFreightList, "Taşıma ücreti girilen taşıma ücretinden büyük olan siparişlere %5 indirim yapıldı");
				
	}


	@Override
	public DataResult<List<Order>> getOrderByShipCountry(String shipCountry,String orientedCountry) {
		List<Order> firstShipCountryList=orderDao.getOrderByShipCountry(shipCountry);
		for(Order order : firstShipCountryList) {
			String firstShipCountry=order.getShipCountry();			
			if(!firstShipCountry.equals(orientedCountry)) {
				order.setShipCountry(orientedCountry);
				this.orderDao.save(order);
			}else {
				return new ErrorDataResult<List<Order>>(firstShipCountryList, "Hata mesajı");
			}
		}
		return new SuccessDataResult<List<Order>>(firstShipCountryList,"Ürünün gönderildiği ülkeden başka bir ülkeye yönlendirildi.");
	}

	
	@Override
	public DataResult<List<Order>> getOrderByShipVia(short shipVia) {
		List<Order> myShipViaList=orderDao.getOrderByShipVia(shipVia);
		for (Order order : myShipViaList) {	
			LocalDate myShippedDate=order.getShippedDate();
			if(myShippedDate!=null) {
			LocalDate newMyShippedDate=myShippedDate.plusWeeks(1);
			order.setShippedDate(newMyShippedDate);
			this.orderDao.save(order);
			}
		}
		return new SuccessDataResult<List<Order>>(myShipViaList,"Ship via'ya göre tarihler bir hafta ileriye alındı.");
	}
	
	/*@Override
	public DataResult<List<Order>> getOrderByShipVia(short shipVia) {
		List<Order> myShipViaList=orderDao.getOrderByShipVia(shipVia);
		for (Order order : myShipViaList) {
			LocalDate myShippedDate=order.getShippedDate();
			LocalDate newMyShippedDate=myShippedDate.plusWeeks(1);
			order.setShippedDate(newMyShippedDate);
			this.orderDao.save(order);
		}
		return new SuccessDataResult<List<Order>>(myShipViaList,"Ship via'ya göre tarihler bir hafta ileriye alındı.");
	}*/
	
	/*@Override
	public DataResult<List<Order>> getOrderByShipVia(short shipVia,LocalDate shippedDate) {
		List<Order> myShipViaList=orderDao.getOrderByShipVia(shipVia, shippedDate);
		for (Order order : myShipViaList) {
			LocalDate myShippedDate=order.getShippedDate();
			LocalDate newMyShippedDate=myShippedDate.plusWeeks(1);
			order.setShippedDate(newMyShippedDate);
			this.orderDao.save(order);
		}
		return new SuccessDataResult<List<Order>>(myShipViaList,"Ship via'ya göre tarihler bir hafta ileriye alındı.");
	}*/

	

}

	
	
	
	
	