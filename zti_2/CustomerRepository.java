package run;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	 List<Customer> findByName(String name);
	 List<Customer> findByNameOrderByTel(String name);
	 List<Customer> findByNameAndCity(String name, String city);
	 List<Customer> findByNameOrCity(String name, String city);
	 
	 
	 @Query("SELECT c FROM customer c WHERE c.name = :searchName")
	 public List<Customer> findByNameAnnotation(@Param("searchName") String searchName);
	 
	 @Query("SELECT c FROM customer c WHERE c.name = :searchName ORDER BY tel")
	 public List<Customer> findByOrderByTelAnnotation(@Param("searchName") String searchName);
	 
	 @Query("SELECT c FROM customer c WHERE c.name = :searchName AND c.city = :searchCity")
	 public List<Customer> findByNameAndCityAnnotation(@Param("searchName") String searchName, @Param("searchCity") String searchCity);
}
