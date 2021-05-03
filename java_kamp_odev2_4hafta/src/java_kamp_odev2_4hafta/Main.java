package java_kamp_odev2_4hafta;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Ömer");
		customer.setLastName("yýldýrým");
		customer.setDateOfBirth(1996);
		customer.setNationalityId("1215454512");
	
		CustomerService customerSer = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerSer.save(customer);

	}

}
