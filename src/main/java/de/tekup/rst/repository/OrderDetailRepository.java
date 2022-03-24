package de.tekup.rst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import de.tekup.rst.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{
	@Query("SELECT count (od) FROM OrderDetail od where od.tax > 0")
	public int calculateTotal();


}
