package me.destinyshine.scshop.orders.clients;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author destinyliu
 */
@FeignClient(name = "xx", fallback = CommodityClientFallback.class)
public interface CommodityClient {

}
