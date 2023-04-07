package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(10, "Lucas" );
		
		Seller seller = new Seller(2,"Rafael","rafael@gmail",new Date(), 300.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		
		
		System.out.println(seller);
	}

}
