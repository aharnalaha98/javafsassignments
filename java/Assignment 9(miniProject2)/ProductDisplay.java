package bean;

import java.util.ArrayList;

public class Product  implements java.io.Serializable 
	{ 
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public static final ArrayList<Product> list = null;
		public int pid; 
		public String pname;
		public int price;
		public Product() {} 

		public Product(int pid, String pname, int price)
		{}
		
		
	public void setId(int pid) 
    { 
        this.pid = pid; 
    } 

	public int getId() 
    { 
        return pid; 
    } 
	
	public void setpName(String pname) 
    { 
        this.pname = pname; 
    } 

	public String getpName() 
    { 
        return pname; 
    } 
	public void setPrice(int price) 
    { 
        this.price = price; 
    } 

	public int getPrice() 
    { 
        return price; 
    } 
	
}  










package Service;

import Main.ProductOperation;
import bean.Product;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unused")
public class ProductService { 
	

	private static ArrayList<Product> list;


	public static  ArrayList<Product> addProduct()
    { 
		ArrayList<Product> list =new ArrayList<>();
		list.add(new Product(101,"Mobile",20000));
		list.add(new Product(102,"Laptop",70000));
		return(list);
	} 
	
	@SuppressWarnings({ "null" })
	public static void updateProduct() 
	{
		ArrayList<Product> list = null ;
		list.set(0, new Product(104, "Tab",30000));
	}
	
	public static void deleteProduct()
	{
		list = null;
		list.remove(new Product(102,"Mobile",210));
	}
	
	public static ArrayList<Product> displayAllProduct()
	{
		ArrayList<Product> list =new ArrayList<Product>();
		
		return (list);
	}
		
	
		public ArrayList<Product> retrieveProduct()
		{
			ArrayList<Product> list =new ArrayList<Product>();
			list.add(new Product(101,"xyz",120));
			list.add(new Product(102,"ABC",210));
			
			return (list);
			 
			
			   
		}
		
	

} 








package Main;

import java.util.ArrayList;
import java.util.Scanner;



import Service.*;
import bean.Product;


public class ProductDisplay{

	private Object displayAllProduct;

	public static void main(String[] args) {
		int count=0;
		
		ProductService PS=new ProductService();
		 ArrayList<Product> arr = PS.retrieveProduct();
		 	ProductService.displayAllProduct();
		 	ArrayList<Product> list =Product.list;
		 	
		 
		 
}
