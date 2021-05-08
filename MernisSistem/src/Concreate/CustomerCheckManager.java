package Concreate;

import Abstract.PersonCheckService;
import Entities.Customer;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true ;
		
	}

}
