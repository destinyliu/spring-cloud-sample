package me.destinyshine.scshop.commodity.interfaces.controller;

import java.util.List;

import me.destinyshine.scshop.commodity.interfaces.dto.CommodityDTO;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author destinyliu
 */
@RestController
@RequestMapping("commodities")
public class CommodityController {

    @RequestMapping("recommended")
    public List<CommodityDTO> getRecommendedCommodities() {
        return null;
    }

    @RequestMapping("")
    public List<CommodityDTO> getCommodities(@RequestHeader("X-Last-Id") String lastId) {
        return null;
    }
}
