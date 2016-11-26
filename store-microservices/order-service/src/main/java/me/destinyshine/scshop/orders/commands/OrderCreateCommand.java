package me.destinyshine.scshop.orders.commands;

import java.util.List;

/**
 * @author destinyliu
 */
public class OrderCreateCommand {

    private List<CommodityItem> commodityItems;

    private int        discountedPrice;

    private Long       couponId;

    public List<CommodityItem> getCommodityItems() {
        return commodityItems;
    }

    public void setCommodityItems(List<CommodityItem> commodityItems) {
        this.commodityItems = commodityItems;
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

    /**
     *
     */
    public static class CommodityItem {

        private Long commodityId;

        private int  quantity;

        private int commodityVersion;

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

        public int getCommodityVersion() {
            return commodityVersion;
        }

        public void setCommodityVersion(int commodityVersion) {
            this.commodityVersion = commodityVersion;
        }
    }
}
