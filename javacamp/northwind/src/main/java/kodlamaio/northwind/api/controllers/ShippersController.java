package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ShipperService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Shipper;
//
@RestController
@RequestMapping("/api/shippers")
public class ShippersController {
	
	
	private ShipperService shipperService;
	
	
	@Autowired
	public ShippersController(ShipperService shipperService) {
		super();
		this.shipperService = shipperService;
	}

	@GetMapping("/shipper-id/{shipperId}")
	public DataResult<List<Shipper>> getShipperByShipperId(@PathVariable short shipperId){
		return this.shipperService.getShipperByShipperId(shipperId);
	}
}
	

