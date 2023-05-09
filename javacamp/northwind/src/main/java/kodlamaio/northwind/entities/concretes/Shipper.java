package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="shippers")
@AllArgsConstructor
@NoArgsConstructor
public class Shipper  {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="shipper_id")
	  private short shipperId;
	  
	  @Column(name="companyName")
	  private String companyName;
	  
	  @Column(name="phone")
	  private String phone;
}
