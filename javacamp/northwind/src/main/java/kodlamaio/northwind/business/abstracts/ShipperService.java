package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Shipper;



public interface ShipperService {
	DataResult<List<Shipper>> getShipperByShipperId(short shipperId);

}
