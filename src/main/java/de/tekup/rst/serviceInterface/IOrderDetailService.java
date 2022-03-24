package de.tekup.rst.serviceInterface;

public interface IOrderDetailService {
	public int calculateTotal() ;
	public float calculateWeight(Long idorder);
}
