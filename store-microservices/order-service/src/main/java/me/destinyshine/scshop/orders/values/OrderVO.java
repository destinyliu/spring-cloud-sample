package me.destinyshine.scshop.orders.values;

import java.util.List;

/**
 * @author destinyliu
 */
public class OrderVO {

    private List<OrderItemVO> orderItems;

    private int               discountedPrice;

    private Long              couponId;

    public List<OrderItemVO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemVO> orderItems) {
        this.orderItems = orderItems;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(int discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

}
