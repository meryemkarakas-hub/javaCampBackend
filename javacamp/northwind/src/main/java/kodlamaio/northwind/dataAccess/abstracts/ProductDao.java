package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{
	
	  Product getByProductName(String productName);
	  
	  Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByCategoryIn(List<Integer> categories);
	
	  List<Product> getByProductNameContains(String productName);
	  
	  List<Product> getByProductNameStartsWith(String productName);
	  
	  @Query("From Product where productName=:productName and category.categoryId=:categoryId")
	  List<Product> getByNameAndCategory(String productName, int categoryId);
	  
	  @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
	  		+ "(p.id, p.productName, c.categoryName) "
	  		+ "From Category c Inner Join c.products p")
	  List<ProductWithCategoryDto> getProductWithCategoryDetails();
      
	  @Query(value="SELECT *FROM products p WHERE p.categoryId=?1", nativeQuery=true)
	  List<Product> findByCategoryId(int categoryId);

	  @Query(value="SELECT *FROM products ORDER BY categoryId",nativeQuery=true)
	  List<Product> findByProductsAscAndNumberProducts(int categoryId);
	   
      //String getProductNameById(int id);
	
	  
	  @Query(value="SELECT p.product_name FROM products p where p.product_id=:id ",nativeQuery=true)
	  String getProductNameById(int id);
	 
	  
	 
	
	   
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //select p.productId,p.productName, c.categoryName  from Category c inner join Product p
	  //on c.categoryId = p.categoryId
	  
	 
}
