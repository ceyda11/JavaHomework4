import java.time.LocalDate;
import adapter.MerniceServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entites.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		baseCustomerManager.add(new Customer(1, "Ceyda", "Önal", LocalDate.of(2000, 4, 7), "11778556546"));	
	
	}

}
