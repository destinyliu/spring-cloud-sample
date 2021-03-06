package me.destinyshine.scshop.orders.domain;

import java.util.List;

import me.destinyshine.commons.AggregateRoot;

/**
 * @author destinyliu
 */
@AggregateRoot
public class Order {

    private Long            id;

    private List<OrderItem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
