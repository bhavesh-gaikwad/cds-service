package com.thinkitive.cdsservice.services.impl;

import com.thinkitive.cdsservice.entities.CdsServices;
import com.thinkitive.cdsservice.mapper.CdsServiceMapper;
import com.thinkitive.cdsservice.repository.CdsServiceRepository;
import com.thinkitive.cdsservice.services.CdsService;
import com.thinkitive.cdsservice.vo.requestVO.PatientGreetingRequest;
import com.thinkitive.cdsservice.vo.responseVO.CardsResponse;
import com.thinkitive.cdsservice.vo.responseVO.CdsServiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
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

    @Override
    public Map<String, Object> patientGreetingService(PatientGreetingRequest patientGreetingRequest) {

        List<CardsResponse> cardsResponses = new ArrayList<>();
        CardsResponse cardsResponse = new CardsResponse();
        cardsResponse.setUuid(UUID.randomUUID().toString());
        String givenName = null;
        try {
            System.out.println("patientGreetingRequest.getPrefetch().getPatient() = " + patientGreetingRequest.getPrefetch().getPatient());
            givenName = patientGreetingRequest.getPrefetch().getPatient().getName().get(0).getGiven().get(0);
        } catch (Exception e) {
            log.error("Invalid Patient Resource. Error: {}", e.getMessage());
        }
        cardsResponse.setIndicator("Now seeing: " + givenName);
        cardsResponse.setSummary("info");
        Map<String, Object> sourceMap = new HashMap<>();
        sourceMap.put("label","Patient greeting service");
        cardsResponse.setSource(sourceMap);
        cardsResponses.add(cardsResponse);
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("cards", cardsResponses);
        return responseMap;
    }

}
