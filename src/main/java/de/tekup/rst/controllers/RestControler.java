package de.tekup.rst.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.rst.serviceInterface.IDeliveryService;
import de.tekup.rst.serviceInterface.IOrderDetailService;

@RestController
public class RestControler {
	@Autowired
	IOrderDetailService iOrderDetailService;

	@Autowired
	IDeliveryService iDeliveryService;
	
	@GetMapping("/calculateTotal")
	@ResponseBody
	public int calculateTotal() {
		return iOrderDetailService.calculateTotal();
	}

	@GetMapping("/calculateWeight/{idorder}")
	@ResponseBody
	public float calculateWeight(@PathVariable("idorder") Long idorder) {
		return iOrderDetailService.calculateWeight(idorder);
	}

	@GetMapping("/livraisonRapide")
	@ResponseBody
	public String livraisonRapide() {
		return iDeliveryService.livraisonRapide();
	}
	

	@GetMapping("/livraisonLente")
	@ResponseBody
	public String livraisonLente() {
		return iDeliveryService.livraisonLente();
	}

}