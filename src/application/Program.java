package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department obj = new Department(1, "Vendas");
		
		Seller seller = new Seller(100,"John","john@gmail", new Date(sdf.parse("10/04/1990").getTime()), 3000.00,obj);
		System.out.println(seller);
	}

}
