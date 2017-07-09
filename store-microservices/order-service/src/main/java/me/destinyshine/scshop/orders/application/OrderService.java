package me.destinyshine.scshop.orders.application;

import javax.annotation.Resource;

import me.destinyshine.scshop.orders.clients.CommodityClient;
import me.destinyshine.scshop.orders.commands.OrderCreateCommand;
import me.destinyshine.scshop.orders.domain.Order;
import me.destinyshine.scshop.orders.domain.service.OrderCreateService;
import me.destinyshine.scshop.orders.infra.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author destinyliu
 */
@Service
public class OrderService {

    @Resource
    private CommodityClient    commodityClient;

    @Resource
    private OrderCreateService orderCreateService;

    @Resource
    private OrderRepository    orderRepository;

    /**
     * 处理订单创建，应用层服务，包括对其他外部资源的调用。
     * <p>
     *     这一层只负责大概的应用层事务，和外部资源调用，不负责具体的订单规则。
     *     内部会调用领域层服务，领域层服务内聚了具体的订单业务规则。
     * </p>
     * @param orderCreateCommand
     */
    @Transactional
    public void create(OrderCreateCommand orderCreateCommand) {
        commodityClient.getCommodities("1");
        Order order = orderCreateService.create(orderCreateCommand);
        orderRepository.store(order);
    }

}
