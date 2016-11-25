package me.destinyshine.scshop.orders.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.destinyshine.scshop.orders.commands.OrderCreateCommand;
import me.destinyshine.scshop.orders.values.OrderVO;

/**
 * @author destinyliu
 */
@RestController
public class OrderController {

    @RequestMapping(path = "/orders", method = RequestMethod.POST)
    public OrderVO create(OrderCreateCommand command) {
        return new OrderVO();
    }
}
