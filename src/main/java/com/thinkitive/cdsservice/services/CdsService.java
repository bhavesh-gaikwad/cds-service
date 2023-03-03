package com.thinkitive.cdsservice.services;

import com.thinkitive.cdsservice.vo.requestVO.PatientGreetingRequest;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface CdsService {

    Map<String, Object> getServices();

    Map<String, Object> patientGreetingService(PatientGreetingRequest patientGreetingRequest);

}
