package Concreate;

import Abstract.BaseCustomrManager;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomrManager  {

	PersonCheckService personCheckService; 
	 
	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		
		this.personCheckService = personCheckService;
	}

	public  void save(Customer customer) throws Exception  {
		if (personCheckService.CheckIfRealPerson(customer))
		{
			System.out.println("gercek bir kiþi ");
			super.save(customer);
		}
		else {
		System.out.println("gercek bir kiþi deðil");
		}
		
		
	}

	
	

}
