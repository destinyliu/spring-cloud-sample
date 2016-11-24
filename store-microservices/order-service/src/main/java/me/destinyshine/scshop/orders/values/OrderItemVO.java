package me.destinyshine.scshop.orders.values;

/**
 * @author destinyliu
 */
public class OrderItemVO {

    private Long commodityId;

    private int  quantity;

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
