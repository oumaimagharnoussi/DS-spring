package de.tekup.rst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.rst.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
