package com.devsuperior.exercicio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.exercicio.entities.Order;

@Service
public class ShippingService {

    // Responsável pelas operações referentes a frete

    public double shipment(Order order) {
        if (order.getBasic() < 100) {
            return 20.0;
        } else if (order.getBasic() < 200) {
            return 12.0;
        } else {
            return 0;
        }
    }

    public ShippingService() {
    }

}
