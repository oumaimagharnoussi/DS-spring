package de.tekup.rst.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Customer implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idCustomer;
	float weight;
	String description;
	float price;



	@OneToMany(mappedBy = "customer")
	private Set<Order> order;


}