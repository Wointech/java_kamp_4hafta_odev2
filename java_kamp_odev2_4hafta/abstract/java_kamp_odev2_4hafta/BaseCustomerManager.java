package java_kamp_odev2_4hafta;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println(customer.getFirstName()+" veri tabanýna kaydedildi");
		
	}

}
