package oopIntro;

class Main {

	public static void main(String[] args) {
		/*
		 * String[] products= {
				"Lenovo V14",
				"Lenovo V15",
				"Hp 5"
		};
		
			int[] unitsOnStok= {
					3,
					4,
					5
					
			};
			*/
		//String urun1="Lenovo";
	Product product1= new Product(1,"Lenovo V14",15000,"16 GB Ram",10/*13500*/);//Örnek oluşturma,referans oluşturma,intance
	/*
	product1.id=1;
	product1.name="Lenovo V14";
	product1.unitPrice=15000;
	product1.detail="16 GB Ram";
	*/
	
	Product product2= new Product();
	product1.setId(2);
	product1.setName("Lenovo V15");
	product1.setUnitPrice(16000);
	product1.setDetail("32 GB Ram");
	System.out.println(product1.getUnitPriceAfterDiscount());
	
	Category category1= new Category();
	/*
	category1.id =1;
	category1.name="İcecek";
	*/
	category1.setId(1);
	category1.setName("Icecek");
	Category category2= new Category();
	/*
	category2.id=2;
	category2.name="Yiyecek";
	System.out.println(category1.name+"!");
	System.out.println(category2.name+"!");
	*/
	category2.setId(2);
	category2.setName("Yiyecek");
	System.out.println(category1.getName());
	System.out.println(category2.getName());
	/*
	product2.id=2;
	product2.name="Lenovo V15";
	product2.unitPrice=16000;
	product2.detail="32 GB Ram";
	*/
	
	Product product3= new Product();
	/*
	product3.id=3;
	product3.name="Hp 5";
	product3.unitPrice=10000;
	product3.detail="8 GB Ram";
	*/
    /*
    Product[] products= {product1,product2,product3};
   
	for (Product product : products) {
		System.out.println(product.name);
		
	}
    System.out.println(products.length);

	
	
	Category category1= new Category();
	category1.id =1;
	category1.name="Bilgisayar";
	
	Category category2= new Category();
	category2.id=2;
	category2.name="Ev/Bahçe";
	
	ProductManager productManager=new ProductManager();
	productManager.addToCart(product1);
	productManager.addToCart(product2);
	productManager.addToCart(product3);
	*/
	}
		
}

