package com.devsuperior.exercicio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.exercicio.entities.Order;

@Service 
public class OrderService {

   // Responsável por operações referentes a pedidos

    private ShippingService shippingService;

    OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total (Order order) {
        return 
            order.getBasic() + shippingService.shipment(order) - (order.getBasic() * (order.getDiscount()/ 100));
    }



}
