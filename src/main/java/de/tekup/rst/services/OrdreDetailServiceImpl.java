package de.tekup.rst.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.tekup.rst.model.Order;
import de.tekup.rst.model.OrderDetail;
import de.tekup.rst.repository.ItemRepository;
import de.tekup.rst.repository.OrderDetailRepository;
import de.tekup.rst.repository.OrderRepository;
import de.tekup.rst.serviceInterface.IOrderDetailService;

@Service

public class OrdreDetailServiceImpl implements IOrderDetailService {


	@Autowired
	OrderDetailRepository orderDetailRepository;

	@Autowired
	ItemRepository itemRepository;
	@Autowired
	OrderRepository orderRepository;

	@Override
	public int calculateTotal() {
		return orderDetailRepository.calculateTotal();

	}

	@Override
	public float calculateWeight(Long idorder) {
		float total_weigt = 0;
		Order order = orderRepository.findById(idorder).orElse(null);
		for(OrderDetail od : order.getOrderDetail())
		{
			total_weigt = total_weigt + (od.getItem().getWeight() * od.getQty());
		}
		return total_weigt;
	}

}