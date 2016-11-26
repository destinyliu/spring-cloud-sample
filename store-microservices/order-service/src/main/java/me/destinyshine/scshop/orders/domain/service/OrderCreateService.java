package me.destinyshine.scshop.orders.domain.service;

import me.destinyshine.scshop.orders.commands.OrderCreateCommand;
import me.destinyshine.scshop.orders.domain.Order;
import org.springframework.stereotype.Component;

/**
 * @author destinyliu
 */
@Component
public class OrderCreateService {

    public Order create(OrderCreateCommand command) {
        return null;
    }
}
