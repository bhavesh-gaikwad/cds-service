package com.thinkitive.cdsservice.services.impl;

import com.thinkitive.cdsservice.entities.CdsServices;
import com.thinkitive.cdsservice.mapper.CdsServiceMapper;
import com.thinkitive.cdsservice.repository.CdsServiceRepository;
import com.thinkitive.cdsservice.services.CdsService;
import com.thinkitive.cdsservice.vo.responseVO.CdsServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CdsServiceImpl implements CdsService {

    @Autowired
    CdsServiceRepository cdsServiceRepository;

    @Autowired
    CdsServiceMapper cdsServiceMapper;

    @Override
    public Map<String, Object> getServices() {
        List<CdsServices> cdsServicesDbList = cdsServiceRepository.findAll();
        List<CdsServiceResponse> cdsServiceResponses = cdsServicesDbList.stream().map(cdsServiceMapper::mapResponseFromCdsServices).toList();
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("services", cdsServiceResponses);
        return responseMap;
    }

}
