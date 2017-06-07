package run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer{

	@Autowired
	private CustomerRepository repository;
	
  public static void main(String[] args) {
	  SpringApplication.run(Application.class, args);    
  }
  
  public void run(String... args) throws Exception {

  }
  
  public ArrayList<Customer> createCustomersList(){
	  ArrayList <Customer>  result = new ArrayList<Customer>();
	  result.add((new Customer("Nowak", "Krakow", "nowak@mail","1988123")));
	  result.add((new Customer("Nowak", "Warszawa", "prawilny13@mail","54321376")));
	  result.add((new Customer("Karamazow", "St Petersburg", "kamarazow@mail.ru","1256322")));
	  result.add((new Customer("Yossarian", "Pianosa", "catch@gmail.con","22")));
	  
	  return result;

  }
  
  public void printCustomersList(Iterable<Customer> customers){
	  for (Customer c: customers ){
		  printCustomer(c);
	  }
  }
  public void printCustomer (Customer customer){
	  System.out.println(customer.getId() + " " + customer.getName() + " " +
			  			 customer.getCity() + " " +customer.getEmail() + " " +
			  			 customer.getTel());
  }

}
