package me.destinyshine.scshop.orders.clients;

import java.util.List;

import me.destinyshine.scshop.commodity.interfaces.dto.CommodityDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author destinyliu
 */
@Component
public class CommodityClientFallback implements CommodityClient {

  @Override
  public List<CommodityDTO> getRecommendedCommodities() {
    return null;
  }

  @Override
  public List<CommodityDTO> getCommodities(@RequestHeader("X-Last-Id") String lastId) {
    return null;
  }
}
