package me.destinyshine.scshop.commodity.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.destinyshine.scshop.commodity.domain.Commodity;

/**
 * @author destinyliu
 */
public interface CommodityRepository extends JpaRepository<Commodity, Long> {

}
