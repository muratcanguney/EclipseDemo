import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServicesAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(new Customer(1, "Murat Can", "Güney", new Date(1992, 8, 31), "12345678901"));

		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServicesAdapter());
		starbucksCustomerManager.save(new Customer(1, "Murat Can", "Güney", new Date(1992, 8, 31), "12345678901"));
	}
}
