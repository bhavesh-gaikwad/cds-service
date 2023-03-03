package com.thinkitive.cdsservice.services;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface CdsService {

    Map<String, Object> getServices();

}
