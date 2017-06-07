package run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;
	
  public static void main(String[] args) {
	  SpringApplication.run(Application.class, args);    
  }
  
  public void run(String... args) throws Exception {

	  	repository.save(new Customer("Nowak", "Krakow", "nowak@mail","1988123"));
	  	repository.save(new Customer("Nowak", "Warszawa", "prawilny13@mail","54321376"));
		
  }
}
