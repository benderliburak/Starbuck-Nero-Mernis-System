package Abstract;

import Entities.Customer;

public abstract class BaseCustomrManager implements CustomerService{

	@Override
	public  void save(Customer customer) throws Exception  {
		System.out.println("save t : "+customer.getFirstName());
		
	}

}
