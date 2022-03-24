package de.tekup.rst.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.tekup.rst.model.Delivery;
import de.tekup.rst.repository.DeliveryRepository;
import de.tekup.rst.repository.ItemRepository;
import de.tekup.rst.repository.OrderDetailRepository;
import de.tekup.rst.repository.OrderRepository;
import de.tekup.rst.serviceInterface.IDeliveryService;


@Service

public class DeliveryServiceImpl implements IDeliveryService {


	@Autowired
	OrderDetailRepository orderDetailRepository;

	@Autowired
	ItemRepository itemRepository;
	@Autowired
	OrderRepository orderRepository;

	@Autowired
	DeliveryRepository deliveryRepository;



	@Override
	public String livraisonRapide() {
		List<Delivery> deliverys = (List<Delivery>) deliveryRepository.findAll();
		Delivery deliveryRapide = deliverys.get(0);
		long diff = deliveryRapide.getDeliveryDate().getTime() - deliveryRapide.getShoppingDate().getTime();
		for (Delivery delivery : deliverys) {

			if(delivery.getDeliveryDate().getTime() - delivery.getShoppingDate().getTime() < diff )
			{
				deliveryRapide = delivery;
			}

		}
		return deliveryRapide.getDelivery_man();
	}

	@Override
	public String livraisonLente() {
		List<Delivery> deliverys = (List<Delivery>) deliveryRepository.findAll();
		Delivery deliverylent = deliverys.get(0);
		long diff = deliverylent.getDeliveryDate().getTime() - deliverylent.getShoppingDate().getTime();
		for (Delivery delivery : deliverys) {

			if(delivery.getDeliveryDate().getTime() - delivery.getShoppingDate().getTime() > diff )
			{
				deliverylent = delivery;
			}

		}
		return deliverylent.getDelivery_man();
	}

}

