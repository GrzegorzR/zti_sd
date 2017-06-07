package run;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	   
	private String name ;
	private String city ;
	private String email ;
	private String tel ;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public Customer(String name, String city, String email, String tel) {
		this.name = name;
		this.city = city;
		this.email = email;
		this.tel = tel;
	}
	
	public Customer() {
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}