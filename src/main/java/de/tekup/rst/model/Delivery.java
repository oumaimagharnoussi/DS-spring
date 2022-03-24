package de.tekup.rst.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Delivery implements Serializable {


	public Long getIdDelivery() {
		return idDelivery;
	}
	public void setIdDelivery(Long idDelivery) {
		this.idDelivery = idDelivery;
	}
	public String getDelivery_man() {
		return delivery_man;
	}
	public void setDelivery_man(String delivery_man) {
		this.delivery_man = delivery_man;
	}
	public Date getShoppingDate() {
		return shoppingDate;
	}
	public void setShoppingDate(Date shoppingDate) {
		this.shoppingDate = shoppingDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idDelivery;
	String delivery_man;
	@Temporal(TemporalType.DATE)
	@NonNull Date shoppingDate;
	@Temporal(TemporalType.DATE)
	@NonNull Date deliveryDate;



}