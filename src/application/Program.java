package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(10, "Lucas" );
		
		Seller seller = new Seller(2,"Rafael","rafael@gmail",new Date(), 300.0, obj);
		
		System.out.println(seller);
	}

}
