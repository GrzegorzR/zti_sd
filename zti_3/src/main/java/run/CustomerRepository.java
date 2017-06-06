package run;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(collectionResourceRel = "customer", path = "/customer")
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	 List<Customer> findByName(@Param("name") String name);
	 List<Customer> findByNameOrderByTel(@Param("name") String name);
	 List<Customer> findByNameAndCity(@Param("name") String name, @Param("city") String city);
	 List<Customer> findByNameOrCity(@Param("name") String name, @Param("city") String city);
	 

	 
	 @Query("SELECT c FROM Customer c WHERE c.name = :searchName")
	 public List<Customer> findByNameAnnotation(@Param("searchName") String searchName);
	 
	 @Query("SELECT c FROM Customer c WHERE c.name = :searchName ORDER BY tel")
	 public List<Customer> findByOrderByTelAnnotation(@Param("searchName") String searchName);
	 
	 @Query("SELECT c FROM Customer c WHERE c.name = :searchName AND c.city = :searchCity")
	 public List<Customer> findByNameAndCityAnnotation(@Param("searchName") String searchName,
			 										   @Param("searchCity") String searchCity);
}