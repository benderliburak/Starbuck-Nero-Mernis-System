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
			System.out.println("gercek bir ki�i ");
			super.save(customer);
		}
		else {
		System.out.println("gercek bir ki�i de�il");
		}
		
		
	}

	
	

}
