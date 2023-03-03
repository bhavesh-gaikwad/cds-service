package com.thinkitive.cdsservice.repository;

import com.thinkitive.cdsservice.entities.CdsServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CdsServiceRepository extends JpaRepository<CdsServices, UUID> {

    CdsServices findByIsActiveTrueAndHookId(String hookId);

    boolean existsByIsActiveTrueAndHookId(String hookId);

}
