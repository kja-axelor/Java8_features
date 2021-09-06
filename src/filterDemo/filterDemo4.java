package filterDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	
//	create constructor
	public Product(int id,String name,double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class filterDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		create some collection which is contain the object of Product class, so datatype will be Product
		
		List<Product> productlist = new ArrayList<Product>(); 
		
//		add object into collection
		productlist.add(new Product(1,"HP",65000));
		
		productlist.add(new Product(2,"DELL",56000));
		
		productlist.add(new Product(3,"LENOVA",42000));
		
//  filter according to price < 60000 
		
		 productlist.stream().filter(n -> n.price < 60000).forEach(n -> System.out.println(n.price));
		
		
		
	}

}
