package Adapters;
import tr.gov.nvi.tckimlik.WS.*;
import Abstract.PersonCheckService;
import Entities.Customer;

public class MernisServicesAdapter implements PersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId())
				, customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase()
				,customer.getDateofBirth());
		
	}

}
