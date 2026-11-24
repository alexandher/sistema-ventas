package com.pepito.ProductoService.Configs;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import principalcommons.PedidoEvent;

@Component
public class PedidoEventListener {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void handlePedidoCreated(PedidoEvent pedidoEvent) {
        System.out.println("Mensaje recibido en pedido.queue: " + pedidoEvent);
    }

}
