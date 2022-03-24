package de.tekup.rst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.rst.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
