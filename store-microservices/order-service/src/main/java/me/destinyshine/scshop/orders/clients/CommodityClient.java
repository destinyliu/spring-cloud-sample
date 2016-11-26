package me.destinyshine.scshop.orders.clients;

import java.util.List;

import me.destinyshine.scshop.commodity.interfaces.dto.CommodityDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author destinyliu
 */
@FeignClient(name = "xx", fallback = CommodityClientFallback.class)
public interface CommodityClient {

    @RequestMapping("recommended")
    public List<CommodityDTO> getRecommendedCommodities();

    @RequestMapping("")
    public List<CommodityDTO> getCommodities(@RequestHeader("X-Last-Id") String lastId);

}
