package me.destinyshine.scshop.commodity.interfaces.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.destinyshine.scshop.commodity.application.CommodityService;
import me.destinyshine.scshop.commodity.domain.Commodity;
import me.destinyshine.scshop.commodity.interfaces.dto.CommodityDTO;


/**
 * @author destinyliu
 */
@RestController
@RequestMapping("commodities")
public class CommodityController {

    @Resource
    private CommodityService commodityService;

    @RequestMapping("recommended")
    public List<Commodity> getRecommendedCommodities() {
        return commodityService.getRecommendedCommodities();
    }

    @RequestMapping("")
    public List<CommodityDTO> getCommodities(@RequestHeader("X-Last-Id") String lastId) {
        return null;
    }
}
