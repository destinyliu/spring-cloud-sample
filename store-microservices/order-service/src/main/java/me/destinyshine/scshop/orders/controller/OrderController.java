package me.destinyshine.scshop.orders.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import me.destinyshine.scshop.orders.commands.OrderCreateCommand;
import me.destinyshine.scshop.orders.values.OrderVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author destinyliu
 */
@RestController
public class OrderController {

    @RequestMapping(path = "/orders", method = RequestMethod.POST)
    @HystrixCommand(fallbackMethod = "fallback")
    public OrderVO create(OrderCreateCommand command) {
        return new OrderVO();
    }
}
