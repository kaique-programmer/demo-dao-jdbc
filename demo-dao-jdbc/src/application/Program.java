package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Book");
        Seller seller = new Seller(21, "kaique", "kaique@gmail.com", new Date(), 8000.0, department);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(department);
        System.out.println(seller);
    }
}
