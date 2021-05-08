import Concreate.*;
import Entities.*;



import Abstract.*;
import Adapters.MernisServicesAdapter;

public class Main {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
BaseCustomrManager customrManager= new StarbucksCustomerManager(new MernisServicesAdapter());
customrManager.save(new Customer(1,"akýn","kayýþ",1998,"20375222418"));
	}

}
