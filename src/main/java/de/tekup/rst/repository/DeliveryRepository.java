package de.tekup.rst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import de.tekup.rst.model.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
	@Query("SELECT min (d.deliveryDate - d.shoppingDate ) FROM Delivery d")
	public Delivery min();

}
