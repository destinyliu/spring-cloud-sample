package me.destinyshine.scshop.orders.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author destinyliu
 */
@FeignClient(name = "xx", fallback = CommondityClient.CommondityClientFallback.class)
public interface CommondityClient {

    @Component
    class CommondityClientFallback implements CommondityClient {
    }
}
