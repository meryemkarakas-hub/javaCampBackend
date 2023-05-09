package kodlamaio.northwind.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name="orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order  {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="order_id")
	  private short orderId;
	  
	  @Column(name="customer_id")
	  private String customerId;
	  
	  @Column(name="employee_id")
	  private short employeeId;
	  
	  @Column(name="order_date")
	  private LocalDate orderDate;
	  
	  @Column(name="required_date")
	  private LocalDate requiredDate;
	  
	  @Column(name="shipped_date")
	  private LocalDate shippedDate;
	  
	  @Column(name="ship_via")
	  private short shipVia;
	  
	  @Column(name="freight")
	  private float freight;
	  
	  @Column(name="ship_name")
	  private String shipName;
	  
	  @Column(name="ship_address")
	  private String shipAddress;
	  
	  @Column(name="ship_city")
	  private String shipCity;
	  
	  @Column(name="ship_region")
	  private String shipRegion;
	  
	  @Column(name="ship_postal_code")
	  private String shipPostalCode;
	  
	  @Column(name="ship_country")
	  private String shipCountry;

	  /*@ManyToOne()
	  @JoinColumn(name="ship_via")
	    private Shipper shipper;*/
 }

