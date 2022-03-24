package de.tekup.rst.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "order_o")
public class Order {
	public Long getIdOrderr() {
		return idOrderr;
	}

	public void setIdOrderr(Long idOrderr) {
		this.idOrderr = idOrderr;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Set<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Set<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idOrderr;
	
	@Temporal(TemporalType.DATE)
Date createdDate;

@Enumerated(EnumType.ORDINAL)
 OrderStatus orderStatus;
@JsonIgnore
@ToString.Exclude
@OneToMany(mappedBy = "order")
private Set<OrderDetail> orderDetail;

@ManyToOne
Customer customer;

}
