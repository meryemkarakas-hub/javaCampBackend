package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Shipper;



public interface ShipperDao extends JpaRepository<Shipper,Integer>{

	List<Shipper> getShipperByShipperId(short shipperId);

}
