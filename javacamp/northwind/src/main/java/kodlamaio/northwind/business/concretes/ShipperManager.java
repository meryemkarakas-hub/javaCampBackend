
package kodlamaio.northwind.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ShipperService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.ShipperDao;
import kodlamaio.northwind.entities.concretes.Shipper;


@Service
public class ShipperManager implements ShipperService{

	private ShipperDao shipperDao;
	
	@Autowired
	public ShipperManager(ShipperDao shipperDao) {
		super();
		this.shipperDao = shipperDao;
	}
	

	@Override
	public DataResult<List<Shipper>> getShipperByShipperId(short shipperId) {
		return new SuccessDataResult<List<Shipper>>
		(this.shipperDao.getShipperByShipperId(shipperId), "Shipper Id'ye göre veriler getirildi.");
	}

	
}