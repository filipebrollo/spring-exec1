package com.devsuperior.exercicio;

import com.devsuperior.exercicio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.exercicio.entities.Order;

@SpringBootApplication
public class ExercicioApplication implements CommandLineRunner{

	private final OrderService orderService;

    ExercicioApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);
	}

	@Override 
	public void run (String... args) throws Exception{
		Order order = new Order(1540, 300, 50);

		System.out.println(
			"Pedido código: " + order.getCode() + "\n" + "Valor total: R$" + orderService.total(order));
	}

}
