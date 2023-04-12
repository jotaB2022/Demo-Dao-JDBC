package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Seller findyById ====");

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("\n=== Seller findyById ====");
		
		Department department = new Department(2, null);

		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller item : list) {
			System.out.println(item);
		}

		System.out.println("\n=== Seller findAll ====");

		list = sellerDao.findAll();

		for (Seller item : list) {
			System.out.println(item);
		}
		
		System.out.println("\n=== Seller Insert====");
		
		Seller newSeller = new Seller(null,"greg","greg@gmail",new Date(), 400.00, department);
		sellerDao.insert(newSeller);
		
		System.out.println("Id adicionado "+ newSeller.getId());
		
		
		
	}

}
